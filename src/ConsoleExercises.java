import java.util.Scanner;

public class ConsoleExercises {
public static void main(String[] args){


//User enters Integer
    double pi = 3.14159;
    System.out.printf("The value of pi is %s",pi);

    Scanner intScanner = new Scanner(System.in);

    System.out.println("\nEnter an integer here: ");
    int newInteger = intScanner.nextInt();

    //user enters words to print separately
    Scanner primoWord = new Scanner(System.in);

    System.out.print("Enter three words: ");
    String firstWord = primoWord.next();
    String secondWord = primoWord.next();
    String thirdword = primoWord.next();
    System.out.println(firstWord);
    System.out.println(secondWord);
    System.out.println(thirdword);

    //user enters sentence to be shown later
    Scanner sentenceWord = new Scanner(System.in);
    System.out.print("Give me a sentence: ");
    String sentenceOutput = sentenceWord.nextLine();
    System.out.printf("This is your sentence: %s", sentenceOutput);

    //user enters width, length for calculator

    Scanner areaCalculator = new Scanner(System.in);
    System.out.print("\n Enter the dimensions of your classroom in this format (height, width): ");
    int height = areaCalculator.nextInt();
    int width = areaCalculator.nextInt();
    System.out.print("Your perimeter is: " + ((height * 2) + (width * 2)) + " square feet" + "\nYour area is: " + (height * width) + " square feet");
}
}
