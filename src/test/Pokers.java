package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pokers {
	
	private static final String[] COLORS = {"S", "♠", "♦", "♣", "♥"};
	
	private static final String[] POKERS = {"3", "4", "5", "6", 
											"7", "8", "9", "10", 
											"J", "Q", "K", "A",
											"2", "S1", "S2"};
	
	private APoker aPoker;
	
	private List<APoker> aPokerList;
	
	private List<PokerGroup> pokerGroupList;
	
	private int PokerCount;

	public APoker getaPoker() {
		return aPoker;
	}

	public void setaPoker(APoker aPoker) {
		this.aPoker = aPoker;
	}

	public List<APoker> getaPokerList() {
		return aPokerList;
	}

	public void setaPokerList(List<APoker> aPokerList) {
		this.aPokerList = aPokerList;
	}

	public List<PokerGroup> getPokerGroupList() {
		return pokerGroupList;
	}

	public void setPokerGroupList(List<PokerGroup> pokerGroupList) {
		this.pokerGroupList = pokerGroupList;
	}

	public int getPokerCount() {
		return PokerCount;
	}

	public void setPokerCount(int pokerCount) {
		PokerCount = pokerCount;
	}
	
	public List<APoker> foundPokers() {
		aPokerList = new ArrayList<APoker>();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 15; j++) {
				APoker aPoker = new APoker(i, findColor(i),j, findPoker(j));
				if (i == 0 && j > 12) {
					aPokerList.add(aPoker);
				} 
				if (i != 0 && j <=12) {
					aPokerList.add(aPoker);
				}
			}
		}
		return aPokerList;
	}
	
	public List<APoker> shufflePoker() {
		Collections.shuffle(aPokerList);
		return aPokerList;
	}
	
	public List<APoker> sortPoker() {
		Collections.sort(aPokerList);
		return aPokerList;
	}
	
	public String findColor(int i) {
		return COLORS[i];
	}
	
	public String findPoker(int j) {
		return POKERS[j];
	}
	
	public List<PokerGroup> pokerGrouping() {
		pokerGroupList = new ArrayList<PokerGroup>();
		for (APoker aPoker : aPokerList) {
			PokerGroup pg = getPokerGroup(aPoker);
			if (pg == null) {
				pg = new PokerGroup(aPoker.getColorId(), aPoker.getPokerValue()); 
				pg.getPokerList().add(aPoker);
				pg.setPokerGroupCount(pg.getPokerList().size());
				pokerGroupList.add(pg);
			} else {
				pokerGroupList.add(pg);
			}
		}
		return pokerGroupList;
	}
	
	public PokerGroup getPokerGroup(APoker aPoker) {
		PokerGroup pg = null;
		for (PokerGroup a : pokerGroupList) {
			if (aPoker.getColorId() == a.getColorGroupId()) {
				pg = a;
			}
		}
		return pg;
	}

}
