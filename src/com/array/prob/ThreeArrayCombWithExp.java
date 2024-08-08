package com.array.prob;
/*Given 3 unsorted arrays A, B and C you need to find all possible 
combinations such that A[i] + B[j] = B[k] + C[l]. java code*/
import java.util.*;
public class ThreeArrayCombWithExp {

	public static void main(String[] args) {
		int[] A = {1, 2, 3};
        int[] B = {4, 1, 6};
        int[] C = {7, 5, 9};
        
        List<String> res=new ArrayList<>();
        Map<Integer,List<int[]>> map=new HashMap<>();
        
        for(int i=0;i<A.length;i++) {
        	for(int j=0;j<B.length;j++) {
        		int sumAB=A[i]+B[j];
        		map.putIfAbsent(sumAB, new ArrayList<>());
        		map.get(sumAB).add(new int[]{i,j});
        	}
        }
        
        for(int k=0;k<B.length;k++) {
        	for(int l=0;l<C.length;l++) {
        		int sumBC=B[k]+C[l];
        		if(map.containsKey(sumBC)) {
        			for(int[] pair:map.get(sumBC)) {
        				int i=pair[0];
        				int j=pair[1];
        				res.add("A["+i+"] +"+" B["+j+"]   =  B["+k+"]   +"+" C["+l+"]\n");
        			}
        		}
        	}
        }
		
        System.out.println(res);

	}
	
}
