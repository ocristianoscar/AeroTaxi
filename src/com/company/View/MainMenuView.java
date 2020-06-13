package com.company.View;

import com.company.App.Admin;
import com.company.App.MainMenu;
import com.company.Controller.AdminController;
import com.company.Controller.MainMenuController;
import com.company.MVC.View;

import java.time.DayOfWeek;

public class MainMenuView implements View {

    private MainMenu mainMenu;
    private MainMenuController mainMenuController;

    private static String titulo= "MENU PRINCIPAL";
    private static String op1= "1 - Acceso de Usuarios";
    private static String op2= "2 - Registro de Nuevo Usuario";

    public MainMenuView(MainMenu mainMenu, AdminController adminController) {
        this.mainMenu = mainMenu;
        this.mainMenuController = mainMenuController;
        mainMenu.addView(this);
    }

    public void modelChanged() {
        show();
    }

    public void show() {
        System.out.print(titulo + "\n\n" + op1 + "\n" + op2 + "\n\nelija una opción: ");
        String command = " "; //entrada de datos
        mainMenuController.execute(command);
    }
}
