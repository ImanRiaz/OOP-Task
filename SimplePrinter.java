public class SimplePrinter extends Thread {

    @Override
    public void run() {
       
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from thread");

            try {
               
                Thread.sleep(1000);
            } catch (InterruptedException e) {
             
                System.out.println("Thread was interrupted.");
            }
        }
    }

   
    public static void main(String[] args) {
        SimplePrinter printerThread = new SimplePrinter();
        printerThread.start();
    }
}
