import java.lang.reflect.Array;

public class ArrayLecture {

    public static void main(String[] args) {
        double[] prices = new double[4];
        final int numberofSides = 6;

        int[] diceSides = new int[numberofSides];
        System.out.println("diceSides.length = " + diceSides.length);
        System.out.println("prices.length = " + prices.length);

        String[] myBag = {"Snickers", "Twix", "Jolly Rancher"};

        System.out.println("myBag.length = " + myBag.length);
//Normal For Loop
        for (int i = 0; i < myBag.length; i++) {
            System.out.println(myBag[i]);
        }
//Enhanced For Loop
        for (String candy: myBag){
            System.out.println(candy + " is the piece of candy you just pulled out!");
        }
//        String[] anotherBag = new String[12];
//        Array.fill(anotherBag, "100 Grand Bar");
//
//        for (String candy: anotherBag){
//            System.out.println(candy);
//        }


        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int[] row : matrix){
            System.out.println("+--+--+--+");
            System.out.print("|");
            for (int n : row){
                System.out.print(n + " | ");
            }
            System.out.println();
        }
        System.out.println("+--+--+--+");
    }
}
