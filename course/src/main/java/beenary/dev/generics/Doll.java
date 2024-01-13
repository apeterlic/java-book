package beenary.dev.generics;

public class Doll implements Toy {

    private String name;

    public Doll(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
