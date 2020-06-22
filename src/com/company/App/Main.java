package com.company.App;

import com.company.Controller.MainMenuController;
import com.company.Domain.Fecha;
import com.company.Model.Bronze;
import com.company.Model.Gold;
import com.company.Model.Propulsion;
import com.company.Model.Silver;
import com.company.View.MainMenuView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        Fecha fechaActual = Fecha.desde(LocalDate.now());
        Bronze bronce1 = new Bronze(9500,175,19,1050,Propulsion.REACCION);//Dassault Falcon 2000LX
        Bronze bronce2 = new Bronze(9500,175,19,1050,Propulsion.REACCION);
        Bronze bronce3 = new Bronze(9500,175,19,1050,Propulsion.REACCION);
        Bronze bronce4 = new Bronze(9500,175,19,1050,Propulsion.REACCION);

        Silver silver1 = new Silver(20000,250,10,1110,Propulsion.HELICE);//Gulfstream 650ER
        Silver silver2 = new Silver(20000,250,10,1110,Propulsion.HELICE);
        Silver silver3 = new Silver(20000,250,10,1110,Propulsion.HELICE);
        Silver silver4 = new Silver(20000,250,10,1110,Propulsion.HELICE);

        Gold gold1 = new Gold(6000,300,12,1150, Propulsion.REACCION,true);//Cessna Citation X+
        Gold gold2 = new Gold(6000,300,12,1150, Propulsion.REACCION,true);
        Gold gold3 = new Gold(6000,300,12,1150, Propulsion.REACCION,true);
        Gold gold4 = new Gold(6000,300,12,1150, Propulsion.REACCION,true);

        MainMenu mainMenu = new MainMenu(fechaActual);
        MainMenuController mainMenuController = new MainMenuController(mainMenu);
        MainMenuView mainMenuView = new MainMenuView(mainMenu, mainMenuController);
        mainMenuView.show();
    }
}
