package nl.hrmanagement.attendance.repository;

import nl.hrmanagement.attendance.model.Attendance;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.QueryHint;
import java.sql.Date;
import java.util.List;
import java.util.UUID;

@Repository
public interface AttendanceRepository extends CrudRepository<Attendance, Integer> {

    @QueryHints(@QueryHint(name= org.hibernate.annotations.QueryHints.CACHEABLE, value="true"))
    List<Attendance> findAllByUserId(UUID userId);

    @Transactional
    void deleteAllByUserId(UUID userId);

    Attendance findByUserIdAndCurrentDay(UUID userId, Date date);
}
