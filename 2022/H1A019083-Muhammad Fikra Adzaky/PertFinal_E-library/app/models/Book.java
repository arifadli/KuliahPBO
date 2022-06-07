package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Book{
	public String judul;
	public int indeks;
	public int tahunTerbit;
	Penerbit pnrbt;
	
	// Konstruktor
	public Book(Penerbit pnrbt, String judul, int indeks, int tahunTerbit)
	{
		this.pnrbt = pnrbt;
		this.judul = judul;
		this.indeks = indeks;
		this.tahunTerbit = tahunTerbit;
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
	public int getTahun() {
		return tahunTerbit;
	}
	
	// Setter
	public void setJudul(String jdl) {
		judul = jdl;
	}
	public void setIndeks(int ind) {
		indeks = ind;
	}
	public void setTahun(int tahun) {
		tahunTerbit = tahun;
	}
}
