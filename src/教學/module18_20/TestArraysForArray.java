package 教學.module18_20;

import java.util.*;

public class TestArraysForArray {

	public static void main(String args[]) {

		List<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(8);
		list.add(100);
		list.add(1);

		Collections.sort(list);

		String strArray[] = { "5", "2", "3", "4", "1" };
		for (int i : list){
			System.out.println(i);
		}

//		Arrays.sort(strArray);
//
//		for (int i = 0; i < strArray.length; i++) {
//			System.out.println(strArray[i]);
//		}
	}
}
