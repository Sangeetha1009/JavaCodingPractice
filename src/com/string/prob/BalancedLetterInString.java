package com.string.prob;

import java.util.HashMap;
import java.util.Map;

/*Given a string containing only R and L. Find the number of balanced
substrings(equal number of L’s and R’s) you will encounter where you 
can traverse only in the left-right direction.
Example 1: RLRRLLRLRL  Answer: 4 (RL, RRLL, RL, RL)
Example 2: LLLLRRRR  Answer:1 (LLLLRRRR)*/

public class BalancedLetterInString {

    public static void main(String[] args) {
        String input1 = "RLRRLLRLRL";
        String input2 = "LLLLRRRRR";
        
        System.out.println("Number of balanced substrings in \"" + input1 + "\": " + countBalancedSubstrings(input1));
        System.out.println("Number of balanced substrings in \"" + input2 + "\": " + countBalancedSubstrings(input2));
    }

    public static int countBalancedSubstrings(String s) {
    	int count=0;
    	int balance=0;
    	for(char ch:s.toCharArray()) {
    		if(ch=='R') {
    			balance++;
    		}else if(ch=='L') {
    			balance--;
    		}
    		if(balance==0) {
    			count++;
    		}   		
    	}
    	
     return count;
    }
}

