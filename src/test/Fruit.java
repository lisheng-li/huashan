package test;

public enum Fruit {
	
	Apple("apple", 1),
	
	Orange("orange", 2),
	
	Melon("melon", 3);
	
	private Fruit(String value, int id) {
		this.value = value;
		this.id = id;
	}
	
	private String value;
	
	private int id;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
