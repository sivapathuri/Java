package com.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

// Sort hashMap by values
public class HashMapSortByValueTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("A", 100);
		hm.put("B", 10);
		hm.put("B1", 1);
		
		System.out.println("Unsorted HashMap: " + hm);
		
		Set<Map.Entry<String,Integer>> sortedEntries = new TreeSet<Map.Entry<String,Integer>>(new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}});
		
		sortedEntries.addAll(hm.entrySet());
		System.out.println("Sorted Treeset:" + sortedEntries);
		
		Map<String,Integer> sortedMap = new LinkedHashMap<String,Integer>();
		Iterator<Map.Entry<String,Integer>> it = sortedEntries.iterator();
		while(it.hasNext()) {
			Map.Entry<String,Integer> next = it.next();
			String key = next.getKey();
			Integer value = next.getValue();
			sortedMap.put(key, value);
		}
		System.out.println("Sorted Map:" + sortedMap);
	}

}
