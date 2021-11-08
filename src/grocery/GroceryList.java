package grocery;

import util.Input;

import java.util.ArrayList;

public class GroceryList {

    public static void main(String[] args) {

        //Categories to choose from
        ArrayList<String> categories = new ArrayList<>();
        categories.add("1 - Dairy");
        categories.add("2 - Produce");
        categories.add("3 - Frozen");
        categories.add("4 - Bakery");
        categories.add("5 - Deli");
        categories.add("6 - Seafood");
        categories.add("7 - Other");


        Input gclist = new Input();
        System.out.println("Would you like to make a grocery list?");
        String userresponse = gclist.getString();


    }
}
