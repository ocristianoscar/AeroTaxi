package com.company.menu;

import java.util.Scanner;

public class Menu {

    private final String TITULO = "BIENVENIDO A NUESTRA EMPRESA DE ALQUILER DE AEROTAXIS";

    //constructor vacio
    public void Menu(){}

    public void menuPrincipal(){

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        private int opcion;

        while(flag == true) {

            System.out.print(TITULO + "\n\n" +
                    "1 - Acceso de Usuarios\n" +
                    "2 - Registro de Nuevo Usuario\n" +
                    "0 - Salir\n\n" +
                    "elija una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    accesoUsuario();
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

    public void accesoUsuario(){
        Scanner sc = new Scanner(System.in);
        private boolean flag = true;
        private String user;
        private String pass;
        private boolean userValid;

        while(flag == true){
            System.out.print("ACCESO DE USUARIOS\n\n" +
                    "usuario: ");
            user = sc.nextLine();

            /*LLAMADA A VALIDACIÓN DE USUARIO
            * userValid = validarUsuario(user) */
            userValid = true;   //linea provisoria - borrar cuando se implemente el método de control

            if(userValid){
                System.out.print("\npass: ");
                pass = sc.nextLine();
            }
        }
    }

}
