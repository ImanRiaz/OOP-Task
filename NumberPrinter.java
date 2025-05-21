
class NumberPrinter extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("NumberPrinter interrupted");
            }
        }
    }
}


class CharacterPrinter extends Thread {
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Character: " + c);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("CharacterPrinter interrupted");
            }
        }
    }
}

// Main class to run the threads
public class ThreadDemo {
    public static void main(String[] args) {
        NumberPrinter numberThread = new NumberPrinter();
        CharacterPrinter characterThread = new CharacterPrinter();

        // Start both threads
        numberThread.start();
        characterThread.start();
    }
}
