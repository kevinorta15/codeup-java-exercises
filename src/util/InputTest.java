
        package util;

public class InputTest {

    public static void main(String[] args) throws Exception {

        //since the methods we created are not static, we need to create a new input object here
        Input input = new Input();  //create an input object/instantiate the input class

//        System.out.println("Enter any string");
//        String userInput = input.getString();
//        System.out.println(userInput);
//
//        System.out.println("Would you like to continue, y for yes, n for no");
//        boolean confirm = input.yesNo();
//        System.out.println(confirm);
//
//        System.out.println("Enter a number between 1 and 10");
//        int userInt = input.getInt(1, 10);
//        System.out.println(userInt);
//
//        System.out.println("Pick a number, any (integer) number");
//        int userNum = input.getInt();
//        System.out.println("the number you picked is: " + userNum);
//
//        System.out.println("Enter a decimal point number between 1 and 20.");
//        double userDouble = input.getDouble(1,20);
//        System.out.println(userDouble);
//
//        System.out.println("Pick a number, any (decimal) number");
//        double userDou = input.getDouble();
//        System.out.println("the decimal number you picked is: " + userDou);

        System.out.println("Please enter a number:");
        int userInput = input.getInt();
        System.out.println("userInput = " + userInput);

    }
}