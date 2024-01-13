package beenary.dev.collections;

import java.util.Objects;

public class Pokemon {

    private String name;

    private String category;

    private int level;

    public Pokemon(final String name, final String category, final int level) {
        this.name = name;
        this.category = category;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(final String category) {
        this.category = category;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(final int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        final Pokemon pokemon = (Pokemon) o;

        if (level != pokemon.level)
            return false;
        if (!Objects.equals(name, pokemon.name))
            return false;
        return Objects.equals(category, pokemon.category);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + level;
        return result;
    }
}
