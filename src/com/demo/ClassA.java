package com.demo;

public class ClassA {
	int a = 10;
	static int b = 40;
	
	public void meth1() {
		int c = a+b;
		System.out.println("the output is "+c);
		
	}

	public static void main(String[] args) {
      ClassA n = new ClassA();
      
		n.meth1()
	}

}
