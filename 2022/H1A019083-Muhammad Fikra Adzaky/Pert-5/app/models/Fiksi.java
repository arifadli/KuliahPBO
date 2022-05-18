package models;

public class Fiksi extends Book {
	public String genreFiksi;
	public String kategori;
	
	public Fiksi(Penerbit pnrbt, String judul, int indeks, int tahunTerbit, String genreFiksi, String kategori)
	{
		super(pnrbt, judul, indeks, tahunTerbit);
		this.genreFiksi = genreFiksi;
		this.kategori = kategori;
	}
	public void display()
	{
		super.display();
		System.out.println("Genre Fiksi : " + genreFiksi);
		System.out.println("Kategori : " + kategori);
	}
}
