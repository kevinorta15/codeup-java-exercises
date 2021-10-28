import java.util.Random;
import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Would you like to use the Quasar calculator? [y/n]");
//        String choice = sc.next();
//        System.out.println("Enter two numbers here:");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        System.out.println("What method would you like to do? (add, subtract, multiply, divide)");
//        String input = sc.next();
//
//            switch (input){
//                case "add":
//                    System.out.println("You chose: add\n" + add(num1, num2));
//                    break;
//                case "subtract":
//                    System.out.println("You chose: subtract\n" + subtract(num1, num2));
//                    break;
//                case "multiply":
//                    System.out.println("You chose: multiply\n" + multiply(num1, num2));
//                    break;
//                case "divide":
//                    System.out.println("You chose: divide\n" + divide(num1, num2));
//                default:
//                    System.out.println("Not sure what you want to do here...");
//                    break;
//            }

//            getInteger(2, 25);
//            factorial();
        rolldice();
    }


    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int getInteger(int min, int max) {
        //write code to grab user input
        Scanner inputscan = new Scanner(System.in);
        System.out.println("Please enter a number between " + min + " and " + max);
        int input = inputscan.nextInt();
        if (input < min ||  input > max ){
            //sout message for entering wrong
            System.out.println("Sorry! You have not entered the correct numbers. Try again....");
            return getInteger(min, max);
        } else {
           System.out.println("That's a great number!");
           return input;
        }
    }

    public static void factorial() {
        long fact = 1;
        int factorialNum = getInteger(1,20);
        for (int i = 2; i <= factorialNum; i++) {
            fact *= i;
        }
        System.out.println("Factorial of "+ factorialNum + " is: " + fact);
    }

    public static void rolldice() {
        int diceSides = getInteger(6, 100);
            Random sides = new Random();
            int physicalDice = sides.nextInt(diceSides);
            System.out.println("You have rolled an " + diceSides + " sided dice. Your number rolled is " + physicalDice + ".");
            Scanner dice = new Scanner(System.in);
        System.out.println("Would you like to roll your " + diceSides + " sided dice again? [y/n]");
        String choice = dice.next();

        if (choice.equals("y")) {
            rolldice();
        } else {
            System.out.println("Thanks for playing! See you next time!");
        }
    }

    //this is the curly brace {} for the class, do not delete or comment out
}
