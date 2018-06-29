package com.test;

import java.util.Arrays;

public class ParallelSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = 5000000;
		int[] data1 = new int[len];
		int[] data2 = new int[len];
		for(int i = 0; i < len ; i++) {
			Double rand = Math.random() * len;
			data1[i] = rand.intValue();
			data2[i] = rand.intValue();
		}
		long st =  System.nanoTime();
		Arrays.sort(data1);
		System.out.println("Time: " + (System.nanoTime() - st));
		st = System.nanoTime();
		Arrays.parallelSort(data2);
		System.out.println("Time: " + (System.nanoTime() - st));
 	}

}
