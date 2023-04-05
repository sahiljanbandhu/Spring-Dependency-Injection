package springdemo1;

public class Pen {
	String name;
	double price;
	String colour;

	public Pen(String name, double price, String colour) {
		this.name = name;
		this.price = price;
		this.colour = colour;
		System.out.println("Pen is called");
	}
}
