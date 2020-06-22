package com.company.Model;

import com.company.App.MainMenu;
import com.company.Controller.MainMenuController;
import com.company.Domain.CapaDatos;
import com.company.Domain.Fecha;
import com.company.View.MainMenuView;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private String DNI;
    private String edad;
    private String user;
    private String pass;
    private static Usuario miUsuario; //MI USUARIO ACTUAL
    private boolean esAdmin;

    //GET USUARIO SINGLETON
    public static Usuario getUsuario(String user, String password) {

        try{
            if (miUsuario == null) {
                List<Usuario> arrayUser  = new ArrayList<>();
                arrayUser = CapaDatos.getUsersList();
                Usuario aux = null;
                for (Usuario usuario: arrayUser
                     ) {
                    if (usuario.getUser() == user && usuario.getPass() == password){
                        aux = usuario;
                    }
                }
                if (aux != null){
                    miUsuario = aux;
                }else
                    System.out.println("Un error ah ocurrido en la verificacion de la instancia.");
                    MainMenu mainMenu = new MainMenu(Fecha.desde(LocalDate.now()));
                    MainMenuController mainMenuController = new MainMenuController(mainMenu);
                    MainMenuView mainMenuView = new MainMenuView(mainMenu, mainMenuController);
                    mainMenuView.show();
            }
            return miUsuario;
        }catch (Exception e){
            throw new RuntimeException("Un error ha ocurrido creando la instancia");
        }
    }

    //CONSTRUCTOR PUBLICO PARA PODER REGISTRAR
    public Usuario(String nombre, String apellido, String DNI, String edad, String user, String pass){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
        this.user = user;
        this.pass = pass;
    }



    //GETTERS

    public boolean isEsAdmin() { return esAdmin; }

    public String getNombre() { return nombre; }

    public String getApellido() { return apellido; }

    public String getDNI() { return DNI; }

    public String getEdad() { return edad; }

    public String getUser() { return user; }

    public String getPass() { return pass; }

    public static Usuario getMiUsuario() { return miUsuario; }

}
