import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//2d array
public class Test_one {

	public static void main(String[] args) {
	
      String[][] array = {{"One", "Two", "Three"}, {"Four", "Five", "Six"}, {"Seven", "Eight", "Nine"}};

      for (int i = 0; i < array.length; i++) {
          for (int j = 0; j < array[i].length; j++) {
              System.out.print(array[i][j] + " ");
          }
          System.out.println();
      }
      ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

      Runnable task = () -> {
          System.out.println("Hii");
      };

      executor.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);


	}

}
