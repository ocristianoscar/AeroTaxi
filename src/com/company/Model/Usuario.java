package com.company.Model;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String apellido;
    private String DNI;
    private String edad;
    private String user;
    private static Usuario miUsuario; //MI USUARIO ACTUAL
    private boolean esAdmin;

    //GET USUARIO SINGLETON
    public static Usuario getUsuario(String user, String password) {

        try{
            if (miUsuario == null) {
                ArrayList arrayUser  = new ArrayList<>();
                //arrayUser = capaDatos.getJsonUser();
                //miUsuario = new Usuario(arrayUser.get(0), arrayUser.get(1), arrayUser.get(2), arrayUser.get(3), arrayUser.get(4));
            }
            return miUsuario;
        }catch (Exception e){
            throw new RuntimeException("Un error ha ocurrido creando la instancia");
        }
    }

    //CONSTRUCTOR PRIVADO
    private Usuario(String nombre, String apellido, String DNI, String edad, String user){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
        this.user = user;
    }

    //constructor publico
    public Usuario(){}

    //GETTERS

    public boolean isEsAdmin() { return esAdmin; }

    public String getNombre() { return nombre; }

    public String getApellido() { return apellido; }

    public String getDNI() { return DNI; }

    public String getEdad() { return edad; }

    public String getUser() {
        return user;
    }

}
