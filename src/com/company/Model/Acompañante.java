package com.company.Model;

public class Acompañante {
    private String nombre;
    private String apellido;
    private String DNI;
    private Usuario usuario;

    public Acompañante(String nombre, String apellido, String DNI, Usuario usuario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.usuario = usuario;
    }

    public String getNombre() { return nombre; }

    public String getApellido() { return apellido; }

    public String getDNI() { return DNI; }

    public Usuario getUsuario() { return usuario; }

}
