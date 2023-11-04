//Created by: Edward Mankiewicz
//Created on: November 4th, 2023
//Purpose: To show basic understanding/progress of Stacks

package introToFuncProgramming;

import java.util.Stack;

public class StackSummary {

	public static void printNextGreaterElement(int[] arr) {
		if (arr.length==0) {
			System.out.println();
			return;
		}
		Stack<Integer> stack = new Stack<>();
		for (int i =0; i<arr.length;i++) {
			int next = arr[i];
			while (!stack.isEmpty()&&stack.peek()<next) { //stack not empty && next popped var < current element
				System.out.println(stack.pop() + " --> " + next);
			}
			stack.push(next);
			
			}
		while (!stack.isEmpty()) { //if no var is < than current element
			System.out.println(stack.pop() + " --> " + -1);
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,5,19,4,10,11};
		printNextGreaterElement(arr);

	}

}
