package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Sort hashMap by values
public class HashMapSortByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> hm = new HashMap<String,String>();
		hm.put("A", "Z");
		hm.put("B", "Y");
		hm.put("B1", "X");
		
		System.out.println("Unsorted HashMap: " + hm);
		Set<Entry<String,String>> entrySet = hm.entrySet();
		
		List<Entry<String,String>> al = new ArrayList<Entry<String,String>>(entrySet);
		hm.put("B2", "W");
		
		Collections.sort(al, new Comparator<Entry<String,String>>() {
			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		System.out.println("Sorted HashMap:" + al);
	}

}
