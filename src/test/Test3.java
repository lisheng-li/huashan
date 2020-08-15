package test;

public class Test3 {

	public static void main(String[] args) throws Exception {
		int cnt = 0;
		String text1 = "text1";
		String text2 = "text2";
		String text3 = "text3";
		String text4 = "text4";
		String text5 = "text5";
		String text6 = "text6";
		String text11 = "text1";
		String text22 = "text2";
		String text33 = "text3";
		String text44 = "text4";
		String text55 = "text5";
		String text66 = "text6";
		String userText = null;
		if (text1.equals(userText)) {
			cnt = 1;
		} else if (text2.equals(userText)) {
			cnt = 2;
		} else if (text3.equals(userText)) {
			cnt = 3;
		} else if (text4.equals(userText)) {
			cnt = 4;
		} else if (text5.equals(userText)) {
			cnt = 5;
		} else if (text6.equals(userText)) {
			cnt = 6;
		}
		if (cnt > 1) {
			if (text11 == "" || "".equals(text11)) {
				throw new Exception();
			}
		}
		if (cnt > 2) {
			if (text22 == "" || "".equals(text22)) {
				throw new Exception();
			}
		}
		if (cnt > 3) {
			if (text33 == "" || "".equals(text33)) {
				throw new Exception();
			}
		}
		if (cnt > 4) {
			if (text44 == "" || "".equals(text44)) {
				throw new Exception();
			}
		}
		if (cnt > 5) {
			if (text55 == "" || "".equals(text55)) {
				throw new Exception();
			}
		}
		if (cnt > 6) {
			if (text66 == "" || "".equals(text66)) {
				throw new Exception();
			}
		}
	}

}
