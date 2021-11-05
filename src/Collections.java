import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {
        //Old Way: Not as easy to work with...
//        String [] nameofVar = {"thing1", "thing2", "thing3"};

        ArrayList<String> students = new ArrayList<>();

        students.add("mcKevin");
        students.add("mcKayla");

        System.out.println("students.size() = " + students.size());
        System.out.println(students);

        ArrayList<Integer> myFavoriteNums = new ArrayList<>();

        myFavoriteNums.add(13);
        myFavoriteNums.add(15);
        //Adding at a particular index
        myFavoriteNums.add(0, 3);
        myFavoriteNums.add(45);
        myFavoriteNums.add(15);

        System.out.println(myFavoriteNums);
        //finding at the index of
        System.out.println("myFavoriteNums.indexOf(15) = " + myFavoriteNums.indexOf(15));
        //getting at specific index
        System.out.println("myFavoriteNums.get(2) = " + myFavoriteNums.get(2));
        //does it contain a certain thing
        System.out.println("myFavoriteNums.contains(15) = " + myFavoriteNums.contains(15));
        System.out.println("myFavoriteNums.lastIndexOf(15) = " + myFavoriteNums.lastIndexOf(15));
        //target specific number
        myFavoriteNums.remove((Integer) 21);
        //target index
        myFavoriteNums.remove(4);
        System.out.println("myFavoriteNums = " + myFavoriteNums);

        //HASH MAP
        //HashMAp<keyDatatype, valueDatatype> nameVar = new HashMap<>();

        HashMap<String, String> userNames = new HashMap<>();
        userNames.put("Kevin", "kev2cool");
        userNames.put("Kayla", "kkthebest");

        System.out.println("userNames.get(\"Kevin\") = " + userNames.get("Kevin"));

        //Default is value not found
        System.out.println("userNames.getOrDefault(\"John\", \"noUserFound\") = " + userNames.getOrDefault("John", "noUserFound"));

        System.out.println(userNames);
        System.out.println(userNames.putIfAbsent("Kevin", "kevisgreat"));
        userNames.putIfAbsent("Alex", "majinAlexBoo");
        System.out.println(userNames);
        userNames.remove("Alex");
        System.out.println(userNames);
        userNames.replace("Kevin", "KevintheGOat");
        System.out.println(userNames);
        userNames.clear();
        System.out.println(userNames.isEmpty());
    }
}
