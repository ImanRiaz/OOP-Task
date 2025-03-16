/*Create a superclass Person with the properties String name and int age. Create a method introduce() that prints "Hello, my name is [name] and I am [age] years old.". Then, create a subclass Student that inherits from Person and adds a property String school. Create an object of Student and call the introduce() method. */
class Person{
    String name;
    int age;

    void introduce(){
        System.out.println("Hello,My name is +"+name+" .My age is "+age+" .");
    }
}
 class Student extends Person{
    String school;
 }

public class StudentData {
    public static void main(String [] args){
        Student s=new Student();
        s.introduce();
    }
}
