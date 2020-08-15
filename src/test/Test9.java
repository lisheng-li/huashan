package test;

import java.util.ArrayList;
import java.util.List;

public class Test9 {
	public static void main(String[] args) {
//		List<SouDanNo> list = new ArrayList<SouDanNo>();
//		list.add(new SouDanNo("3", "ss"));
//		list.add(new SouDanNo("2", "aa"));
//		list.add(new SouDanNo("4", "dd"));
//		list.add(new SouDanNo("3", "ss"));
//		list.add(new SouDanNo("1", "zz"));
//		list.add(new SouDanNo("1", "aa"));
//		list.add(new SouDanNo("2", "cc"));
//		list.add(new SouDanNo("3", "dd"));
//		list.add(new SouDanNo("3", "xx"));
//		for(SouDanNo e : getList(list)) {
//			System.out.println(e.getNo() + "," + e.getName());
//		}
		
		Test10 test = new Test10();
		try {
			test.hello();
		} catch (MyException e) {
			System.out.println("false");
		}
	}
	
	public static List<SouDanNo> getList(List<SouDanNo> list) {
		if (list.isEmpty()) {
			return list;
		}
		
		List<SouDanNo> retList = new ArrayList<SouDanNo>();
		int i = 0;
		String name = list.get(i).getName();
		for (; i < list.size(); i++) {
			SouDanNo sd = list.get(i);
			if (!"3".equals(sd.getNo().trim())) {
				name = sd.getName();
				continue;
			}
			if (i != 0 && (list.get(i).getName().equals(name)
					|| list.get(i).getName().equals(list.get(i - 1).getName()))) {
				continue;
			}
			retList.add(sd);
		}
		return retList;
	}
}
