class Book{
    String title;
    String author;
    double price; 
    double discountprice(double discount){
       double newprice;
       newprice=price-(price*(discount/100));
       return newprice;
    }
}
public class BookingSystem {
    public static void main(String[] args){
        Book b=new Book();
        b.title="Haunting Adeline";
        b.author="H.B Cartigon";
        b.price=1000.98;
        System.out.println("The name of the book is: "+b.title);
        System.out.println("The name of the author is: "+b.author);
        System.out.println("The original was "+b.price+ "$. After discount of 25.55%. The new price is: "+b.discountprice(25.55)+"$." );
    }
}
