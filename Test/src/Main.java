import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        // Create a new Timer
        Timer timer = new Timer();

        // Create a new TimerTask that will be executed every 1000 milliseconds (1 second)
        int counter = 0;
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("Hello, World!");
                if (counter == 5) {
                    cancel();
                    timer.cancel();
                }
                
            }
        };
        timer.schedule(task, 0, 1000);

    }
}
