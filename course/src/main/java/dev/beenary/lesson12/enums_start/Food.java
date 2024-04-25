package dev.beenary.lesson12.enums_start;

public class Food {

    private String name;

    private String status;

    public Food(final String name) {
        this.name = name;
    }

    public void order() {
        this.status = "ORDERED";
    }

    public void deliver() {
        this.status = "DELIVERED";
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }
}
