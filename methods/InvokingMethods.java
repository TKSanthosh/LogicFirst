package com.methods;
class box{
	int length;
	int breadth;
	int height;
	
	int volume() {
		return length*breadth*height;
	}
}
public class InvokingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		box blackbox = new box();
		blackbox.length =20;
		blackbox.breadth =10;
		blackbox.height = 10;
		System.out.println(blackbox.volume());
	}

}
