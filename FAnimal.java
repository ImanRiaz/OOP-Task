class Animal{
 public final void makesound(){
    System.out.println("Animal make sound");
  }
}
/*class dog extends Animal{
  public void makesound(){
    @Override
    System.err.println("Amimal doesn't make sound");
  } 
}*/


public class FAnimal{
  public static void main(String [] args){
    Animal m=new Animal();
    m.makesound();
  }
}

//due to usage of keyword final we cannot inherit that specific class into another class.