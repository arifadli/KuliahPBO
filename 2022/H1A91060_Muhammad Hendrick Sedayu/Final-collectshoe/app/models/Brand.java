package models;

import javax.persistance.Entity;

import play.db.jpa.Model;

@Entity
public class Brand extends Model {

    public String namabrand;

    public String toString (){
        return "Brand" + namabrand; 

    }
}




