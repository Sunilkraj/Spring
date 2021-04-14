package com.springcore.javaconfig;

public class Student {
	private Samosa samaosa;
	
	public Student(Samosa samaosa) {
		super();
		this.samaosa = samaosa;
	}

	public Samosa getSamaosa() {
		return samaosa;
	}

	public void setSamaosa(Samosa samaosa) {
		this.samaosa = samaosa;
	}

	public void study() {
		samaosa.display();
		System.out.println("Student is studying...");
	}
}
