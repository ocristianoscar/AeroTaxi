package com.company.Controller;

import com.company.App.CancelarVuelo;
import com.company.App.Registrar;
import com.company.Domain.CapaDatos;
import com.company.MVC.Controller;
import com.company.Model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class RegistrarController implements Controller {

    private Registrar registrar;
    private String nombre;
    private String apellido;
    private String DNI;
    private String edad;
    private String user;
    private String password;
    private ArrayList<String> usuarioAcrear = new ArrayList();

    public RegistrarController(Registrar registrar) {
        this.registrar = registrar;
    }

    public boolean execute(String command) {
        if (command == "1"){
                this.nombre = registrar.getUserAregistrar().get(0).toString();
                this.apellido = registrar.getUserAregistrar().get(1).toString();
                this.DNI = registrar.getUserAregistrar().get(2).toString();
                this.edad = registrar.getUserAregistrar().get(3).toString();
                this.user = registrar.getUserAregistrar().get(4).toString();
                this.password = registrar.getUserAregistrar().get(5).toString();
                CapaDatos.agregarUsuario(new Usuario(nombre, apellido, DNI, edad, user, password, false));
                CapaDatos.uploadUsers();
                return true;
        }else
        return false;
    }


}
