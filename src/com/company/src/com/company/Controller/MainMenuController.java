package com.company.Controller;

import com.company.App.MainMenu;
import com.company.App.Registrar;

public class MainMenuController {

    private MainMenu mainMenu;

    public MainMenuController(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    public boolean execute(String command) {
        switch (command){
            case "1":
                //acceso de usuarios
                return true;
            case "2":
                //registro de usuarios
                return true;
            default: break;
        }
        return false;
    }
}
