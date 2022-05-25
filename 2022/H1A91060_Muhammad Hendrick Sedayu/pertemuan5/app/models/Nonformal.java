package models;

public class Nonformal extend Shoe {

	public String NFtype;
	public String agegroup;
	
	public Nonformal(String brand, String colour, int size, String NFtype, String agegroup)
	{
		
		super(brand, colour, size);
		this.NFtype = NFtype;
		this.agegroup = agegroup;
	
	}
	public void display()
	{
		
		super.display();
		System.out.println(" Tipe non Formal " + NFtype);
		System.out.println(" Kelompok Umur " + agegroup);
	
	}
}
