import java.util.Scanner;

public class Person {
    //A class: This is the template or a blueprint for a 'PERSON'

    //instance variables
//    public String firstName;
//    public String lastName;
//    public int age;
//
//    //instance method
//    public String joinChat(){
//        return lastName + " , " + firstName + " has joined the chat!";
//    };
//
//    //make a static property - repsenting the world population
//    public static long worldPop = 7_900_000_000L;
//
    public static void main(String[] args) {
//        Person kev = new Person();
////        Scanner sc = new Scanner(System.in); //We use Instantiating when we create Scanner, similar to Person
//
//        kev.firstName = "Kevin";
//        kev.lastName = "Orta";
//
//        System.out.println("kev = " + kev);
//        System.out.println(kev.firstName + " " + kev.lastName + " is my name!");
//        //SOUF
//        System.out.printf("%s %s is my name!\n", kev.firstName, kev.lastName);
//
//        System.out.println(kev.joinChat());
//
//        System.out.println("worldPop = " + worldPop);
//
//        Person douglas = new Person();
//        douglas.firstName = "Douglas";
//        douglas.lastName = "Hirsh";
//
//        Person.worldPop += 1;
//
//        System.out.println("Population with Douglas included" + worldPop);
//        System.out.println(douglas.worldPop); //this will work but not PROPER CODE

//        System.out.println(Person.firstName);

        //Exercise Below:

        Person kevin = new Person("Kevin Orta");
        System.out.println(kevin.getName());
        kevin.sayHello();
        kevin.setName("Albert");
        kevin.sayHello();
        kevin.setName("Kevin Orta");
        kevin.sayHello();
    }

    //Exercise Time:

    //private field is considered property
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
//TODO: return the person's name
    }

    public void setName(String name){
        this.name = name;
//TODO: change the name property to the passed value
    }
    public void sayHello(){
        System.out.println("Hello " + name + "!");
        //TODO: print a message to the console using the person's name
    }
}
