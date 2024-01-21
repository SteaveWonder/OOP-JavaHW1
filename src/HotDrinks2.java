import java.util.Objects;

public class HotDrinks2 extends HotDrinks {
    private int temp;
    public HotDrinks2(String name, int volume, int temp) {
        super(name, volume);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return super.toString() + ", temperature: " + temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HotDrinks2 that = (HotDrinks2) o;
        return temp == that.temp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), temp);
    }
}
