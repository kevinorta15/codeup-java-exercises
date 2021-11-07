package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private  ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades){
        this.name = name;
        this.grades = grades;
    }

    public void setName(String name, ArrayList<Integer> grades){
        this.name = name;
        this.grades = grades;
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        Integer sum = 0;
        for (Integer singleGrade : grades){
            if(!grades.isEmpty()){
                sum += singleGrade;
            }
        }
        return sum / grades.size();
    }


    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        ArrayList<Integer> student1grades = new ArrayList<>();
        Student kevin = new Student("Kevin", grades);
        Student kayla = new Student("Kayla", student1grades);
        kevin.addGrade(97);
        kevin.addGrade(100);
        kayla.addGrade(80);
        kayla.addGrade(100);
        System.out.println(grades);
        System.out.println(kevin.getName());
        System.out.println(student1grades);
        System.out.println(kayla.getName());
        System.out.println("kevin.getGradeAverage() = " + kevin.getGradeAverage());
        System.out.println("kayla.getGradeAverage() = " + kayla.getGradeAverage());
    }
}
