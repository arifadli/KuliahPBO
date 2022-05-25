package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {
	
    public static void index(){
      Person person1;
	  Account akun1;
  	  person1 = new Person();
  	  person1.setnama("Dayu");
  	  person1.setnoiden(12345);
	  
	  akun1 = new Account();
	  akun1.setOwner(person1);
	  akun1.setInitialBalance(10000000.00);
	  akun1.add(250000);
	  akun1.deduct(1000000);
	  
	  Account akun2;
	  akun2  = new Account("Januar", 7007, 999999.00);
	  
  	  render(akun1, akun2);
    }

}
