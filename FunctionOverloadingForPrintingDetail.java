class Employeee{
    
    void printdetail(int id){
        System.out.println("Employee ID: "+ id);
    }
    void printdetail(String name){
        System.out.println("Employee name: "+name);
    }

    void printdetail(int id1,String name1){
        System.out.println("ID: "+id1+". Name: "+name1);
    }
}
public class FunctionOverloadingForPrintingDetail {
    public static void main(String[] args){
        Employeee e1=new Employeee();
        e1.printdetail(043);
        e1.printdetail("Iman");
        e1.printdetail(043,"Iman");
    }
}
