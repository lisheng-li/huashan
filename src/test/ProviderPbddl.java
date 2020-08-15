package test;

import java.io.File;
import java.util.Map;

public class ProviderPbddl {

	public final Map<String, Provider> namedKeyRecord = null;
	
	public static final String PATH = 
			"D:\\webdownload\\software\\eclipse-jee-2019-09-R-win32-x86_64\\eclipse\\workspace\\Demo\\src\\file";
	
	public ProviderPbddl() {
		File file = new File(PATH);
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				String key = f.getName().substring(0, 7).toUpperCase();
				namedKeyRecord.put(key, new Provider(f));
			}
		}
	}
	
	public Provider getProviderByKey(String key) {
		return this.namedKeyRecord.get(key);
	}
}
