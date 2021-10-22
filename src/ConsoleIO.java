import java.util.Scanner;

public class ConsoleIO {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

//        String name = "Kevin";
//        System.out.printf("Hello there, %s. Nice to see you.\n", name);
//
//        String greeting = "Howdy";
//        String cohortName = "quasar";
//
//        System.out.printf("%s, \n %s!", greeting, cohortName);

        System.out.print("Enter something: ");

        String userInput = scanner.nextLine();

        System.out.printf("You entered: %s", userInput);

    }
}
