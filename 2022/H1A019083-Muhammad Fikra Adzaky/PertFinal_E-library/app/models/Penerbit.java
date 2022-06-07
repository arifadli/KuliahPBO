package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
import javax.persistence.Entity;

@Entity
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
