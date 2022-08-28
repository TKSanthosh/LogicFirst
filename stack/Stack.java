package com.stack;

public class Stack {
	int arr[] = new int[10];
	int tos;
	Stack() {
		tos = -1;
		}
	public void push(int a) {
		arr[++tos] = a;
	}
	public int pop() {
		if(tos >= 0) {
			return arr[tos--];
		}
		else {
			
			System.out.println("Empty");
			return -1;
		}
		
		
	}
}
