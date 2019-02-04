/**
 * Created by Ostap Kharysh on 04.10.2016.
 */
public class Tulips extends Flower {
    // inherites the class Flover
    public Tulips(String type, int stemSize, String color, int numbofdays, double price) {
        this.setType(type);
        this.setColor(color);
        this.setStemSize(stemSize);
        this.setPrice(price);
        this.setNumbofdays(numbofdays);

    }

    public String toString() {
        return this.getType();
    }
}