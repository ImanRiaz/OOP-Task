class Vehicle{
    String brand;

    void StartEngine(){
        System.out.println("The Vehical engine is start. ");
    }
}
    class car extends Vehicle{
        void honk(){
            System.out.println("The car honks.");
        }
    }

public class Cars1 {
    public static void main(String [] args){
        car v=new car();
        v.StartEngine();
        v.honk();
    }
}
