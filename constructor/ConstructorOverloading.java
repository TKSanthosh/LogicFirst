package com.constructor;
class area{
	
	area(int a){
		System.out.println(a*a);
	}
	area(int a ,int b){
		System.out.println(a*b);
	}
	area(int a ,int b,int c){
		System.out.println(a*b*c);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area square = new area(2);
		area rectangle = new area(4,6);
		area triangle = new area(4,5,6);
	}

}
