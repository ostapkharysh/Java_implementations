import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Ostap Kharysh on 08.10.2016.
 */
public class ChildGift {
    // class to count a Gift
    private int max = 2;
    private Confectionery[] ForChild = new Confectionery[max];
    public double GiftWeight = 0;
    private int LastIndex = 0;


    public void addSweets(Confectionery one) {
        //method to add the sweets
        if (max - 1 < LastIndex) {
            Confectionery[] NewForChild = new Confectionery[max * 2];
            for (int i = 0; i < LastIndex; i++) {
                NewForChild[i] = ForChild[i];
            }
            ForChild = NewForChild;
        }
        ForChild[LastIndex] = one;
        LastIndex++;

    }

    public void SortByPrice() {
        //Insertion Sort method for getting price
        for (int i = 1; i < LastIndex; i++) {
            int x = i;
            while (x >= 1) {
                if (ForChild[x - 1].getPrice() > ForChild[x].getPrice()) {
                    Confectionery sweets = ForChild[x - 1];
                    ForChild[x - 1] = ForChild[x];
                    ForChild[x] = sweets;

                }
                x -= 1;
            }
        }
    }

    public void CountWeight() {
        // counts total weight
        for (int x = 0; x < LastIndex; x++) {
            GiftWeight += ForChild[x].getWeigth();
        }
    }

    public ArrayList<Confectionery> FindBySugar(double from, double to) {
        // returns the list of items correctly put between two values
        ArrayList<Confectionery> SugarList = new ArrayList<Confectionery>();
        for (int z = 0; z < LastIndex; z++) {
            if (ForChild[z].getSugar() >= from && ForChild[z].getSugar() <= to) {
                SugarList.add(ForChild[z]);
            }
        }
        return SugarList;
    }

    public String toString() {
        return Arrays.toString(ForChild);
    }
}

