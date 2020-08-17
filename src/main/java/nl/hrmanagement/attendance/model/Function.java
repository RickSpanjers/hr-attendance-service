package nl.hrmanagement.attendance.model;

public class Function {
    private int id;
    private String name;
    private String description;
    private float wage;

    public Function(int id, String name, String description, float wage) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.wage = wage;
    }

    public Function(){

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

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
