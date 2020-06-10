package com.company.View;

import com.company.App.Admin;
import com.company.App.MainMenu;
import com.company.Controller.AdminController;
import com.company.Controller.MainMenuController;
import com.company.MVC.View;

import java.time.DayOfWeek;

public class MenuView implements View {

    private MainMenu mainMenu;
    private MainMenuController mainMenuController;

    public MenuView(MainMenu mainMenu, AdminController adminController) {
        this.mainMenu = mainMenu;
        this.mainMenuController = mainMenuController;
        mainMenu.addView(this);
    }

    public void modelChanged() {
        show();
    }

    public void show() {

    }
}
