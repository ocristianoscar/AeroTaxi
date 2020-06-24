package com.company.App;

import com.company.MVC.Model;
import com.company.Model.Usuario;

public class Login extends Model {

    private String user;
    private String pass;
    public  Login(){
        this.user = new String();
        this.pass = new String();
    }

    public String getUser() { return user; }

    public void setUser(String user) { this.user = user; changed();}

    public String getPass() { return pass; }

    public void setPass(String pass) { this.pass = pass; }

}
