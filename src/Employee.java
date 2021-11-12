import java.lang.reflect.Array;
import java.util.Arrays;

public class Employee extends Person {

    public Employee(String employeeName) {
        super(employeeName); //Calling the constructor from Person - Person(Employee)
    }

    public void sayHello(){
        System.out.println("Welcome to JavaWorld, how may I help you?");
    }

    public void doWork(){
        System.out.println("Work, work, work...");
    }

    public int getAge(){
        return this.age;
    }

    public static void main(String[] args) {
        //Pulling from Person to get SayHello
        Person unemployedKev = new Person("Kevi");
        unemployedKev.sayHello();
        System.out.println("unemployedKev.getName() = " + unemployedKev.getName());
        System.out.println();
        //Employee (extend) SayHello
        Employee Kev = new Employee("Kevin");
        Kev.sayHello();
        System.out.println("Kev.getName() = " + Kev.getName());
        //using doWork with Employee Kev
        Kev.doWork();

        //use doWork with Person, does not work, not in Person
//        unemployedKev.doWork();
    }

}
