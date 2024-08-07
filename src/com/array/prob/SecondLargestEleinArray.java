package com.array.prob;

import java.util.*;
public class SecondLargestEleinArray {

	public static void main(String[] args) {
		int[] arr= {1,4,5,6,99,99,78,89};
		Arrays.sort(arr);
		int size=arr.length;
		for(int i=size-2;i>0;i--) {
			if(arr[i]!=arr[size-1]) {
				System.out.println(arr[i]);
				return;
			}
		}
	
	}

}
