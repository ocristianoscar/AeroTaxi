package com.company.Controller;

import com.company.App.Login;
import com.company.App.MainMenu;
import com.company.App.Registrar;
import com.company.MVC.Controller;
import com.company.View.LoginView;
import com.company.View.RegistrarView;

import java.util.Scanner;

public class MainMenuController implements Controller {

    private MainMenu mainMenu;

    public MainMenuController(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    public boolean execute(String command) {
        switch (command){
            case "1":
                //registro de usuarios
                Registrar registrar = new Registrar();
                RegistrarController registrarController= new RegistrarController(registrar);
                RegistrarView registrarView = new RegistrarView(registrar, registrarController);
                registrarView.show();
                return true;
            case "2":
                //acceso de usuarios
                Login login = new Login();
                LoginViewController loginViewController= new LoginViewController(login);
                LoginView loginView = new LoginView(loginViewController, login);
                loginView.show();
                return true;
            default:
                System.out.println("Opcion no disponible\nVuelva a ingresar valor: ");
                Scanner sc = new Scanner(System.in);
                String opcion = sc.next();
                this.execute(opcion);
        }
        return false;
    }
}
