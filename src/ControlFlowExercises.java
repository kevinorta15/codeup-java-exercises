import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //while loop
//            int i = 5;
//
//            while (i <= 15) {
//                    System.out.println(i++);
//            }

        //TODO: Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//            int i = 0;
//
//            do {
//                System.out.println(i += 2);
//            }
//            while (i < 100);
//        };
        //TODO: Alter your loop to count backwards by 5's from 100 to -10.
//        int i = 100;
//
//        do {
//            System.out.println(i -= 5);
//        }
//        while (i >= -10);

        //TODO: Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

//        long i = 2;
//
//                do {
//                    System.out.println(i);
//                  i *= i;
//                }
//                while(i < 1000000);
//
// TODO: Refactor using for loops
        //1:
//        for (int i = 0; i <= 15; i++){
//            System.out.println(i);
//        }
        //2:
//        for (int i = 0; i <= 100; i += 2){
//            System.out.println(i);
//        }
        //3:
//        for (int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }
        //4:
//        for (long i = 2; i < 1000000; i *= i){
//            System.out.println(i);
//        }

        //TODO: Write a program that prints the numbers from 1 to 100, For multiples of three: print “Fizz” instead of the number, For the multiples of five: print “Buzz”, For numbers which are multiples of both three and five: print “FizzBuzz”

//        for (int i = 1; i < 100; i++){
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else{
//                System.out.println(i);
//            }
//        }

        //TODO: Prompt the user to enter an integer, Display a table of squares and cubes from 1 to the value entered, Ask if the user wants to continue, Assume that the user will enter valid data, Only continue if the user agrees to.

//        Scanner entInt = new Scanner(System.in);
//        String choice = "y";
//
//        while(choice.equalsIgnoreCase("y"))
//        {
//            // get the input from the user
//            System.out.println("Enter an Integer: ");
//            int newNumber = entInt.nextInt();
//
//            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
//            System.out.println("-------" + "  " + "-------" + "  " + "-------");
//
//            for(int i = 1; i <= newNumber; i++)
//            {
//                int numberSquared = (int) Math.pow(i, 2);
//                int numberCubed = (int) Math.pow (i, 3);
//
//                String message = "\n" + i + "       " + numberSquared + "       " + numberCubed;
//
//                System.out.println(message);
//
//                Scanner newScanner = new Scanner(System.in);
//                System.out.println("Would you like to enter another number?");
//                choice = newScanner.next();
//            }
//        }

        //TODO: Prompt the user for a numerical grade from 0 to 100, Display the corresponding letter grade, Prompt the user to continue, Assume that the user will enter valid integers for the grades, The application should only continue if the user agrees to.

        Scanner promptGrade = new Scanner(System.in);
        System.out.println(("Do you want to enter a grade? [y/n]"));
//        String choice = "y";
        String choice = promptGrade.next();
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("What grade did you get? ");
            int urGrade = promptGrade.nextInt();

            if (urGrade > 88) {
                System.out.println("You have an A! Great job!");
            } else if (urGrade >= 80) {
                System.out.println("You have a B! So close to that A...");
            } else if (urGrade >= 67) {
                System.out.println("You have a C! Still passing but we can work on it...");
            } else if (urGrade >= 60) {
                System.out.println("You have a D! It's like failing but not...");
            } else {
                System.out.println("Looks like an F to me... for FAILURE. Let's bring that up kid!");
            }
            Scanner againLoop = new Scanner(System.in);
            System.out.println("Would you like to enter another grade? [y/n]");
            choice = againLoop.next();
        }
    }
}


