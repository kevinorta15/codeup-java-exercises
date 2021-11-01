public class Candy {

    public String name;
    public String size;

    public static void main(String[] args) {
        Candy unknownCandy = new Candy("Snickers", "Large");
//        unknownCandy.size = "Large";

//        System.out.println(unknownCandy.name);
//        System.out.println(unknownCandy.size);
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
}
