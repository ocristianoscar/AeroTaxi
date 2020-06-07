package com.company.menu;

import java.util.Scanner;

public class Menu {

    private final String titulo = "BIENVENIDO A NUESTRA EMPRESA DE ALQUILER DE AEROTAXIS";

    //constructor vacio
    public void Menu(){}

    public void menuPrincipal(){

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag == true) {

            System.out.print(titulo + "\n\n" +
                    "1 - Acceso de Usuarios\n" +
                    "2 - Registro de Nuevo Usuario\n" +
                    "0 - Salir\n\n" +
                    "elija una opcion: ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    //accesoUsuario();
                    break;
                case 2:
                    //registroUsuario();
                    break;
                case 0:
                    //despedida();
                    flag = false;
                    break;
                default:
                    System.out.println("\nopción incorrecta, por favor intente de nuevo\n");
            }
        }
    }

}
