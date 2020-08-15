package test;

public class Record {
	
	private String key = null;
	private String display = null;
	private String report = null;
	
	public Record() {
		
	}

	public Record(String key, String display, String report) {
		this.key = key;
		this.display = display;
		this.report = report;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}
	
	
}
