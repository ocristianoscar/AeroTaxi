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
    public boolean execute(String controller) {
        switch(controller) {
            case "success":
                login.changed();    //TODO: esto está bien?
                adminView.show();   //toma como default que es admin para probar vista de admin
                break;
            default:
                break;
        }
        return true;
    }
}
