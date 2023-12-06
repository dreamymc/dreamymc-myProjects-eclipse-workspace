import java.util.*;
public class queue {
// queue
	public static void main(String[] args) {
		
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.offer("first");
		q.offer("second");
		q.offer("third");
		
		System.out.printf("%s \n",q);
		
		System.out.printf("%s \n", q.peek());
		
		q.poll();
		System.out.printf("%s\n", q);
		System.out.printf("%s \n", q.peek());
		q.poll();
		System.out.printf("%s\n", q);
		System.out.printf("%s \n", q.peek());
	}

}
