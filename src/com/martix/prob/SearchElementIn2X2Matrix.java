package com.martix.prob;

public class SearchElementIn2X2Matrix {

	public static void main(String[] args) {
		int [][] arr={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
				};
		int n=arr.length;
		int x=14;
		xFound(arr, n, x);

	}

	public static void xFound(int[][] arr, int n, int x) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]==x) {
					System.out.println("Element x found at("+i+","+j+")");
					return;
				}
			}
		}
		System.out.println("Not found");
	}

}
