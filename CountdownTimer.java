public class CountdownTimer extends Thread {

    @Override
    public void run() {
       
        for (int i = 10; i >= 1; i--) {
            System.out.println("Countdown: " + i);

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Countdown interrupted.");
            }
        }

        System.out.println("Time's up!");
    }

    public static void main(String[] args) {
        CountdownTimer timer = new CountdownTimer();
        timer.start(); 
    }
}
