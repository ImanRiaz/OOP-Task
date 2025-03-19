interface Animal {
      void makesound();
    
}

class Dog implements Animal{
    @Override
    public void makesound(){
        System.out.println("WOOF WOOF");
    }
}

class Cat implements Animal{
    @Override
    public void makesound(){
        System.out.println("MEOW MEOW");
    }
}
public class InterfaceAnimal {
    public static void main(String [] args){
        Animal d=new Dog();
        Animal c=new Cat();

        d.makesound();;
        c.makesound();
    }
}
