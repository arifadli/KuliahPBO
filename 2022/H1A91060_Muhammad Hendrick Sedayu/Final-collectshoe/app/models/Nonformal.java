package models;

public class Nonformal extends Shoe {

	public String NFtype;
	
	public Nonformal(String brand, String colour, int size, String NFtype)
	{
		
		super(brand, colour, size);
		this.NFtype = NFtype;
	
	}
	public void display()
	{
		
		super.display();
		System.out.println(" Tipe non Formal " + NFtype);
	
	}
}
