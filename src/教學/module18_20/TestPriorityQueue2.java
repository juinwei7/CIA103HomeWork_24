package module18_20;

import java.util.*;

public class TestPriorityQueue2 {
	public static void main(String[] args) {
		Comparator<String> c = new Comparator<String>() {
			public int compare(String a, String b) {
				return a.compareTo(b) * -1;
			}
		};
		PriorityQueue<String> pq = new PriorityQueue<String>(3, c);
		pq.offer("c");
		pq.offer("a");
		pq.offer("b");
		pq.offer("hj");
		pq.offer("z");
		pq.offer("y");
		String s;
		while ((s = pq.poll()) != null) {
			System.out.print(s + ", ");
		}
	}
}
