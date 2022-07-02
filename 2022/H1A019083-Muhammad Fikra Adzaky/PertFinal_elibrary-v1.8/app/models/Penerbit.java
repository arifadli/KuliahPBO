package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import play.db.jpa.Model;

@Entity
public class Penerbit extends Model {
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

	/* (non-Javadoc)
	 * @see play.db.jpa.JPABase#toString()
	 */
	@Override
	public String toString() {
		return "Penerbit " + namaPenerbit;
	}
}
