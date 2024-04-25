package dev.beenary.lesson6.inheritance;

public class Developer extends Employee {

    private String seniority;

    private String programmingLanguage;

    public Developer(final String fullName, final String identifier, final String code, final double salary) {
        super(fullName, identifier, code, salary);
    }

    public Developer(final String fullName, final String identifier, final String code, final double salary,
            final String seniority, final String programmingLanguage) {
        super(fullName, identifier, code, salary);
        this.seniority = seniority;
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String getEmployeeInfo() {
        return super.getEmployeeInfo() +
                "\nSeniority: " + seniority;
    }
}

