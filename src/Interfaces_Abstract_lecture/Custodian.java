package Interfaces_Abstract_lecture;

public class Custodian extends Employee {


    public Custodian(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "Floors have been cleaned, trash taken out";
    }

    public String morningMeeting() {
        return "Custodians schedule meetings as necessary.";
    }

    public String lunchTime() {
        return "12:00PM - 1:00PM";
    }


    public int dailyPay() {
        return 180;
    }
}
