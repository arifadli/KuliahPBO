package models;

public class Shoe
	public String brand;
	public String colour; 
	public int size;
	
	// cons
	public Shoe(String brand, String colour, int size)
	{
		this.brand = brand;
		this.colour = colour;
		this.size = size;
		
		
	}
	
	public void display()
	{
		System.out.println("Brand " + brand);
		System.out.println("Colour " + colour);
		System.out.println("Size " + size);
	}
	
	// Getter
	public String getBrand() {
		return brand;
	}
	public String getColour() {
		return colour;
	}
	public int getSize() {
		return size;
	}
	
	// Setter
	public void setBrand(String mrk) {
		brand = mrk;
	}
	public void setColour(String wrn) {
		colour = wrn;
	}
	public void setSize(int ukuran) {
		size = ukuran;
	}
}