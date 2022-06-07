package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.data.validation.Required;
import play.data.validation.Unique;
import play.db.jpa.Model;

@Entity
public class StdKomp extends Model {
	
	@Required
    @Unique
    public String kodestdkomp;
	
	@Required
    @Unique
    public String namastdkomp;
    
    @OneToMany(mappedBy="stdkomp", cascade=CascadeType.ALL)
    public List<Matakuliah> stdkompku;
    
    public String toString() {
		return this.namastdkomp;
	}
    
    public StdKomp(String kodestdkomp, String namastdkomp) {
    	this.kodestdkomp = kodestdkomp;
    	this.namastdkomp = namastdkomp;
	}
}
