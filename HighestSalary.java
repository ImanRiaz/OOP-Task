import java.util.ArrayList;

class Employee {
    int ID;
    String name;
    Double Salary;

  
    Employee(int ID, String name, Double Salary) {
        this.ID = ID;
        this.name = name;
        this.Salary = Salary;
    }

    
    public static ArrayList<Employee> createEmployees() {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Ali", 4958.00));
        list.add(new Employee(2, "Mariyum", 8654.00));
        list.add(new Employee(3, "Akbar", 9840.00));
        return list;
    }
    public static Employee highestSalary(ArrayList<Employee> employees) {
    Employee highest = employees.get(0);
    for (int i = 1; i < employees.size(); i++) {
        if (employees.get(i).Salary > highest.Salary) {
            highest = employees.get(i);
        }
    }
    return highest;
}

   
    public String toString() {
        return "ID: " + ID + ", Name: " + name + ", Salary: " + Salary;
    }
}

public class HighestSalary {
    public static void main(String[] args) {
        ArrayList<Employee> employees = Employee.createEmployees();
        Employee top = Employee.highestSalary(employees);
        System.out.println("Employee with highest salary:");
        System.out.println(top);  
    }
}
