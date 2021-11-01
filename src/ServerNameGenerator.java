import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {

        System.out.println("Here is your server name:\n" + randomThing(adjectives) + "-" + randomThing(noun));

    }

    public static String randomThing(String[] array) {
        Random random = new Random();
        int things = random.nextInt(9+1);

        return array[things];
    }

    public static String [] adjectives = {"rude", "kind", "happy", "sad", "mad", "confused", "terrified", "meh", "proud", "big"};
    public static String [] noun = {"dog", "cat", "duck", "horse", "computer", "aliens", "bird", "firetruck", "grayson", "will"};
}
