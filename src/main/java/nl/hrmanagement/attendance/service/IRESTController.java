package nl.hrmanagement.attendance.service;

import org.springframework.http.ResponseEntity;
import java.util.UUID;

public interface IRESTController {
    ResponseEntity attendanceRequest( UUID userId);
    ResponseEntity retrieveAttendances(UUID id);
}
