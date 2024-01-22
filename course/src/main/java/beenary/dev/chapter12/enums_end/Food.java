package beenary.dev.chapter12.enums_end;


public class Food {

    private String name;

    private FoodStatus status;

    public Food(final String name) {
        this.name = name;
    }

    public void order() {
        this.status = FoodStatus.ORDERED;
    }

    public void deliver() {
        this.status = FoodStatus.DELIVERED;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public FoodStatus getStatus() {
        return status;
    }

    public void setStatus(final FoodStatus status) {
        this.status = status;
    }
}
