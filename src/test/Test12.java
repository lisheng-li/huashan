package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test12 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("grape");
		list.add("banana");
		list.add("pear");
		
		
		String temp1 = "";
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if (str.compareTo(temp1) > 0) {
				temp1 = str;
			}
		}
		System.out.println(temp1);
		
		Collections.sort(list);
		System.out.println(list.get(0));
	}
}
