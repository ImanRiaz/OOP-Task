class Employee{
    String name;
    int salary;
    double newsalary;
    double increasesalary(double percent){
     newsalary=salary+(salary*(percent/100));
     return newsalary;
    }
    void displayemployee(){
      System.out.println("Name: "+name);
      System.out.println("Salary increased by 20%");
      System.out.println("Your previous salary was: "+salary);
      System.out.println("Your current salary is: "+newsalary);
    }
}
public class SalaryCalculation {
    public static void main(String[] args){
    Employee e=new Employee();
    e.name="Iman";
    e.salary=20000;
    e.increasesalary(20);
     e.displayemployee();
    }
}
