package com.company.App;

import com.company.Controller.MainMenuController;
import com.company.Domain.CapaDatos;
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
        Bronze bronce1 = new Bronze(9500,150,10,1050,Propulsion.REACCION,false);//Dassault Falcon 900LX
        Bronze bronce2 = new Bronze(9500,150,10,1050,Propulsion.REACCION,false);
        Bronze bronce3 = new Bronze(7500,175,19,1050,Propulsion.REACCION,false);//Dassault Falcon 2000LX
        Bronze bronce4 = new Bronze(7500,175,19,1050,Propulsion.REACCION,false);

        Silver silver1 = new Silver(20000,250,10,1110,Propulsion.HELICE,false);//Gulfstream 650ER
        Silver silver2 = new Silver(20000,250,10,1110,Propulsion.HELICE,false);
        Silver silver3 = new Silver(20000,250,10,1110,Propulsion.HELICE,false);

        Gold gold1 = new Gold(6000,300,12,1150, Propulsion.REACCION,true,false);//Cessna Citation X+
        Gold gold2 = new Gold(6000,300,12,1150, Propulsion.REACCION,true,false);
        Gold gold3 = new Gold(6000,300,12,1150, Propulsion.REACCION,true,false);

        CapaDatos.setAvionList(CapaDatos.downloadAviones());
        CapaDatos.setVuelosList(CapaDatos.downloadVuelos());
        CapaDatos.setUsersList(CapaDatos.downloadUsers());
        MainMenu mainMenu = new MainMenu(fechaActual);
        MainMenuController mainMenuController = new MainMenuController(mainMenu);
        MainMenuView mainMenuView = new MainMenuView(mainMenu, mainMenuController);
        mainMenuView.show();
    }
}
