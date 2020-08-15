package test;

public class APoker implements Comparable<APoker>{
	
	private int colorId;
	
	private String color;
	
	private int pokerValueId;
	
	private String pokerValue;

	public int getColorId() {
		return colorId;
	}

	public void setColorId(int colorId) {
		this.colorId = colorId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPokerValueId() {
		return pokerValueId;
	}

	public void setPokerValueId(int pokerValueId) {
		this.pokerValueId = pokerValueId;
	}

	public String getPokerValue() {
		return pokerValue;
	}

	public void setPokerValue(String pokerValue) {
		this.pokerValue = pokerValue;
	}

	public APoker(int colorId, String color, int pokerValueId, String pokerValue) {
		super();
		this.colorId = colorId;
		this.color = color;
		this.pokerValueId = pokerValueId;
		this.pokerValue = pokerValue;
	}

	@Override
	public String toString() {
		return "APoker [color=" + color + ", pokerValue=" + pokerValue + "]";
	}

	@Override
	public int compareTo(APoker o) {
		int val = this.colorId - o.colorId;
		if (val == 0) {
			val = this.pokerValueId - o.pokerValueId;
		}
		return val;
	}
}
