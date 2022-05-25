package models;

public class Formal extend Shoe {
	
	public String Formaltype;
	public String agegroup;
	
	public Formal(String brand, String colour, int size, String Formaltype, String agegroup)
	{
		
		super(brand, colour, size);
		this.Formaltype = Formaltype;
		this.agegroup = agegroup;
	
	}
	public void display()
	{
		
		super.display();
		System.out.println(" Tipe Formal " + Formaltype);
		System.out.println(" Kelompok Umur " + agegroup);
	
	}
}
