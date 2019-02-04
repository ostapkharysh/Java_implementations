import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Ostap Kharysh on 04.10.2016.
 */
public class Bouquet {
    //Class to count bouquet.
    private int max = 2;
    private Flower[] flwrs = new Flower[max];
    private int lastIndex = 0;
    private double sum = 0;

    public void addFlower(Flower nw) {
        //Adds flower
        if (max - 1 < lastIndex) {
            Flower[] newFlwrs = new Flower[max * 2];
            for (int i = 0; i < max; i++) {
                newFlwrs[i] = flwrs[i];
            }
            max *= 2;

            flwrs = newFlwrs;
        }
        flwrs[lastIndex] = nw;
        lastIndex++;
    }

    public void SortByDays() {
        //Sorting by days
        for (int i = 1; i < lastIndex; i++) {
            int x = i;
            while (x > 1) {
                if (flwrs[x - 1].numbofdays > flwrs[x].numbofdays) {
                    Flower flow = flwrs[x - 1];
                    flwrs[x - 1] = flwrs[x];
                    flwrs[x] = flow;
                }
                x -= 1;
            }
        }
    }

    public void SumOfFlowers() {
        //Counts the sum of flowers
        for (int i = 1; i < lastIndex; i++) {
            sum += flwrs[i].getPrice();
        }
    }

    public double getSum() {
        // returns sum
        return sum;
    }

    public ArrayList<Flower> SearchSterm(int from, int to) {
        // finds the list of appropriate sterms to output
        ArrayList<Flower> AppropriateFlower = new ArrayList<Flower>();
        for (int i = 0; i < lastIndex; i++) {
            if (flwrs[i].getStemSize() >= from && flwrs[i].getStemSize() <= to) {
                AppropriateFlower.add(flwrs[i]);
            }
        }
        return AppropriateFlower;
    }


    public String toString() {
        return Arrays.toString(flwrs);
    }
}




