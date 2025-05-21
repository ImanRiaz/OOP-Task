class TimerThread extends Thread {
    private final int duration; 
    private final String timerName;

    public TimerThread(String timerName, int durationInSeconds) {
        this.timerName = timerName;
        this.duration = durationInSeconds * 1000;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(duration);
            System.out.println(timerName + " finished after " + (duration / 1000) + " seconds.");
        } catch (InterruptedException e) {
            System.out.println(timerName + " was interrupted.");
        }
    }
}

public class MultipleTimers {
    public static void main(String[] args) {
       
        TimerThread timer1 = new TimerThread("Timer 1", 2);
        TimerThread timer2 = new TimerThread("Timer 2", 4);
        TimerThread timer3 = new TimerThread("Timer 3", 6);

        
        timer1.start();
        timer2.start();
        timer3.start();
    }
}
