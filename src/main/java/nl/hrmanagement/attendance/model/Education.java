package nl.hrmanagement.attendance.model;

import java.sql.Timestamp;

public class Education {

    private int id;
    private String name;
    private String description;
    private Timestamp startDate;
    private Timestamp endDate;
    private boolean certificate;
    private User user;

    public Education(int id, String name, String description, Timestamp startDate, Timestamp endDate, boolean certificate, User user) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.certificate = certificate;
        this.id = id;
        this.user = user;
    }

    public Education() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public boolean isCertificate() {
        return certificate;
    }

    public void setCertificate(boolean certificate) {
        this.certificate = certificate;
    }
}
