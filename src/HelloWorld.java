public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.print(" World!");

        int myFavoriteNumber = 15;
        System.out.println("\n" + "This is my favorite number: " + myFavoriteNumber);

        String myString = "Armadillo Boulders is my hometown climbing gym.";
        System.out.println(myString);

        long myNumber = 123;
        float newNum = (int) 3.14;
        System.out.println(myNumber);
        System.out.println(newNum);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String class;
        //produces an error java: not a statement

        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";
//        produces errors: string cannot be converted to int and string cannot be cast to class
        //13. Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println("x is: " + x);
        System.out.println("y is " + y);

//        byte bigNum = 1000000;  //you get the error java: incompatible types: possible lossy conversion from int to byte
//        System.out.println(bigNum);

        byte littleNum = 127;
        System.out.println(littleNum);
        littleNum++;
        System.out.println(littleNum);
//        littleNum++;
//        System.out.println(littleNum);
    }

    }
