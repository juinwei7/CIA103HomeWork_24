package 教學.module18_20;

import java.util.*;

public class TestPriorityQueue1 {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.offer("c");
		pq.offer("a");
		pq.offer("b");
		pq.offer("z");
		String s;
		while ((s = pq.poll()) != null) {
			System.out.print(s + ", ");
		}
	}
}
