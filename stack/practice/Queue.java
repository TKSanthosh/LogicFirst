package com.stack.practice;

public class Queue {
	private int top;
	private int[] arr ;
	private int length ;
	
	Queue(){
		top = -1;
		length = 10;
		arr = new int[length];
		
	}
	public void enque(int a) {
		if(length < 10) {
			length++;
		}
		arr[++top] = a;
		//System.out.println(length);
	}
	public void deque() {
		if(top > 9) {
			System.out.print("Queue is empty");
			
		}
		else {
			System.out.println(arr[0]);
			mov();
			
		}
	}
	private void mov() {
		length--;
		for(int i=0;i<length-1;i++) {
			arr[i] = arr[i+1];
//			System.out.print(arr[i]+" ");
		}
//		System.out.println(length+" ");
	}
	
}
