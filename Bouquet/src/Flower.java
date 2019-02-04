public class Flower {
    // class to be inherited
    public double getStemSize() {
        return stemSize;
    }

    public void setStemSize(int stemSize) {
        this.stemSize = stemSize;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumbofdays() {
        return numbofdays;
    }

    public void setNumbofdays(int numbofdays) {
        this.numbofdays = numbofdays;
    }

    int stemSize = 0;

    private double price = 0;

    int numbofdays = 0;

    private String color = "";

    private String type = "";
}
