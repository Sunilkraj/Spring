package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting property");
		this.price = price;
	}

	public Samosa() {
		super();
		System.out.println("creatig Instance");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void hey() {
		System.out.println("init()");
	}
	
	public void bye() {
		System.out.println("destroy()");
	}
}
