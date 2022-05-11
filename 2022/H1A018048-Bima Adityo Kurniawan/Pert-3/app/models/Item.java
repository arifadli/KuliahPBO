package models;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import play.db.jpa.Model;

@Entity

public class Item extends Model{

   public double harga;

	public String namaItem;
        public String toString(){
             return this.namaItem;
             }
}