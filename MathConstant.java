final class MathConstants{
final double E=2.718;
public void print(){
System.out.println("the value is "+E);
}
}
/*class AdvancedMath extends MathConstants{
        System.out.println("THE VALUE OF E is"+E);
}*/

public class MathConstant {
    public static void main(String [] args){
    MathConstants n=new MathConstants();
    n.print();
}
}