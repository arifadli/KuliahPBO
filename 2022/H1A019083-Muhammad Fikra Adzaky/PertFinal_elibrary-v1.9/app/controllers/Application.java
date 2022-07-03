package controllers;

import play.mvc.*;
import java.util.List;
import models.User;
import models.Book;
import models.Penerbit;

public class Application extends Controller {

    public static void index() {
        if(connected() != null) {
        	render("Selamat Datang, ");
        }
        render();
    }

    static User connected() {
        if(renderArgs.get("user") != null) {
            return renderArgs.get("user", User.class);
        }
        String username = session.get("user");
        if(username != null) {
            return User.find("byUsername", username).first();
        } 
        return null;
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