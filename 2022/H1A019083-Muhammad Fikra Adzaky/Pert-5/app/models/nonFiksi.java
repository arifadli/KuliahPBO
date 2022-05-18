package models;

public class nonFiksi extends Book{
	public String genreNF;
	public nonFiksi(Penerbit pnrbt, String judul, int indeks, int tahunTerbit, String genreNF)
	{
		super(pnrbt, judul, indeks, tahunTerbit);
		this.genreNF = genreNF;
	}
	public void display()
	{
		super.display();
		System.out.println("Genre Non Fiksi : " + genreNF);
	}
}
