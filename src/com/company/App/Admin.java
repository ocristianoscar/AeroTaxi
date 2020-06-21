package com.company.App;

import com.company.MVC.Model;
import com.company.Model.Usuario;

public class Admin extends Model {

    private Usuario usuario;

    public Admin(Usuario usuario){      //aca recibiría el usuario singleton que es administrador
        this.usuario = usuario;
        changed();
    }
}
