package util;

import java.util.Scanner;

public class Input {

    private Scanner thisScanner = new Scanner(System.in);
//    public Input() {
//
//    }

    String getString() {
        return thisScanner.next();
    }

    boolean yesNo() {
        String userInput = thisScanner.next();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

  int getInt(int min, int max) {
        System.out.println("Please enter a number between " + min + " and " + max);
        int input = thisScanner.nextInt();
        if (input < min || input > max) {
            //sout message for entering wrong
            System.out.println("Sorry! You have not entered the correct numbers. Try again....");
            return getInt(min, max);
        } else {
            System.out.println("That's a great number!");
            return input;
        }
    }
}
//    int getInt(){
//        return getInt();
//    }
//    double getDouble(double min, double max){
//        return thisScanner.nextDouble();
//    }
//    double getDouble(){
//        return thisScanner.nextDouble();
//    }
//}
