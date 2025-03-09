class Student{
    String name;
    double marks;
    void checkpass(){
        if(marks>=50){
            System.out.println("Passed.");
        }
        else{
            System.out.println("Failed.");
        }
    }
}
public class GradeCalculation {
    public static void main(String[] args){
        Student s=new Student();
        s.name="Iman";
        s.marks=67;
        s.checkpass();
    }
}
