package com.company.View;

import com.company.App.MainMenu;
import com.company.Controller.MainMenuController;
import com.company.MVC.View;

import java.time.LocalDate;
import java.util.Scanner;

public class MainMenuView implements View {

    private MainMenu mainMenu;
    private MainMenuController mainMenuController;

    private static String titulo= "MENU PRINCIPAL  ";
    private static String op1= "1 - Registro de Nuevo Usuario";
    private static String op2= "2 - Acceso de Usuarios";
    private LocalDate fecha;

    public MainMenuView(MainMenu mainMenu, MainMenuController mainMenuController) {
        this.mainMenu = mainMenu;
        this.mainMenuController = mainMenuController;
        this.fecha = mainMenu.getFechaActual().getFecha();
        mainMenu.addView(this);
    }

    public void modelChanged() {
        show();
    }

    public void show() {
        System.out.print(titulo + fecha +"\n\n" + op1 + "\n" + op2 + "\n\nElija una opción: ");
        Scanner sc = new Scanner(System.in);
        String opcion = sc.next();
        mainMenuController.execute(opcion);
    }
}
