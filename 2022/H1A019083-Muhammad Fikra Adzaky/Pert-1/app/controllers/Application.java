package controllers;

import play.*;
import play.mvc.*;

import java.util.*;
import views.html.*;
import models.Mahasiswa;

public class Application extends Controller {

    public static Result index() {
		Mahasiswa mhs1, mhs2;
		
		mhs1 = new Mahasiswa();
		mhs1.setnama("M Fikra Adzaky");
		mhs1.setnim(19083);
		
		mhs2 = new Mahasiswa();
		mhs2.setnama("Ismail bin Mail");
		mhs2.setnim(19000);
		render(mhs1, mhs2);
	}
}