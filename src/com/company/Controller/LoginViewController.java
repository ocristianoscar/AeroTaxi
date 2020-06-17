package com.company.Controller;

import com.company.App.Login;
import com.company.MVC.Controller;

public class LoginViewController implements Controller {

    private Login login;

    public LoginViewController(Login login) {
        this.login = login;
    }

    @Override
    public boolean execute(String command) {
        if (login.getUser().isEmpty()){
            String user = command;
            login.setUser(user);

        }else {
            String pass = command;
            login.setPass(pass);

        }
        return true;
    }
}
