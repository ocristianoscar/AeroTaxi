package com.company.View;

import com.company.App.Admin;
import com.company.App.MainMenu;
import com.company.App.Registrar;
import com.company.Controller.AdminController;
import com.company.Controller.MainMenuController;
import com.company.Controller.RegistrarController;
import com.company.Domain.Fecha;
import com.company.MVC.View;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistrarView implements View {

    private Registrar registrar;
    private RegistrarController registrarController;
    Scanner sc = new Scanner(System.in);

    private static String titulo= "REGISTRO DE USUARIO";
    private static String op1= "nombre: ";
    private static String op2= "\napellido: ";
    private static String op3= "\nDNI: ";
    private static String op4= "\nedad: ";
    private static String op5= "\nuser: ";
    private static String op6= "\npass: ";

    public RegistrarView(Registrar registrar, RegistrarController registrarController) {
        this.registrar = registrar;
        this.registrarController = registrarController;
        registrar.addView(this);
    }

    public void modelChanged() {
        show();
    }

    public void show() {
        System.out.print(titulo + "\n\n");    //estos son todos los datos que se necesitan
        int reg = show(registrar.getUserAregistrar());
        registro(reg);
    }

    private int show(ArrayList<String> usuarioAregistrar) {
        for (String dato: usuarioAregistrar) {
            System.out.printf(" %s", dato);
        }
        return usuarioAregistrar.size();
    }


    private void registro(int reg) {
        switch (reg){
            case 0:
                nombreHelper();
                break;
            case 1:
                apellidoHelper();
                break;
            case 2:
                DNIHelper();
                break;
            case 3:
                edadHelper();
                break;
            case 4:
                userHelper();
                break;
            case 5:
                passHelper();
                break;
            case 6:
                registroCompletado();
            default: break;
        }
    }

    public void nombreHelper(){
        System.out.print(op1);
        String nombre = sc.nextLine();
        if (nombre.length() > 2){
            registrar.agregarDato(nombre);
        }else {
            System.out.println("Nombre muy corto, mas de 2 caracteres.\n");
            nombreHelper();
        }
    }
    public void apellidoHelper(){
        System.out.print(op2);
        String apellido = sc.nextLine();
        if (apellido.length() > 2){
            registrar.agregarDato(apellido);
        }else {
            System.out.println("Apellido muy corto, mas de 2 caracteres.\n");
            apellidoHelper();
        }
    }
    public void DNIHelper(){
        System.out.print(op3);
        String DNI = sc.nextLine();
        if (DNI.length() > 2){
            registrar.agregarDato(DNI);
        }else {
            System.out.println("DNI no valido.\n"); //en realidad habría que validar el DNI
            DNIHelper();
        }
    }
    public void edadHelper(){
        System.out.print(op4);
        String edad = sc.nextLine();

        if (isInteger(edad)){
            if (Integer.parseInt(edad) < 100)
                registrar.agregarDato(edad);
            else
                System.out.println("Edad mayor a 100 años.\n");
                edadHelper();
        }else {
            System.out.println("El valor ingresado no es un numero entero, intente nuevamente.\n");
            edadHelper();
        }
    }
    public void userHelper(){
        System.out.print(op5);
        String user = sc.nextLine();
        if (user.length() > 2){
            registrar.agregarDato(user);
        }else {
            System.out.println("Nombre de usuario muy corto, mas de 2 caracteres.\n");
            userHelper();
        }
    }
    public void passHelper(){
        System.out.print(op6);
        String pass = sc.nextLine();
        if (pass.length() > 2){
            registrar.agregarDato(pass);
        }else {
            System.out.println("pass muy corto, mas de 2 caracteres.\n");
            passHelper();
        }
    }

    public void registroCompletado(){
        if (registrarController.execute("1")) {
            System.out.println("\nRegistro completado, lo regresaremos al menu principal\n");
            MainMenu mainMenu = new MainMenu(Fecha.desde(LocalDate.now()));
            MainMenuController mainMenuController = new MainMenuController(mainMenu);
            MainMenuView mainMenuView = new MainMenuView(mainMenu, mainMenuController);
            mainMenuView.show();
        } else {
            System.out.println("\nHa ocurrido un error en el registro, lo devolveremos al menu principal.\n");
            MainMenu mainMenu = new MainMenu(Fecha.desde(LocalDate.now()));
            MainMenuController mainMenuController = new MainMenuController(mainMenu);
            MainMenuView mainMenuView = new MainMenuView(mainMenu, mainMenuController);
            mainMenuView.show();
        }
    }


    public static boolean isInteger(String s) {
        return isInteger(s,10);
    }

    public static boolean isInteger(String s, int radix) {
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1) return false;
                else continue;
            }
            if(Character.digit(s.charAt(i),radix) < 0) return false;
        }
        return true;
    }
}
