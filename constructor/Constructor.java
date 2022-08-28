package com.constructor;
class box{
	int length;
	int breadth;
	int height;
	
	box(int x, int y,int z){
		length = x;
		breadth = y;
		height = z;
	}
	public void setdim(int x, int y, int z) {
		length = x;
		breadth = y;
		height = z;
	}
	int volume() {
		return length*height*breadth;
	}
	
}
public class Constructor {

	public static void main(String[] args) {
		box blackbox = new box(1,2,3);
		blackbox.setdim(4,5,6);
		System.out.println(blackbox.volume());
	}
}
