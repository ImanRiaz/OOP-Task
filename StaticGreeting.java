interface Greeting {
    
    void sayHello(String name);

    
    default void sayGoodbye() {
        System.out.println("Goodbye! See you soon.");
    }

    
    static void staticGreet() {
        System.out.println("Hello from the static method!");
    }
}


class Welcome implements Greeting {

   
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java!");
    }
}

public class Main {
    public static void main(String[] args) {
    
        Welcome welcome = new Welcome();

        welcome.sayHello("John");

        welcome.sayGoodbye();

        Greeting.staticGreet();
    }
}
