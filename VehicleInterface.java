
interface Vehicle {
    void start();
}


class Car implements Vehicle {
    public void start() {
        System.out.println("The car is starting. Ready to drive!");
    }
}


class Bike implements Vehicle {
    public void start() {
        System.out.println("The bike is starting. Let's ride!");
    }
}


class Bus implements Vehicle {
    public void start() {
        System.out.println("The bus is starting. All aboard!");
    }
}

public class VehicleInterface {
    public static void main(String[] args) {
        
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        Vehicle myBus = new Bus();

        
        myCar.start();
        myBike.start();
        myBus.start();
    }
}
