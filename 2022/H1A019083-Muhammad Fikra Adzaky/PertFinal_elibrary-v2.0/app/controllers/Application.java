package controllers;

import play.mvc.*;
import java.util.List;
import models.User;
import models.Book;
import models.Penerbit;

@With(Secure.class)
public class Application extends Controller {

    public static void login() {
        render();
    }

    public static void index() {
        String pengguna_now = Security.connected();
        User pengguna = User.find("username=?",pengguna_now).first();
        render(pengguna);
    }
    
    public static void register() {
        render();
    }

    /**
     * @param objuser
     */
    public static void buatAkun(User objuser){
        objuser.save();
        index();
    }

    public static void selamatDatang(User objuser){
        render();
    }
    
    public static void tampilbuku(){
        List daftar = Book.findAll();
        render(daftar);
    }

    public static void tambahBuku(){
        System.out.println("Buku berhasil ditambahkan!");
        render();
    }

    public static void unduhBuku(){
        render();
    }

    public static void editBuku(Long id){
        Book bc = Book.find("id=?",id).first();
        render(bc);
    }

    /**
     * @param bukubaru
     */
    public static void simpanBuku(Book bukubaru){
        bukubaru.pnrbt.save();
        bukubaru.save();
        tampilbuku();
    }

}