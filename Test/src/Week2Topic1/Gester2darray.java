package Week2Topic1;

public class Gester2darray {

	public static void main(String[] args) {
		String[][] gester = {{"hey", "Black", "Block"},
							{"White", "Walter", "Caucasian"},
							{"Gester1", "gester2", "gester3"}
		};
		for (int row = 0; row<gester.length; row++) {
			for (int col = 0; col< gester[row].length; col++) {
				System.out.printf("%s ",gester[row][col]);
				
			}
			System.out.println();
		}
	}

}
