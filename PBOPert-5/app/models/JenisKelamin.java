package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import play.db.jpa.Model;

@Entity
public class JenisKelamin extends Model{	
	public String namaKelamin;
	
	public String toString(){
		return this.namaKelamin;
	}


}
