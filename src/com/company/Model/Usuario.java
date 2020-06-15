package com.company.Model;

public class Usuario {
    private String nombre;
    private String apellido;
    private String DNI;
    private String edad;
    private String user;
    private String password;
    private static Usuario miUsuario; //MI USUARIO ACTUAL
    private boolean esAdmin;

    //GET USUARIO SINGLETON
    public  static Usuario getUsuario(String user, String password) {

        try{
            if (miUsuario == null) {

                //miUsuario = new Usuario(nombre, apellido, DNI, edad);
            }
            return miUsuario;
        }catch (Exception e){
            throw new RuntimeException("Un error ah ocurrido creando la instancia");
        }
    }

    //CONSTRUCTOR PRIVADO
    private Usuario(String nombre, String apellido, String DNI, String edad, String user, String password){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
        this.user = user;
        this.password = password;
    }

    //GETTERS
    public String getNombre() { return nombre; }

    public String getApellido() { return apellido; }

    public String getDNI() { return DNI; }

    public String getEdad() { return edad; }




}
