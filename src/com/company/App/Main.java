package com.company.App;

import com.company.Controller.MainMenuController;
import com.company.Domain.CapaDatos;
import com.company.Domain.Fecha;
import com.company.Model.*;
import com.company.View.MainMenuView;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Main {

    //constantes de rutas de archivos
    public static final String PATH_VUELOS = "vuelos.json";
    public static final String PATH_AVIONES_GOLD = "avionesGold.json";
    public static final String PATH_AVIONES_BRONZE = "avionesBronze.json";
    public static final String PATH_AVIONES_SILVER = "avionesSilver.json";
    public static final String PATH_USUARIOS = "usuarios.json";

    public static void main(String[] args) {

        Fecha fechaActual = Fecha.desde(LocalDate.now());

        Bronze bronce1 = new Bronze(9500,175,19,1050,Propulsion.REACCION);//Dassault Falcon 2000LX
        Bronze bronce2 = new Bronze(9500,175,19,1050,Propulsion.REACCION);
        Bronze bronce3 = new Bronze(9500,175,19,1050,Propulsion.REACCION);
        Bronze bronce4 = new Bronze(9500,175,19,1050,Propulsion.REACCION);

        CapaDatos.agregarAvionBronze(bronce1);
        CapaDatos.agregarAvionBronze(bronce2);
        CapaDatos.agregarAvionBronze(bronce3);
        CapaDatos.agregarAvionBronze(bronce4);


        Silver silver1 = new Silver(20000,250,10,1110,Propulsion.HELICE);//Gulfstream 650ER
        Silver silver2 = new Silver(20000,250,10,1110,Propulsion.HELICE);
        Silver silver3 = new Silver(20000,250,10,1110,Propulsion.HELICE);
        Silver silver4 = new Silver(20000,250,10,1110,Propulsion.HELICE);

        CapaDatos.agregarAvionSilver(silver1);
        CapaDatos.agregarAvionSilver(silver2);
        CapaDatos.agregarAvionSilver(silver3);
        CapaDatos.agregarAvionSilver(silver4);

        Gold gold1 = new Gold(6000,300,12,1150, Propulsion.REACCION,true);//Cessna Citation X+
        Gold gold2 = new Gold(6000,300,12,1150, Propulsion.REACCION,true);
        Gold gold3 = new Gold(6000,300,12,1150, Propulsion.REACCION,true);
        Gold gold4 = new Gold(6000,300,12,1150, Propulsion.REACCION,true);

        CapaDatos.agregarAvionGold(gold1);
        CapaDatos.agregarAvionGold(gold2);
        CapaDatos.agregarAvionGold(gold3);
        CapaDatos.agregarAvionGold(gold4);



        //funcion para checkear/crear archivos
        setup();

        CapaDatos.uploadAvionesGold();
        CapaDatos.uploadAvionesSilver();
        CapaDatos.uploadAvionesBronze();

        /*List<Gold> listaAvionesGold = CapaDatos.downloadAvionesGold();


        for (Gold avionGold: listaAvionesGold ) {
            System.out.println(avionGold.toString());
        }*/

        MainMenu mainMenu = new MainMenu(fechaActual);
        MainMenuController mainMenuController = new MainMenuController(mainMenu);
        MainMenuView mainMenuView = new MainMenuView(mainMenu, mainMenuController);
        mainMenuView.show();
    }

    private static void setup(){



        List<String> paths = new ArrayList<>();

        paths.add(PATH_AVIONES_GOLD);
        paths.add(PATH_AVIONES_SILVER);
        paths.add(PATH_AVIONES_BRONZE);
        paths.add(PATH_USUARIOS);
        paths.add(PATH_VUELOS);

        for(String path : paths){
            inicArchivo(path);
        }
    }

    private static void inicArchivo(String path){

        File file = new File(path);
        //boolean result;

        try{
            if(!file.exists()){
                file.createNewFile();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

}
