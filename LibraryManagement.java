class Book{
    private String title;
    private String author;
    private boolean isissued;

    Book(String t, String a, boolean i){
        title = t;
        author = a;
        isissued = i;
    }

    void issuebook(){
        if (!isissued){
            isissued=true;
            System.out.println(title+"has been issued");
        }else{
            System.out.println(title+"is already issued");
        }
    }
        void returnbook(){
            if(isissued){
                isissued=false;
                System.out.println(title+" has been returned");
            } else{
                System.out.println(title+" was not issued");
            }
        }
        void showstatus(){
            if(isissued==true){
                System.out.println("Author: "+author+"Title: "+title+" is available.");
            }else{
                System.out.println("Author: "+author+" Title: "+title+ "is not available");
            }
        }
    }

public class LibraryManagement {
    public static void main(String[] args){
        Book b=new Book("Runner", "Iman", true);
      
        b.issuebook();
        
        b.returnbook();
        b.showstatus();
    }
}
