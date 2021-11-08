package util;

import java.util.Scanner;

public class Input {

    private Scanner thisScanner;
    public Input() {
        this.thisScanner = new Scanner(System.in);
    }

    public String getString() {
        return thisScanner.next();
    }

    public boolean yesNo() {
        String userInput = thisScanner.next();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

   public int getInt(int min, int max) {
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

    public int getInt(){
        try {
            String s = getString();
            return Integer.valueOf(s);
        } catch (NumberFormatException e){
            System.out.println("Sorry, that was not a number");
        }
    }

    public double getDouble(){
        try {
            String s = getString();
            return Double.valueOf(s);
        } catch (NumberFormatException e){
            System.out.println("Sorry, that was not a number");
            e.printStackTrace();
        }
    }

    public double getDouble(double min, double max){
        return thisScanner.nextDouble();
    }
}



//}
