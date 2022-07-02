package controllers;

import play.mvc.*;
import java.util.List;
import models.User;
import models.Book;

public class Application extends Controller {

    public static void index() {
        // if(connected() != null) {
        // 	dashboard();
        // }
        render();
    }
    
    public static void register() {
        render();
    }

    public static void login() {
        render();
    }

    /**
     * @param objuser
     */
    public static void buatAkun(User objuser){
        objuser.username = "Selamat! " + '\n' + "Akun " + objuser.username + " berhasil dibuat!";
        render(objuser);
    }

    public static void selamatDatang(User objuser){
        render();
    }
    
    public static void tampil(){
        List daftar = Book.findAll();
        render(daftar);
    }
}