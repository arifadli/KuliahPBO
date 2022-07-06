package models;

import javax.persistance.Entity;
import javax.persistance.ManyToOne;

@Entity
public class Shoe extends Model{
	public String colour; 
	public int size;
	@ManyToOne
	public Brand brand;
	
	// cons
	public Shoe(String colour, int size)
	{
		this.colour = colour;
		this.size = size;
	}
	
	public void display()
	{
		System.out.println("Colour " + colour);
		System.out.println("Size " + size);
	}
	
	// Getter
	public String getColour() {
		return colour;
	}
	public int getSize() {
		return size;
	}
	
	// Setter
	public void setColour(String wrn) {
		colour = wrn;
	}
	public void setSize(int ukuran) {
		size = ukuran;
	}
}