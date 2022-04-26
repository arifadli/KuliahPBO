package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index(){
      Mahasiswa mahasiswa1;
  	  mahasiswa1 = new Mahasiswa();
  	  mahasiswa1.setnama("Bima Adityo Kurniawan");
  	  mahasiswa1.setnim("H1A018048");
	  
	  Mahasiswa mahasiswa2;
  	  mahasiswa2 = new Mahasiswa();
  	  mahasiswa2.setnama("Bima");
  	  mahasiswa2.setnim("H1A0180488");
  	  render(mahasiswa1, mahasiswa2);
    }

}