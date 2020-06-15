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
                this.nombre = usuarioAcrear.get(0);
                this.apellido = usuarioAcrear.get(1);
                this.DNI = usuarioAcrear.get(2);
                this.edad = usuarioAcrear.get(3);
                this.user = usuarioAcrear.get(4);
                this.password = usuarioAcrear.get(5);
                //AGREGAR AL JSON EL USUARIO REGISTRADO Y LEER EN MainMenuView
                return true;
            case "2":
                //TODO:
                return true;
            default: break;
        }
        return false;
    }

    public ArrayList getUsuarioAcrear() { return usuarioAcrear; }

}
