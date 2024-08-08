package com.array.prob;

public class OddEvenArray {

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int l=0;
		int r=arr.length-1;
		
		while(l<r) {
			while(l<r && arr[l]%2!=0) {
				l++;
			}
			while(l<r && arr[r]%2==0) {
				r--;
			}
			if(l<r) {
				int temp=arr[l];
				arr[l]=arr[r];
				arr[r]=temp;
				l++;
				r--;
			}			
		}
		for(int i:arr) {
		System.out.println(i);
		}

	}

}
