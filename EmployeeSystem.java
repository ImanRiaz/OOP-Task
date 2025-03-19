class employee1{
    void calculateSalary(){
        System.out.println("Base Salary: 3000$");
    }
}

class manager extends employee1{
    @Override
    void calculateSalary(){
        System.out.println("Base Salary:  5000$.");
    }

}

class developer extends employee1{
    @Override
    void calculateSalary(){
        System.out.println("Base Salary: 4000$.");
    }
}
public class EmployeeSystem {
    public static void main(String [] args){
        employee1 e1=new employee1();
        manager m1=new manager();
        developer d1=new developer();

        e1.calculateSalary();
        m1.calculateSalary();
        d1.calculateSalary();
    }
}
