package test;

import java.util.List;

public class TestPoker {

	public static void main(String[] args) {
		try {
			Pokers p = Pokers.class.newInstance();
			List<APoker> pokers = p.foundPokers();
			p.shufflePoker();
			p.sortPoker();
			for (APoker a : pokers) {
				System.out.println(a.toString());
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 

	}

}
