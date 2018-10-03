package com.coding.stacksqueues;

import java.util.Stack;

class NodeWithMin {
	public int value;
	public int min;
	public NodeWithMin(int value, int min) {
		this.value = value;
		this.min = min;
	}
}

public class StackMin extends Stack<NodeWithMin>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		StackMin stack = new StackMin();
		stack.push(1);
		stack.push(500);
		stack.push(-5);
		System.out.println(stack.min());
	}
	
	public void  push(int value) {
		int newMin = Math.min(value, min());
		super.push(new NodeWithMin(value, newMin));
	}
	
	public int min() {
		if (this.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return this.peek().min;
		}
	}
}
