package nl.hrmanagement.attendance.model;

import javax.persistence.*;
import java.sql.Timestamp;

public class Absence {

    private int id;
    private Timestamp startDate;
    private Timestamp endDate;
    private AbsenceType type;
    private AbsenceStatus status;
    private String reason;
    private int userId;


    public Absence() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Absence(int id, Timestamp startDate, Timestamp endDate, AbsenceType type, AbsenceStatus status, String reason, int user) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.status = status;
        this.reason = reason;
        this.userId = user;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public AbsenceType getType() {
        return type;
    }

    public void setType(AbsenceType type) {
        this.type = type;
    }

    public AbsenceStatus getStatus() {
        return status;
    }

    public void setStatus(AbsenceStatus status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }
}
