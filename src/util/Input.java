package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    String getString(){
        return scanner.next();
    }
    boolean yesNo(){
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }
    int getInt(int min, int max){
        return scanner.nextInt();
    }
    int getInt(){
        return scanner.nextInt();
    }
    double getDouble(double min, double max){
        return scanner.nextDouble();
    }
    double getDouble(){
        return scanner.nextDouble();
    }
}
