import java.util.Objects;

public class HotDrinks {
    private String name;
    private int volume;
    public HotDrinks(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    public boolean SaleDrink (int volume) {
        if (this.volume >= volume) {
            this.volume -= volume;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Hot Drink " +
                "'" + name + '\'' +
                ", volume: " + volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HotDrinks hotDrinks = (HotDrinks) o;
        return name.equals(hotDrinks.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
