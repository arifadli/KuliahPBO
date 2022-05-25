package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.data.validation.Required;
import play.data.validation.Unique;
import play.db.jpa.Model;

@Entity
public class BidangIlmu extends Model {

    /**
     *
     */
    
	@Required
    @Unique
    public String kodebidilmu;
	
	@Required
    @Unique
    public String namabidilmu;
    

    
    /**
     *
     */
    @OneToMany(mappedBy="bidangilmu", cascade=CascadeType.ALL)
    public List<Matakuliah> bidangilmuku;
    
    /**
     *
     * @return
     */
    public String toString() {
		return this.namabidilmu;
	}
    
    /**
     *
     * @param namaJurusan
     * @param fakultas
     */
    public BidangIlmu(String kodebidilmu, String namabidilmu) {
    	this.kodebidilmu = kodebidilmu;
    	this.namabidilmu = namabidilmu;
	}
}
