public class Main {

    public static void main(String[] args) {
        Bouquet branch = new Bouquet();
        Tulips negrita = new Tulips("negrita",15, "pink", 2, 12);
        Tulips princess_irene = new Tulips("princess_irene", 10, "orange", 5, 23.6);
        Tulips sweetheart = new Tulips("sweetheart", 12, "yellow", 17, 1.8);
        Tulips zurel = new Tulips("zurel", 9, "pink", 11, 45);
        Tulips angelique = new Tulips("angelique", 8, "soft-pink", 3, 123.1);

        branch.addFlower(negrita);
        branch.addFlower(princess_irene);
        branch.addFlower(sweetheart);
        branch.addFlower(zurel);
        branch.addFlower(angelique);

        //counts the price of the bouquet
        branch.SumOfFlowers();
        System.out.println(branch.getSum()+" "+ "dollars.");
        //sorts the bouquet by freshnes(days)
        branch.SortByDays();
        System.out.println(branch+ " sorted by freshness.");
        // finds the list of all sterms in size (from, to)
        System.out.println(branch.SearchSterm(10, 17)+ " is/are at the appropriate sterm size.");

        }

        }
