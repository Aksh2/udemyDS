package com.problem;

import java.util.Stack;

public class BalancedBraces {
	
	public static void main(String[] args) {
		
		String text = "((()())))";
		
		Stack<Character> st1 = new Stack<Character>();
		
		for(int i=0; i< text.length();i++) {
			st1.push(text.charAt(i));
		}
		
		Stack<Character> st2 = new Stack<Character>();
		boolean isValid = true;
		
		while(!st1.isEmpty()) {
			char parn = st1.pop();
			if(parn == ')') {
				st2.push(parn);
			} else {
				if(st2.isEmpty()) {
					isValid = false;
					break;
				} else {
					st2.pop(); // take one close out
				}
			}
		}
		
		if(isValid && st1.isEmpty() && st2.isEmpty()) {
			System.out.println("Expression is valid");
		} else {
			System.out.println("Expression is not valid");
		}
		
	}
}
