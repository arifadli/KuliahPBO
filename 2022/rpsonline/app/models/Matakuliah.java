package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.mysql.jdbc.Blob;

import play.data.validation.Required;
import play.data.validation.Unique;
import play.db.jpa.Model;

@Entity
public class Matakuliah extends Model {

    /**
     *
     */
    @Required
    @Unique
    public String kodemk;
    
    /**
     *
     */
    @Unique
    public String namamk;
    
    @Required
    public Blob photo;
    
    /**
     *
     */
    @Required
    @ManyToOne
    public BidangIlmu bidangilmu;
    
    @Required
    @ManyToOne
    public StdKomp stdkomp;
    
    /**
     *
     * @return
     */
    public String toString() {
		return this.namamk;
	}
    
    public Matakuliah(String kodemk, String namamk, BidangIlmu bidangilmu) {
		this.kodemk = kodemk;
		this.namamk = namamk;
		this.bidangilmu = bidangilmu;
	}
}