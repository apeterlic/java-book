package beenary.dev.chapter6;

public class Architect extends Employee {

    private String type;

    public Architect(String fullName, String identifier, String code, double salary, String type) {
        super(fullName, identifier, code, salary);
        this.type = type;
    }

    // getters and setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
