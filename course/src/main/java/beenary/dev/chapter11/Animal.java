package beenary.dev.chapter11;

public class Animal implements Comparable<Animal> {

    private String name;
    private String type;

    public Animal(final String name, final String type) {
        this.name = name;
        this.type = type;
    }

@Override
public int compareTo(final Animal o) {
    if (this.name.length() < o.name.length()) {
        return -1;
    } else if (this.name.length() > o.name.length()) {
        return 1;
    }
    return 0;
}

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

@Override
public String toString() {
    return "Animal{" +
            "name='" + name + '\'' +
            ", type='" + type + '\'' +
            '}';
}
}
