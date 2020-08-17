package nl.hrmanagement.attendance.service;

import nl.hrmanagement.attendance.dto.GenericResponseDTO;
import java.util.UUID;

public interface IServiceProvider {
    GenericResponseDTO requestAttendance(UUID userId);
    GenericResponseDTO retrieveAttendance(UUID userId);
    GenericResponseDTO deleteAttendancesByUser(UUID userId);
}
