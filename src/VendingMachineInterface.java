public interface VendingMachineInterface {
    String getProduct(String name, int volume, int temp);
    void addProduct (HotDrinks product);
}
