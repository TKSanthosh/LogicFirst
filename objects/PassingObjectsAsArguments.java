package com.objects;
class box{
	int length;
	int breadth;
	int height;
	
	box (box b){
		length = b.length;
		breadth = b.breadth;
		height = b.height;
		
	}
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
	boolean isequals(box b) {
		if(length==b.length && breadth==b.breadth && height==b.height)
			return true;
		return false;
	}
}
public class PassingObjectsAsArguments {

	public static void main(String[] args) {
		
		box blackbox = new box(1,2,3);
		box b1 = new box(1,2,3);
		System.out.println(blackbox.isequals(b1));
		box b2 = new box(b1);
		System.out.println(b2.length);
	}

}
