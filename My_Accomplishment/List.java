
package My_Accomplishment;

import java.util.*;


public class List {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] stuff = { "" };
		String[] newlyAdded_split;
		LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
		ArrayList<String> newlyAdded_split_list = new ArrayList<>(Arrays.asList(newlyAdded_split));
		ArrayList<String> newlyAdded_split_list_1 = new ArrayList<>();
		boolean flag = true;
		boolean repeat1 = false;
		System.out.print("Your list has: ");
		if (thelist.contains("")) {
			System.out.println("<blank>");
			thelist.remove("");
		}
		do {

			try {
				do {
					System.out.print("Add something on your list: ");
					String newlyAdded = sc.nextLine();
					newlyAdded_split = newlyAdded.split(" ");
					newlyAdded_split_list = (ArrayList<String>) Arrays.asList(newlyAdded_split);
					newlyAdded_split_list_1.addAll(newlyAdded_split_list);
					for (int i = 0; i < newlyAdded_split.length; i++) {
						if (thelist.contains(newlyAdded_split[i])) {
							for (int z = 0; z < newlyAdded_split_list_1.size(); z++) {
								System.out.printf("Word %s is already in the list \n", newlyAdded_split[z]);
								newlyAdded_split_list_1.remove(i);
							}

							repeat1 = false;
							break;
						} else if (repeat1 == true) {
							thelist.addAll(newlyAdded_split_list_1);
							newlyAdded_split_list_1.clear();
							newlyAdded_split_list.clear();
						} else {

							repeat1 = true;

						}

					}

				} while (repeat1 == false);
			} catch (Exception e) {
				System.out.println("Your error is: " + e);
			}
			System.out.println("Your list has: ");
			for (String a : thelist) {
				System.out.println(a);
			}
			System.out.print("\nPress [1] to continue.\nPress [2] to exit:");
			String terminate = sc.nextLine();
			if (terminate.equals("1")) {
				flag = true;
			} else if (terminate.equals("2")) {
				flag = false;
				System.out.println("Program closed. ");
			}
		} while (flag == true);
	}
}
