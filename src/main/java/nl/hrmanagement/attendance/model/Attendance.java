package nl.hrmanagement.attendance.model;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Entity
@Cacheable
@Table(name = "attendance")
@org.hibernate.annotations.Cache(usage= CacheConcurrencyStrategy.READ_WRITE)
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "checkIn")
    private Timestamp checkIn;
    @Column(name = "checkOut")
    private Timestamp checkOut;
    @Column(name = "day")
    private Date currentDay;
    @Column(name="userId")
    private UUID userId;

    public Attendance(){

    }

    public Attendance(int id, Timestamp checkIn, Timestamp checkOut, Date currentDay, UUID userId) {
        this.id = id;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.currentDay = currentDay;
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Timestamp checkIn) {
        this.checkIn = checkIn;
    }

    public Timestamp getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Timestamp checkOut) {
        this.checkOut = checkOut;
    }

    public Date getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(Date currentDay) {
        this.currentDay = currentDay;
    }

    public UUID getUserId() {
        return userId;
    }

}
