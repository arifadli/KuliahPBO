package controllers;

import java.util.List;

import play.mvc.*;
import play.data.validation.*;
import models.*;

public class Application extends Controller {
    
    @Before
    static void addUser() {
        User user = connected();
        if(user != null) {
            renderArgs.put("user", user);
        }
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
    

    public static void index() {
        if(connected() != null) {
        	dashboard();
        }
        render();
    }
    
    public static void register() {
        render();
    }
    
    public static void dashboard() {
        //index();
		List matakuliahs=Matakuliah.findAll();
		render(matakuliahs);
    }
    
    public static void settings() {
        render();
    }
        
    public static void login(String username, String password) {
        User user = User.find("byUsernameAndPassword", username, password).first();
        if(user != null) {
            session.put("user", user.username);
            flash.success("Welcome, " + user.name);
          //  CJurusan.index();         
        }
        // Oops
        flash.put("username", username);
        flash.error("Login failed");
        index();
    }
    
    public static void logout() {
        session.clear();
        index();
    }
    
    public static void saveSettings(String password, String verifyPassword) {
        User connected = connected();
        connected.password = password;
        validation.valid(connected);
        validation.required(verifyPassword);
        validation.equals(verifyPassword, password).message("Your password doesn't match");
        if(validation.hasErrors()) {
            render("@settings", connected, verifyPassword);
        }
        connected.save();
        flash.success("Password updated");
        index();
    }

}