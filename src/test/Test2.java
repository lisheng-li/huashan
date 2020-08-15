package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {

	public static void main(String[] args) {
		
		String key = "pbddl910";
		Provider provider = null;
		try {
			provider = ProviderPbddl.class.newInstance().getProviderByKey(key);
			if (provider != null) {
				for (Record record : provider.getRecords()) {
					System.out.println(record.getKey());
					System.out.println(record.getDisplay());
					System.out.println(record.getReport());
				}
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
