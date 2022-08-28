package com.methods;

public class MethodOverloading {
	static int max(int a,int b) {
		return a > b ? a : b;
	}
	static double max(double a,double b) {
		return a > b ? a : b;
	}
	static char max(char a,char b) {
		return a > b ? a : b;
	}
	
	static void test() {
		System.out.println("no args");
	}
	static void test(int a) {
		System.out.println("with 1 args");
	}
	static void test(int a ,int b) {
		System.out.println("with 2 args");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(5,6));
		System.out.println(max(5.00,6.00));
		System.out.println(max('a','b'));
		
		
		test();
		test(1);
		test(2,3);
	}

}
