package Week2Topic1;
import java.util.*;
public class Test_four {

	public static void main(String[] args) {
		String someone = "Mc";
		Random rand = new Random();
        int randomNum = rand.nextInt(3) + 1;
        switch(randomNum) {
        case 1:
        	System.out.printf("\nPlease keep %s's secret as I regard you as someone who can cherish it wholeheartedly. Thank you.\n", someone);
        	break;
        case 2:
        	System.out.printf("\nDon't you ever in hell tell this secret to anyone or I will find you.\n", someone);
        	break;
        case 3:
        	System.out.printf("\nHave a good day.\n", someone);
        	break;
        }

	}

}
