package test;

public class Test5 {
	public static void main(String[] args) {
		String str = "AX34hgsd";
		for (char ch : str.toCharArray()) {
			if (!(('0' <= ch && ch <= '9') || ('a' <= ch && ch <= 'z'))) {
				System.out.println("error");
			}
		}
		
		String fileName = "sone.html";
		if (!fileName.isEmpty() && !"".equals(fileName)) {
			if (!fileName.endsWith(".html")) {
				System.out.println("html error");
			}
		}
		
		
		Nasoo test = new Nasoo();
		test.setName("nihao");
		test.setName("lala");
		System.out.println(test.getName());
	}

}
