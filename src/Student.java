public class Student {
    public String name;
    public String cohort;
    private double grade;
    public double shareGrade(){
        return grade;
    }

    //Now, let's add a constructor, A METHOD OF OBJECT CREATION

    public Student(String studentName){
//        name = studentName;
//        cohort = "Unassigned";


        //calling constructor inside of a constructor
        this(studentName, "unassigned");
    }

    public Student(String studentName, String studentCohort){
        this.name = studentName;
        this.cohort = studentCohort;
    }

    public Student(String studentName, String studentCohort,double grade){
        this.name = studentName;
        this.cohort = studentCohort;
        this.grade = grade;
    }

    public static void main(String[] args) {
        //Before constructors, similar to JS?
//        Student mcStudent = new Student();
//        mcStudent.name = "Ronald";
//        mcStudent.cohort = "Golden Arches";
//
//        System.out.println(mcStudent.name + " is in the " + mcStudent.cohort + " cohort.");

        //First constructor experiment:
        Student shanshan = new Student("ShanShan S.");
        System.out.println("Shanshan.name = " + shanshan.name + " \nShanShan.cohort = " + shanshan.cohort);

        //Second constructor experiment:
        Student kevin = new Student("Kevin O.", "Quasar");

        //Third constructor:
        Student mcKevin = new Student("mcKevin mcOrta", "mcQuasar", 88.8);

        System.out.println("mcKevin grade = " + mcKevin.grade);

    }
}
