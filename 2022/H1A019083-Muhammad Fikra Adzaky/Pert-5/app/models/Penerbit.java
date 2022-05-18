package models;

public class Penerbit {
	public String namaPenerbit;
	public String kota;
	public Penerbit(String np, String kota)
	{
		this.namaPenerbit = np;
		this.kota = kota;
	}
	public void display()
	{
		System.out.println("Penerbit : " + namaPenerbit + ", " + kota);
	}
}
