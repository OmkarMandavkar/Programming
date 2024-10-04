/*
Given a string a containing just the charactere '(', ')', '[', ']', '{' and '}', 
find if the input string is valid.

An Input string ta valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
Input a = "000"
Output true

*/

package string;

import java.util.Stack;

public class P15 {
	public static void main(String[] args) {

		String s = "{{}([])}";

		Stack<Character> stk = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == '{' || ch == '[' || ch == '(') {
				stk.push(ch);
			} 
			
			else if (stk.empty()) {
				System.out.println("Invalid");
				return;
			} 
			
			else {
				char pop = stk.pop();

				switch (pop) {

				case '(':
					if (ch != ')') {
						System.out.println("Invalid");
						return;
					}
					break;
			
				case '[':
					if (ch != ']') {
						System.out.println("Invalid");
						return;
					}
					break;
				
				case '{':
					if (ch != '}') {
						System.out.println("Invalid");
						return;
					}
					break;
				}
			}
		}

		if (stk.isEmpty()) {
			System.out.println("Valid");
		} 
		else {
			System.out.println("Not Valid");
		}
	}

}
