/**
 * Created by Ostap Kharysh on 08.10.2016.
 */
public class Candies extends Confectionery {
    // this class inherites the Confectionary class
    public Candies(String name, double price, String mainIngredient, double weight, double sugar) {
        this.setName(name);
        this.setPrice(price);
        this.setMainIngredient(mainIngredient);
        this.setWeigth(weight);
        this.setSugar(sugar);
    }

    public String toString() {
        return this.getName() ;
    }
}
