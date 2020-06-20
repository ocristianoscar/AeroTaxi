package com.company.Controller;

import com.company.App.Login;
import com.company.MVC.Controller;
import com.company.View.AdminView;

public class LoginViewController implements Controller {

    private Login login;
    private AdminView adminView;

    public LoginViewController(Login login) {
        this.login = login;
    }



    //si es usuario lo manda al menu de usuario
    //si es admin lo manda al menu de admin
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
