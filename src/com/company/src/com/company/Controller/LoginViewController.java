package com.company.Controller;

import com.company.App.Login;

public class LoginViewController {

    private Login login;

    public LoginViewController(Login login) {
        this.login = login;
    }

    public boolean execute(String user, String pass ) {
        //si se loguea retorna true
        //si no se loguea retorna false
        return true;
    }
}
