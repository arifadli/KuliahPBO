package controllers;

import models.User;

public class Security extends controllers.Secure.Security
{
    static boolean authenticate(String username, String password)
    {
        boolean izin = false;
        User pengguna = User.find("username=? and password=?", username, password).first();
        
        if(pengguna != null){
            izin = true;
        }

        return izin;
    }
}
