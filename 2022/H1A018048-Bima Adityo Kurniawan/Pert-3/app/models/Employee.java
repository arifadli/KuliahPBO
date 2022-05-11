package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Employee extends Model {
	public String namadepan;
	public String namabelakang;
	public int noidentitas;
	
	public String toString(){
		return this.namadepan;
		return this.namabelakang;
		return this.noidentitas;
	}
	

}
