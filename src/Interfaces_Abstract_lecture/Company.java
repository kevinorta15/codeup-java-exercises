package Interfaces_Abstract_lecture;

public class Company {

    public static void main(String[] args) {
        Accountant accountBot = new Accountant("numberBot", "Accounting");
        Custodian pedroCleaner = new Custodian("Pedro", "Waste Management");

//        System.out.println(accountBot.work());
//        System.out.println(accountBot.getName());
//        System.out.println(accountBot.getDepartment());
//
//        System.out.println(pedroCleaner.work());
//        System.out.println(pedroCleaner.getName());
//        System.out.println(pedroCleaner.getDepartment());

        System.out.println(accountBot.getName() + " is reporting for duty today!");
        System.out.println(pedroCleaner.getName() + " is reporting for duty today!");

        System.out.println(accountBot.morningMeeting());
        System.out.println("$" + pedroCleaner.dailyPay() + " is what custodians get paid daily!");
    }
}
