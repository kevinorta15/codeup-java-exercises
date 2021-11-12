package grocery;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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

        HashMap<String, Integer> dairyMap = new HashMap<>();
        HashMap<String, Integer> produceMap = new HashMap<>();
        HashMap<String, Integer> frozenMap = new HashMap<>();
        HashMap<String, Integer> bakeryMap = new HashMap<>();
        HashMap<String, Integer> deliMap = new HashMap<>();
        HashMap<String, Integer> seafoodMap = new HashMap<>();
        HashMap<String, Integer> otherMap = new HashMap<>();


        Input gclist = new Input();
        System.out.println("Would you like to make a grocery list?");
//        String userInput = gclist.getString();

        boolean choice = true;
        while (choice) {
            if (gclist.yesNo()) {
                System.out.println("Enter which category you'd like to add to:");
                System.out.println(categories);
                gclist.getString();
                int choiceNumber = gclist.getInt();

                do {
                    if (choiceNumber == 1) {
                        System.out.println("What would you like to add to the Dairy list?");
                        String userEntry = gclist.getString();
                        System.out.println("How many would you like to add?");
                        int userQuant = gclist.getInt();
                        dairyMap.put(userEntry, userQuant);
                        System.out.println(dairyMap);
                    } else if (choiceNumber == 2) {
                        System.out.println("What would you like to add to the Produce list?");
                        String userEntry = gclist.getString();
                        System.out.println("How many would you like to add?");
                        int userQuant = gclist.getInt();
                        produceMap.put(userEntry, userQuant);
                    } else if (choiceNumber == 3) {
                        System.out.println("What would you like to add to the Frozen list?");
                        String userEntry = gclist.getString();
                        System.out.println("How many would you like to add?");
                        int userQuant = gclist.getInt();
                        frozenMap.put(userEntry, userQuant);
                    } else if (choiceNumber == 4) {
                        System.out.println("What would you like to add to the Bakery list?");
                        String userEntry = gclist.getString();
                        System.out.println("How many would you like to add?");
                        int userQuant = gclist.getInt();
                        bakeryMap.put(userEntry, userQuant);
                    } else if (choiceNumber == 5) {
                        System.out.println("What would you like to add to the Deli list?");
                        String userEntry = gclist.getString();
                        System.out.println("How many would you like to add?");
                        int userQuant = gclist.getInt();
                        deliMap.put(userEntry, userQuant);
                    } else if (choiceNumber == 6) {
                        System.out.println("What would you like to add to the Seafood list?");
                        String userEntry = gclist.getString();
                        System.out.println("How many would you like to add?");
                        int userQuant = gclist.getInt();
                        seafoodMap.put(userEntry, userQuant);
                    } else if (choiceNumber == 7) {
                        System.out.println("What would you like to add to the Other list?");
                        String userEntry = gclist.getString();
                        System.out.println("How many would you like to add?");
                        int userQuant = gclist.getInt();
                        otherMap.put(userEntry, userQuant);
                    }
                } while (gclist.yesNo());
            }
            System.out.println("Do you want to continue adding items? Y/N");
            if(!gclist.yesNo()){
                choice = false;
            }
        }
    }
}
