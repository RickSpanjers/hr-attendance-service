package nl.hrmanagement.attendance.service.impl;

import com.google.gson.Gson;
import nl.hrmanagement.attendance.dto.*;
import nl.hrmanagement.attendance.model.Attendance;
import nl.hrmanagement.attendance.repository.AttendanceRepository;
import nl.hrmanagement.attendance.service.IServiceProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.UUID;

@Service
public class AttendanceServiceProvider implements IServiceProvider {

    @Autowired
    private AttendanceRepository attendanceRepository;

    private Logger logger = LoggerFactory.getLogger(AttendanceServiceProvider.class);
    private Gson gson = new Gson();

    @Override
    public GenericResponseDTO requestAttendance(@NotNull UUID userId) {
        GenericResponseDTO result = new GenericResponseDTO(false, "Failure", "Something went wrong, please try again.");
        if(userId != null){
            Date date = Date.valueOf(LocalDate.now());
            validatePreviousDay(userId);
            Attendance attendance  = attendanceRepository.findByUserIdAndCurrentDay(userId, date);
            if(attendance == null){
                Attendance newAttendance = new Attendance(0, Timestamp.valueOf(LocalDateTime.now()), null, date, userId);
                attendanceRepository.save(newAttendance);
                result = new GenericResponseDTO(true, newAttendance, "Successfully checked-in");
            }else{
                attendance.setCheckOut(Timestamp.valueOf(LocalDateTime.now()));
                attendanceRepository.save(attendance);
                result = new GenericResponseDTO(true, attendance, "Successfully checked-out");
            }
        }
        return result;
    }

    @Override
    public GenericResponseDTO retrieveAttendance(UUID userId){
        GenericResponseDTO result = new GenericResponseDTO(false, "Failure", "Could not retrieve any previous attendance");
        if(userId != null){
            List<Attendance> attendances = attendanceRepository.findAllByUserId(userId);
            result = new GenericResponseDTO(true, attendances, "Successfully retrieved attendance");
        }
        return result;
    }

    @Override
    public GenericResponseDTO deleteAttendancesByUser(UUID userId){
        GenericResponseDTO result = new GenericResponseDTO(false, "Failure", "Deleted attendance");
        if(userId != null){
            attendanceRepository.deleteAllByUserId(userId);
            result = new GenericResponseDTO(true, null, "Successfully retrieved attendance");
        }
        return result;
    }

    private void validatePreviousDay(UUID userId){
        Date date = Date.valueOf(LocalDate.now().minus(1, ChronoUnit.DAYS));
        Attendance attendance = attendanceRepository.findByUserIdAndCurrentDay(userId, date);
        if(attendance != null){
            if(attendance.getCheckIn() != null){
                Timestamp timestamp = Timestamp.valueOf(LocalDate.now().atStartOfDay());
                attendance.setCheckOut(timestamp);
                attendanceRepository.save(attendance);
            }
        }
    }

}
