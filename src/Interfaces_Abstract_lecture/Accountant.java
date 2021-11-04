package Interfaces_Abstract_lecture;

public class Accountant extends Employee {

    public Accountant(String name, String department) {
        super(name, department);
    }

    public String work(){
        return "TPS reports have been drafted";
    }

    public String morningMeeting() {
        return "We will have a meeting every single day, be ready!";
    }

    public String lunchTime() {
        return "No Lunch, Work Only!";
    }

    public int dailyPay() {
        return 500;
    }

}
