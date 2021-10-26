import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to say to Bob?");
        String bobMessage = sc.nextLine();

        if (bobMessage.endsWith("?")) {
            System.out.println("Sure.");
        } else if (bobMessage.endsWith("!")){
            System.out.println("Whoa, Chill out!");
        } else if (bobMessage.equals("")){
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}
