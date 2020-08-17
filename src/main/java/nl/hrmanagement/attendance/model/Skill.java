package nl.hrmanagement.attendance.model;

public class Skill {

    private int id;
    private String name;
    private String description;
    private User user;

    public Skill() {
    }

    public Skill(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Skill(int id, String name, String description, User user) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.user = user;
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
}
