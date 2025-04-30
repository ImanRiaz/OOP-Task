
interface Printable {
    void print();
}

class Book implements Printable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void print() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}


class Magazine implements Printable {
    private String title;
    private int issueNumber;

    public Magazine(String title, int issueNumber) {
        this.title = title;
        this.issueNumber = issueNumber;
    }

    public void print() {
        System.out.println("Magazine Title: " + title);
        System.out.println("Issue Number: " + issueNumber);
    }
}


public class PrintableTest {
    public static void main(String[] args) {
        
        Printable book = new Book("Java Basics", "Alice");
        Printable magazine = new Magazine("Tech Today", 42);

        System.out.println("--- Book Details ---");
        book.print();

        System.out.println("\n--- Magazine Details ---");
        magazine.print();
    }
}
