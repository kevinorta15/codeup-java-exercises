import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

    Person person1 = new Person("Kevin");
    Person person2 = new Person("John");
    Person person3 = new Person("Andrew");

       String person1name = person1.getName();
       String person2name = person2.getName();
       String person3name = person3.getName();

       String[] people = {person1name, person2name, person3name};

        System.out.println(Arrays.toString(people));

        System.out.println(addPerson(people, "Jim"));

//        for (String persons: Person){
//            System.out.println(persons);
//        }


    }

    public static String addPerson(String[] array, String person) {
        String[] arrayCopy = Arrays.copyOf(array, array.length + 1);
        arrayCopy[arrayCopy.length-1] = person;
        return Arrays.toString(arrayCopy);
    }
}
