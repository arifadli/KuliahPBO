package models;

import play.db.jpa.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class RoomManager extends Model {
	public String nama;
	public String nomor;
	public Date tglpembuatan;
	
	@ManyToOne
	public RoomType tiperuang;

}
