package models;

import play.db.jpa.Model;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class RoomType extends Model {
	public String tiperuang;
}
