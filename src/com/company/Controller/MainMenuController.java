package com.company.Controller;

import com.company.App.MainMenu;
import com.company.App.Registrar;
import com.company.MVC.Controller;

public class MainMenuController implements Controller {

    private MainMenu mainMenu;

    public MainMenuController(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    public boolean execute(String command) {
        switch (command){
            case "1":
                //registro de usuarios
                //TODO:
                return true;
            case "2":
                //acceso de usuarios
                return true;
            default: break;
        }
        return false;
    }
}
