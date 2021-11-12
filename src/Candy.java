import java.util.Arrays;

public class Candy {

    public String name;
    public String size;
    public String[] descriptor;

    //YOUR MAIN
    public static void main(String[] args) {


        Candy snickers = new Candy("Snickers", "Large", new String[] {"chocolate", "caramel", "chewy"});
        Candy twix = new Candy("Twix", "Medium", new String[]{"caramel", "long", "crunchy"});
        Candy skittles = new Candy("Skittles", "Small",new String[]{"colorful", "Sweet", "bite-sized"});
        Candy hundredGrandBar = new Candy("100 Grand Bar", "Large",new String[]{"chewy", "caramel", "chocolate"});
        Candy[] myBag = {snickers, twix, skittles, hundredGrandBar};

        for (Candy single : myBag){
            //Put descriptors in a variable
            String descriptors = Arrays.toString(single.descriptor);
            //Taking out the [] from the beginning and end of the descriptions
            descriptors = descriptors.substring(1, descriptors.length()-1);
            System.out.printf("Here's a %s that is %s and can be described as: %s\n", single.name, single.size, descriptors);
        }
//        System.out.println(Arrays.toString(hundredGrandBar.descriptor));
    }

    public String returnCandy(){
        return "Oh, a " + this.name + ", I see you have the " + this.size + " of it! It looks very " + this.descriptor;
    }
    public Candy(String name) {
//        Scanner candysc = new Scanner(System.in);
//        System.out.println("What is the name of your candy?");
//        String input = candysc.nextLine();
//        return input;
        this.name = name;
        this.size ="undefined...";
//        this(name, "Undefined");
        System.out.println("Your candy was: " + name + " and unfortunately, the size is " + size);
    }

    public Candy(String name, String size) {
        this.name = name;
        this.size = size;
        System.out.println("Ahhh, a " + name + "!" + " I see that you got the " + size + " size of it, Sounds good! :)");
    }
//having to instantaite a new constructor since we added a descriptor variable
    public Candy(String name, String size, String[] descriptor){
        this.name = name;
        this.size = size;
        this.descriptor = descriptor;
    }
}
