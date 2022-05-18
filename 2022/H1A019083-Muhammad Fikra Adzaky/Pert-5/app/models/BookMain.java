package models;

public class BookMain {
	public static void main (String[] args)
	{
		Penerbit pnrbt = new Penerbit("Darul Anon","Bangladesh");
		
		Fiksi fic = new Fiksi(pnrbt, "Kancil dan Pak Tani", 15203, 1998,"Dongeng","Anak-Anak");
		nonFiksi nf = new nonFiksi(pnrbt, "Politik Zaman Rasulullah", 45271, 2017, "Sejarah Islam");
		fic.display();
		nf.display();
	}
}
