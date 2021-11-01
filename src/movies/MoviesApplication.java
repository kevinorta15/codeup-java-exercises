package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {

        System.out.println("What would you like to do?");
        System.out.println("0 - exit\n");
        System.out.println("1 - view all movies\n");
        System.out.println("2 - view movies in the animated category\n");
        System.out.println("3 - view movies in the drama category\n");
        System.out.println("4 - view movies in the horror category\n");
        System.out.println("5 - view movies in the scifi category\n");
        System.out.println("6 - view movies in the comedy category");

        allMovies();

    }

    public static void allMovies() {
        Input movieScanner = new Input();
        System.out.println("Enter your choice: ");
        int userInput = movieScanner.getInt();

        switch (userInput) {
            case 0:
                System.out.println("Okay... bye.");
                MoviesArray.findAll();
                break;
            case 1:
                System.out.println("All? You got it!");
                for (int i = 0; i < movies.length; i++) {
                    System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                }
                allMovies();
                break;
            case 2:
                System.out.println("Animated... sweet! Coming right up!");
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equals("animated")) {
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                    }
                }
                allMovies();
                break;
            case 3:
                System.out.println("Drama, what a sad day!");
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equals("drama")) {
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                    }
                }
                allMovies();
                break;
            case 4:
                System.out.println("SPOOKY SEASON, Horror!");
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equals("horror")) {
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                    }
                }
                allMovies();
                break;
            case 5:
                System.out.println("To infinity, and beyond... to Sci-Fi!");
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equals("scifi")) {
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                    }
                }
                allMovies();
                break;
            case 6:
                System.out.println("Comedy, ha... okay.");
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equals("comedy")) {
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                    }
                }
                allMovies();
                break;
        }
    }
}
