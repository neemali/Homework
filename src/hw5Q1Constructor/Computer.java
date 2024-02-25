package hw5Q1Constructor;

//import java.security.PublicKey;

public class Computer {
// variables declared
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	// Default Constructor Declared
	public Computer() {
		System.out.println("This is from the default Constructor of Computer class");
	}

	// Parameterized Constructor01 Declared
	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My Brand: " + brand + ", Model: " + model + ", Operating system: " + operatingSystem
				+ ", Price: $" + price + ", Grade: " + grade + ", and Made In USA? Ans: " + madeInUSA + ".");
	}

}
