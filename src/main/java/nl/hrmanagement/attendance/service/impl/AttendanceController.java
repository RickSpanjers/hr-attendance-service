package nl.hrmanagement.attendance.service.impl;

import com.google.gson.Gson;
import nl.hrmanagement.attendance.service.IRESTController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@RestController
public class AttendanceController implements IRESTController {

    @Autowired
    private AttendanceServiceProvider attendanceServiceProvider;
    private Gson gson = new Gson();

    @Override
    @PostMapping(
            path = "/request",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity attendanceRequest(@NotNull @RequestBody UUID userId){
        String body = gson.toJson(attendanceServiceProvider.requestAttendance(userId));
        return generateRequestResponse(body);
    }

    @Override
    @GetMapping(path = "/{id}", produces = "application/json")
    @ResponseBody
    public ResponseEntity retrieveAttendances(@PathVariable UUID id) {
        String body = gson.toJson(attendanceServiceProvider.retrieveAttendance(id));
        return generateRequestResponse(body);
    }

    private ResponseEntity generateRequestResponse(String body){
        HttpHeaders headers = new HttpHeaders();
        HttpStatus status = HttpStatus.BAD_REQUEST;
        headers.add("Responded", "Absence Service");
        if(body != null){
            status = HttpStatus.OK;
        }
        return new ResponseEntity<>(body, headers, status);
    }

}
