package com.company.Controller;

import com.company.App.MainMenu;
import com.company.App.Registrar;
<<<<<<< HEAD

public class MainMenuController {
=======
import com.company.MVC.Controller;

public class MainMenuController implements Controller {
>>>>>>> Cristian

    private MainMenu mainMenu;

    public MainMenuController(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    public boolean execute(String command) {
        switch (command){
            case "1":
<<<<<<< HEAD
                //TODO:
                return true;
            case "2":
                //TODO:
                return true;
            case "3":
                //TODO:
                return true;
            case "4":
                //TODO:
                return true;
            case "5":
                //TODO:
=======
                //acceso de usuarios
                return true;
            case "2":
                //registro de usuarios
>>>>>>> Cristian
                return true;
            default: break;
        }
        return false;
    }
}
