package com.company.Controller;

import com.company.App.Login;
import com.company.MVC.Controller;

public class LoginViewController implements Controller {

    private Login login;

    public LoginViewController(Login login) {
        this.login = login;
    }

    /*@Override
    public boolean execute(String user, String pass ) {
        //si se loguea retorna true
        //si no se loguea retorna false
        return true;
    }*/

    @Override
    public boolean execute(String command) {
        return false;
    }
}
