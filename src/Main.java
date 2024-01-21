import java.util.logging.Logger;

/**
 * Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature)
 * выдающий продукт соответствующий имени, объему и температуре
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
 * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре Формат сдачи: Ссылка на гитхаб-проект Подписать фамилию и номер группы
*/
public class Main {
    public static void main(String[] args) {
        HotDrinks2 blackTea = new HotDrinks2("Black Tea", 250, 70);
        HotDrinks2 greenTea = new HotDrinks2("Green Tea", 150, 65);
        HotDrinks2 americano = new HotDrinks2("Americano", 200, 70);

        VendingMachine vending = new VendingMachine();
        vending.addProduct(blackTea);
        vending.addProduct(greenTea);
        vending.addProduct(americano);

        Logger logger = Logger.getAnonymousLogger();

        logger.info(vending.getProduct("Latte", 100, 60));
        logger.info(vending.getProduct("Black Tea", 250, 70));
        logger.info(vending.getProduct("Americano", 200, 70));
        logger.info(vending.getProduct("Green Tea", 150, 65));
        logger.info(vending.getProduct("Cappuccino", 150, 65));
        logger.info(vending.getProduct("Green Tea", 150, 65));
    }
}