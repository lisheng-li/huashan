package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test8 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < list.size(); i++) {
			String value = list.get(i);
			set.add(value);
		}
		System.out.println(new ArrayList<String>().addAll(set));
		
	}

}
