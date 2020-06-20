package com.company.Controller;

import com.company.App.CancelarVuelo;
import com.company.App.Registrar;
import com.company.MVC.Controller;
import com.company.Model.Usuario;

import java.util.ArrayList;

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
        switch (command){
            case "1":
                this.nombre = registrar.getUserAregistrar().get(0).toString();
                this.apellido = registrar.getUserAregistrar().get(1).toString();
                this.DNI = registrar.getUserAregistrar().get(2).toString();
                this.edad = registrar.getUserAregistrar().get(3).toString();
                this.user = registrar.getUserAregistrar().get(4).toString();
                this.password = registrar.getUserAregistrar().get(5).toString();

                //AGREGAR AL JSON EL USUARIO REGISTRADO Y LEER EN MainMenuView
                return true;
            case "2":       //no hay case 2
                //TODO:
                return true;
            default: break;
        }
        return false;
    }

    public ArrayList getUsuarioAcrear() { return usuarioAcrear; }

}
