package com.springcore.ci;

public class Addition {

	private int a;
	private int b;
	
	public Addition(double a, double b) {
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor using double,double");
	} 
	
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor using int,int");
	} 
	
	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor using String,String");
	}
	
	public void doSum() {
		System.out.println("vaue of a = "+a);
		System.out.println("vaue of b = "+b);
		System.out.println("Sum = "+(this.a+this.b));
	}
	
}
