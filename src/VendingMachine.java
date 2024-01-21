import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class VendingMachine implements VendingMachineInterface {
    private Set<HotDrinks> hotDrinks;
    public VendingMachine (Set<HotDrinks> hotDrinks) {

        this.hotDrinks = hotDrinks;
    }
    public VendingMachine() {

        this(new HashSet<>());
    }

    @Override
    public String getProduct(String name, int volume, int temp) {
        HotDrinks2 findDrink = new HotDrinks2(name, volume, temp);
        Optional<HotDrinks> drinkOpt = hotDrinks.stream().filter(d -> d.equals(findDrink)).findFirst();

        if (drinkOpt.isPresent()) {
            HotDrinks2 drink = (HotDrinks2) drinkOpt.get();
            if (drink.SaleDrink(volume)) {
                return String.format("Ready: %s", findDrink.toString());
            }
            else {
                return String.format("Not enough ingredients: %s. Need %d", drink.toString(), findDrink.getVolume());
            }
        }
        return String.format("Not available: %s", findDrink.toString());
    }

    @Override
    public void addProduct(HotDrinks product) {
        hotDrinks.add(product);
    }
}
