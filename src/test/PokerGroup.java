package test;

import java.util.ArrayList;
import java.util.List;

public class PokerGroup {
	
	public int colorGroupId;
	
	public String colorGroupValue;
	
	private List<APoker> pokerList = new ArrayList<APoker>();
	
	private int pokerGroupCount;

	public int getColorGroupId() {
		return colorGroupId;
	}

	public void setColorGroupId(int colorGroupId) {
		this.colorGroupId = colorGroupId;
	}

	public String getColorGroupValue() {
		return colorGroupValue;
	}

	public void setColorGroupValue(String colorGroupValue) {
		this.colorGroupValue = colorGroupValue;
	}

	public List<APoker> getPokerList() {
		return pokerList;
	}

	public void setPokerList(List<APoker> pokerList) {
		this.pokerList = pokerList;
	}

	public int getPokerGroupCount() {
		return pokerGroupCount;
	}

	public void setPokerGroupCount(int pokerGroupCount) {
		this.pokerGroupCount = pokerGroupCount;
	}

	
	public PokerGroup(int colorGroupId, String colorGroupValue) {
		super();
		this.colorGroupId = colorGroupId;
		this.colorGroupValue = colorGroupValue;
	}

	@Override
	public String toString() {
		return "PokerGroup [colorGroupValue=" + colorGroupValue + ", pokerList=" + pokerList + "]";
	}

}
