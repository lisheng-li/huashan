package test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test7 {
	public static void main(String[] args) {
		File file = new File("hello.txt");
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fw = new FileWriter(file);
			fw.write("hello world");
			fw.flush();
			fr = new FileReader(file);
			char[] ch = new char[1024];
			fr.read(ch);
			for (char c : ch) {
				System.out.println(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fw) {
					fw.close();
				}
				if (null != fr) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
