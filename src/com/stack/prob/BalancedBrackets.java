package com.stack.prob;

import java.util.*;
import java.io.*;

public class BalancedBrackets {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String ip=sc.nextLine();
		boolean res;
		Stack<Character> st=new Stack<>();
		for(int i=0;i<ip.length();i++) {
			char ch=ip.charAt(i);
			if(ch=='('|| ch=='['||ch=='{') {
				st.add(ch);
			}else if(ch==')') {
				res=checkbrace(st,'(');
			}else if(ch==']') {
				res=checkbrace(st,'[');
			}else if(ch=='}') {
				res=checkbrace(st,'{');
			}
		}
		if(st.size()==0) {
			res=true;
		}else {
			res=false;
		}
		System.out.println(res);
	}

	public static boolean  checkbrace(Stack<Character> st,char sym) {
		if(st.size()==0) {
			return false;
		}else if(st.peek()!=sym){
			return false;
		}else {
			st.pop();
			return true;
		}
	}

}
