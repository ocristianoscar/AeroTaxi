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
    private static final String PATH_VUELOS = "vuelos.json";
    private static final String PATH_AVIONES = "aviones.json";
    private static final String PATH_USUARIOS = "usuarios.json";

    public static void main(String[] args) {

        Fecha fechaActual = Fecha.desde(LocalDate.now());

        //List<Avion> listaAviones = new ArrayList<>();
        //CapaDatos capaDatos = new CapaDatos();

        Bronze bronce1 = new Bronze(9500,175,19,1050,Propulsion.REACCION);//Dassault Falcon 2000LX
        Bronze bronce2 = new Bronze(9500,175,19,1050,Propulsion.REACCION);
        Bronze bronce3 = new Bronze(9500,175,19,1050,Propulsion.REACCION);
        Bronze bronce4 = new Bronze(9500,175,19,1050,Propulsion.REACCION);

        /*CapaDatos.agregarAvion(bronce1);
        CapaDatos.agregarAvion(bronce2);
        CapaDatos.agregarAvion(bronce3);
        CapaDatos.agregarAvion(bronce4);*/

        Silver silver1 = new Silver(20000,250,10,1110,Propulsion.HELICE);//Gulfstream 650ER
        Silver silver2 = new Silver(20000,250,10,1110,Propulsion.HELICE);
        Silver silver3 = new Silver(20000,250,10,1110,Propulsion.HELICE);
        Silver silver4 = new Silver(20000,250,10,1110,Propulsion.HELICE);

        /*CapaDatos.agregarAvion(silver1);
        CapaDatos.agregarAvion(silver2);
        CapaDatos.agregarAvion(silver3);
        CapaDatos.agregarAvion(silver4);*/

        Gold gold1 = new Gold(6000,300,12,1150, Propulsion.REACCION,true);//Cessna Citation X+
        Gold gold2 = new Gold(6000,300,12,1150, Propulsion.REACCION,true);
        Gold gold3 = new Gold(6000,300,12,1150, Propulsion.REACCION,true);
        Gold gold4 = new Gold(6000,300,12,1150, Propulsion.REACCION,true);

        CapaDatos.agregarAvionGold(gold1);
        CapaDatos.agregarAvionGold(gold2);
        CapaDatos.agregarAvionGold(gold3);
        CapaDatos.agregarAvionGold(gold4);

        for (Avion avion: CapaDatos.getAvionList() ) {
            System.out.println(avion.toString());
        }

        //funcion para crear archivos
        setup();

        //CapaDatos.uploadVuelos(listaAviones);

        MainMenu mainMenu = new MainMenu(fechaActual);
        MainMenuController mainMenuController = new MainMenuController(mainMenu);
        MainMenuView mainMenuView = new MainMenuView(mainMenu, mainMenuController);
        mainMenuView.show();
    }

    private static void setup(){



        List<String> paths = new ArrayList<>();

        paths.add(PATH_AVIONES);
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

    /*private static void inicArchivoVuelos(List<Avion> listaAviones){
        uploadVuelos(listaAviones);
    }*/
}
