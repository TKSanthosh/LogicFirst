package com.constructor;
class box1{
	int length;
	int breadth;
	int height;
	
	box1(int x, int y,int z){
		length = x;
		breadth = y;
		height = z;
		System.out.println(length + " " + breadth +" "+height);
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
public class AnonymousObjectAndDereference {

	public static void main(String[] args) {
		new box1(1,2,3); //AnonymousObject
		//it will automatically dereference itself
		box1 blackbox = new box1(1,2,3);
		blackbox.setdim(4,5,6);
		System.out.println(blackbox.volume());
		blackbox = null; //kind of dereferencing
		box1 wood = new box1(2,5,6);
		wood = blackbox; //another type of deferencing
	}
}
