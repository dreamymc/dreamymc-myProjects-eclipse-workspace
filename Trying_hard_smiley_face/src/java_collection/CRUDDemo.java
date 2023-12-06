package java_collection;

import java.util.*;

public class CRUDDemo {

	public static void main(String[] args) {

		List<Employee> c = new ArrayList<Employee>();
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		int ch;
		do {
			System.out.println("[1] INSERT");
			System.out.println("[2] DISPLAY");
			System.out.println("[3] SEARCH");
			System.out.println("[4] DELETE");
			System.out.println("[5] UPDATE");
			ch = s.nextInt();

			switch (ch) {
			case 1:
				System.out.print("Enter Employee Number: ");
				int eno = s.nextInt();
				System.out.print("Enter Employee Name: ");
				String ename = s1.nextLine();
				System.out.print("Enter Employee Salary: ");
				int salary = s.nextInt();
				c.add(new Employee(eno, ename, salary));
				break;
			case 2:
				System.out.println("----------------");
				Iterator<Employee> i = c.iterator();
				while (i.hasNext()) {
					Employee e = i.next();
					System.out.println(e);
				}
				System.out.println("----------------");
				break;
			case 3:
				boolean found = false;
				System.out.println("Enter employee number to search: ");
				int empno = s.nextInt();
				System.out.println("----------------");
				i = c.iterator();
				while (i.hasNext()) {
					Employee e = i.next();
					if (e.getEmpno() == empno) {
						System.out.println(e);
						found = true;
					}
				}

				if (!found) {
					System.out.println("Record not found");
				}
				System.out.println("----------------");
				break;

			case 4:
				found = false;
				System.out.println("Enter employee number to delete: ");
				empno = s.nextInt();
				System.out.println("----------------");
				i = c.iterator();
				while (i.hasNext()) {
					Employee e = i.next();
					if (e.getEmpno() == empno) {
						i.remove();
						found = true;
					}
				}

				if (!found) {
					System.out.println("Record not found");
				} else {
					System.out.println("Record is Deleted Successfully");
				}
				System.out.println("----------------");
				break;

			case 5:
				found = false;
				System.out.println("Enter employee number to Update: ");
				empno = s.nextInt();
				System.out.println("----------------");
				ListIterator<Employee>li = c.listIterator();
				while (li.hasNext()) {
					Employee e = li.next();
					if (e.getEmpno() == empno) {
						System.out.print("Enter new Name: ");
						ename = s1.nextLine();
						System.out.print("Enter new Salary: ");
						salary = s.nextInt();
						li.set(new Employee(empno, ename, salary));
						found = true;
					}
				}

				if (!found) {
					System.out.println("Record not found");
				} else {
					System.out.println("Record is Updated Successfully");
				}
				System.out.println("----------------");
				break;
			}
		} while (ch != 0);
	}
}
