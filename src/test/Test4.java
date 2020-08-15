package test;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String f001 = null;
		String f002 = null;
		String f003 = null;
		
		if (null != f003 && !"".equals(f003)) {
			if ("".equals(f001) || "".equals(f002)) {
				System.out.println("error");
			}
		}
		
		if (null != f002 && !"".equals(f002)) {
			if ("".equals(f001)) {
				System.out.println("error");
			}
		}
		
		List<String> list = new ArrayList<String>();
		list.add("ass");
		list.add("ass");
		list.add("7667");
		
		boolean flag = true;
		for (int i = 0; i < list.size(); i++) {
			String o = list.get(i);
			if ("true".equals(o)) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
		
	}
}
