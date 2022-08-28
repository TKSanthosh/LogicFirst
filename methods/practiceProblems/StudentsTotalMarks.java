package com.methods.practiceProblems;

import java.util.Scanner;

class student{
	String name;
	int rollno;
	int marks[] = new int[5];
	
	student(String n,int r,int[] arr) {
		name = n;
		r = rollno;
		marks = arr;
	}
	
	int marksTotal() {
		
		int sum =0;
		System.out.println(name);
		System.out.println(rollno);
		for(int i: marks) {
			sum = sum+ i;
		}
		return sum;
	}
}
public class StudentsTotalMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[] {99,100,100,100,100};
		student s1 = new student("santhosh",57,arr);
		
		System.out.println(s1.marksTotal());
	}

}
