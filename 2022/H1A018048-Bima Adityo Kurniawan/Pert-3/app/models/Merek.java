package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import play.db.jpa.Model;

@Entity
public class Merek extends Model{
	
   public String nama;
   
   // Relasi
   @ManyToOne
   public Item namaItem;
   
   public String toString(){
		return this.nama;
	}
}
