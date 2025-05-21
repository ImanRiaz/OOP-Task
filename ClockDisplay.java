import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockDisplay extends Thread {

    @Override
    public void run() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

        while (true) {
            // Get current time
            String currentTime = timeFormat.format(new Date());
            System.out.println("Current Time: " + currentTime);

            try {
                Thread.sleep(1000); /
            } catch (InterruptedException e) {
                System.out.println("Clock interrupted.");
                break; 
        }
    }

    public static void main(String[] args) {
        ClockDisplay clock = new ClockDisplay();
        clock.start(); 
    }
}
