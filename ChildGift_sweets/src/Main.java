public class Main {

    public static void main(String[] args) {
        ChildGift Gift = new ChildGift();

        Candies kor = new Candies("Korivka", 12, "condensed_milk", 123, 0.23);
        Candies star_night = new Candies("Zoryana nich", 3, "chocolate", 5, 0.45);
        Candies chamomile = new Candies("Romashka", 15, "chocolate", 23, 0.1);
        Candies bee = new Candies("Bdzilka", 2, "jelly", 90, 0.07);

        Gift.addSweets(kor);
        Gift.addSweets(star_night);
        Gift.addSweets(chamomile);
        Gift.addSweets(bee);
        // Weigth of all sweets
        Gift.CountWeight();
        System.out.println(Gift.GiftWeight + " total weight.");
        //Sorting according to the price
        Gift.SortByPrice();
        System.out.println(Gift + " Sorted by price.");
        //Finds the sweets according to the parameter
        System.out.println(Gift.FindBySugar(0, 0.10) + " are/is at this level of sugar.");
    }
}
