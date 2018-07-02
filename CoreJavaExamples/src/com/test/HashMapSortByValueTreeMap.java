package com.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class HashMapSortByValueTreeMap {
	  //Method for sorting the TreeMap based on values
	  public static <K, V extends Comparable<V>> Map<K, V> 
	    sortByValues(final Map<K, V> map) {
	   	 
	    Map<K, V> sortedByValues = 
	      new TreeMap<K, V>(new Comparator<K>() {
		      public int compare(K k1, K k2) {
			        return map.get(k1).compareTo(map.get(k2));			 
			  }
	      });
	    sortedByValues.putAll(map);
	    return sortedByValues;
	  }
	  public static void main(String args[]) {
	 
	    Map<String, Integer> unsortedMap = new HashMap<String, Integer>();

	    // Put elements to the map
	    unsortedMap.put("Key1", 100);
	    unsortedMap.put("Key2", 90);
	    unsortedMap.put("Key3", 80);
	    unsortedMap.put("Key4", 70);
	    unsortedMap.put("Key5", 60);
	 
	    // Calling the method sortByvalues
	    Map<String, Integer> sortedMap = sortByValues(unsortedMap);
	 
	    System.out.println(sortedMap);
	  }
	}