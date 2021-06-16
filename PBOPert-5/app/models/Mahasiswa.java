package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import play.db.jpa.Model;

@Entity
public class Mahasiswa extends Model{
	
   public String nama;
   public String nim;
   public String Alamat;
   public Date tgllahir;
   
   // Relasi
   @ManyToOne
   public JenisKelamin kelamin;
   
   public String toString(){
		return this.nama;
	}
}
