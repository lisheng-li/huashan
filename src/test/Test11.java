package test;

import java.math.BigDecimal;

public class Test11 {

	public static void main(String[] args) {
		String str = "asdsfeDASDS$DADSdsa2332";
		StringBuffer sb = new StringBuffer();
		if (str.length() != 0 && !"".equals(str)) {
			for (char c : str.toCharArray()) {
				if ((c >= 'A') && (c <= 'Z')) {
					sb.append(c);
				}
			}
		}
//		System.out.println(getMatcher("cbaca", "cbabaa"));;
		for (String string : change(new String[] {"2", "1", "3", "4", "5"})) {
			System.out.println(string);
		}
		;
	}
	
	public static String getMatcher(String str1, String str2) {
		if ("".equals(str1) || "".equals(str2)) {
			return "error";
		}
		boolean flag = true;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str1.length() && flag; i++) {
			String s = str1.substring(i, i + 1);
			for (int j = 0; j < str2.length(); j++) {
				if (i != j) {
					continue;
				}
				String s1 = str2.substring(j, j + 1);
				if (i == j && s.equals(s1)) {
					sb.append(s1);
				} else {
					flag = false;
					break;
				}
			}
		}
		return sb.toString();
	}
	
	public static String[] change(String[] strs) {
		String[] returnStr = new String[strs.length];
		int length = strs.length - 1;
		for (int i = length; i >= 0; i--) {
			returnStr[length - i] = strs[i];
		}
		return returnStr;
	}
}
