package controllers;

import play.*;
import play.mvc.*;

import java.util.*;
import java.util.function.ToIntFunction;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void pert2(){
    	Person person1;
  	  person1 = new Person();
  	  person1.nama = "Ari Fadli";
  	  person1.setnoiden(67890);
  	  render(person1);
    }
    
    public static void buatObjectPerson(){
    	render();
    }
    
    public static void tambahObject(Person objectbaru){
    	objectbaru.nama = objectbaru.nama;
    	objectbaru.getnoiden();
    	render(objectbaru);
    }

}