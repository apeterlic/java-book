package beenary.dev.chapter6;

public class Employee {

    private String fullName;

    private String identifier;

    private String code;

    private double salary;

    public Employee(final String fullName, final String identifier, final String code, final double salary) {
        this.fullName = fullName;
        this.identifier = identifier;
        this.code = code;
        this.salary = salary;
    }

    public String getEmployeeInfo() {
        return "Name: " + fullName +
                "\nIdentifier: " + identifier +
                "\nCode: " + code +
                "\nSalary: " + salary;
    }

    // getters and setters

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
