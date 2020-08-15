package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Provider {
	
	public static final String PATTERN = "";
	
	public ArrayList<Record> records = null;

	public Provider(File file) {
		InputStreamReader read = null;
		BufferedReader bufferedReader = null;
		try {
			read = new InputStreamReader(new FileInputStream(file));
			bufferedReader = new BufferedReader(read);
			String line = "";
			try {
				while ((line = bufferedReader.readLine()) != null) {
					Pattern pattern = Pattern.compile(PATTERN);
					Matcher matcher = pattern.matcher(line);
					while (matcher.find()) {
						records.add(new Record(matcher.group(0), matcher.group(1), matcher.group(2)));
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (null != bufferedReader) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != read) {
				try {
					read.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public ArrayList<Record> getRecords() {
		return records;
	}
}
