package test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Test1 {
	
	public final static int MAX_ROW = 10;

	public static void main(String[] args) {
		final String sell = "111llsss123";
		String sell2 = sell.replaceAll("1", "");
		System.out.println(sell2);
		
		System.out.println("---------------------");
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("12");
		list.add("13");
		list.add("1345");
		list.add("145");
		list.add("165");
		list.add("16a5");
		list.add("16s5");
		list.add("16s5");
		list.add("16d5");
		list.add("16s5");
		list.add("d165");
		
		
		// remove
		if (list.size() > MAX_ROW) {
			ListIterator<String> it = list.listIterator(MAX_ROW);
			while (it.hasNext()) {
				it.next();
				it.remove();
			}
		}
		
		System.out.println(list.size());
		
		List<ListVO> listVOs = new ArrayList<ListVO> ();
		listVOs.add(new ListVO("1", "li"));
		listVOs.add(new ListVO("34", "li"));
		listVOs.add(new ListVO("4", "li"));
		listVOs.add(new ListVO("a", "li"));
		listVOs.add(new ListVO("67", "li"));
		listVOs.add(new ListVO("89", "li"));
		
		Collections.sort(listVOs);
		
		SC13900Action action = new SC13900Action();
		action.setFocusId("list\\\\[0\\\\].action");
		action.test(9);
		System.out.println(action.getFocusId());
		System.out.println(action.getNum());
		
		System.out.println("---------------------");
		
		action.setPrice(new BigDecimal("32.23"));
		System.out.println(action.getPrice().add(new BigDecimal("32.23")));
		
		
		// Arrays.asList(arr).contains(targetValue);
		
		List<String> list1 = new ArrayList<String>();
		list1.add("12");
		list1.add("1243");
		list1.add("132");
		list1.add("1234");
		list1.add("1234");
		list1.add("132");
		list1.add("1234");
		list1.add("12");
		list1.add("1342");
		list1.add("1234");
		
		String[] strings = new String[] {"12", "132", "1234"};
		List<String> listAll = Arrays.asList(strings);
		for (int i = list1.size() - 1; i >= 0; i--) {
			String temp = list1.get(i);
			if (listAll.contains(temp)) {
				list1.remove(i);
			}
		}
		System.out.println(list1);
		
		Iterator<String> it = list1.iterator();
		while (it.hasNext()) {
			if ("1342".equals(it.next())) {
				it.remove();
			}
		}
		System.out.println(list1);
		
		SortedMap<String, Object> sortedMap = new TreeMap<String, Object> ();
		sortedMap.put("1b"	, "a");
		sortedMap.put("2"	, "b");
		sortedMap.put("4b"	, "d");
		sortedMap.put("3"	, "c");
		sortedMap.put("2b"	, "d");
		sortedMap.put("3b"	, "c");
		
		Set<Entry<String, Object>> entrys = sortedMap.entrySet();
		for (Entry<String, Object> entry : entrys) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println("--------------------");
		Map<String,Object> hashMap = new HashMap<String,Object>();
		hashMap.put("1b", "a");
		hashMap.put("2"	, "b");
		hashMap.put("4b", "d");
		hashMap.put("3"	, "c");
		hashMap.put("2b", "d");
		hashMap.put("3b", "c");
		
		Set<Entry<String, Object>> ents = hashMap.entrySet();
		for (Entry<String, Object> entry : ents) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		
	}
	
	private boolean containsKey(String[] arr, String targetStr) {
		return Arrays.asList(arr).contains(targetStr);
	}
}
