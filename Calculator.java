class Calculate{
    int add(int a,int b){
        int c;
        c=a+b;
        return c;
    }
    int multiply(int a,int b){
        int d;
        d=a*b;
        return d;
    }    
    }
public class Calculator {

public static void main(String[] args){
Calculate c=new Calculate();
System.out.println("Sum: "+ c.add(3,2));
System.out.println("Multiply: "+c.multiply(2,4));
}
    
}
