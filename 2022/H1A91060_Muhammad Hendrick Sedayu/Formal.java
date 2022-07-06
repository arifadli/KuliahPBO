package models;

public class Formal extends Shoe {
	
	public String Formaltype;
	
	public Formal(String brand, String colour, int size, String Formaltype)
	{
		
		super(brand, colour, size);
		this.Formaltype = Formaltype;
	
	}
	public void display()
	{
		
		super.display();
		System.out.println(" Tipe Formal " + Formaltype);
		
	}
}
