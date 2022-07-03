package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;
 
@Entity
public class Book extends Model{
	public String judul;
	public int indeks;
	public int tahunTerbit;

	@ManyToOne
	public Penerbit pnrbt;

	// Konstruktor
	public Book(String judul, int indeks, int tahunTerbit, Penerbit pnrbt) {
		this.judul = judul;
		this.indeks = indeks;
		this.tahunTerbit = tahunTerbit;
		this.pnrbt = pnrbt;
	}

	public void display()
	{
		System.out.println("\nJudul : " + judul);
		System.out.println("Indeks Buku " + indeks);
		System.out.println("Tahun Terbit " + tahunTerbit);
		pnrbt.display();
	}

	// Getter
	public String getJudul() {
		return judul;
	}
	public int getIndeks() {
		return indeks;
	}
	public Penerbit getPnrbt() {
		return pnrbt;
	}
	public int getTahunTerbit() {
		return tahunTerbit;
	}
	
	// Setter
	public void setJudul(String jdl) {
		judul = jdl;
	}
	public void setIndeks(int ind) {
		indeks = ind;
	}
	public void setPnrbt(Penerbit pnrbt) {
		this.pnrbt = pnrbt;
	}
	public void setTahunTerbit(int tahunTerbit) {
		this.tahunTerbit = tahunTerbit;
	}
	
	/* (non-Javadoc)
	 * @see play.db.jpa.JPABase#toString()
	 */
	@Override
	public String toString() {
		return "Buku " + judul;
	}
}
