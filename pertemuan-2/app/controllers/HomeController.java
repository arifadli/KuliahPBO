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
	  akun1.setInitialBalance(1000.00);
	  akun1.add(25);
	  akun1.deduct(100);
	  
	  Account akun2;
	  akun2  = new Account("David", 29, 34.00);
	  
  	  render(akun1, akun2);
    }

}