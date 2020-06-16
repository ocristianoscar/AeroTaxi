package com.company.Controller;

import com.company.App.Admin;
import com.company.App.CancelarVuelo;

import com.company.MVC.Controller;

public class AdminController implements Controller {

    private Admin admin;

    public AdminController(Admin admin) {
        this.admin = admin;
    }

    public boolean execute(String command) {
        switch (command){
            case "1":
                //TODO lista de todos los vuelos programados para una fecha dada

                System.out.print("\ningrese fecha (en formato aaaa-mm-dd): ");
                //aqui también se podría hacer 3 inputs diferentes, uno para cada dato

                //validar fecha

                //recorrer la lista de vuelos y levantar los de la fecha elegida
                //o mostrar "no hay vuelos en la fecha elegida"

                //metodo "mostrarVuelo(Vuelo vuelo)"

                return true;
            case "2":
                //TODO lista de clientes, indicando datos personales, categoría más alta de vuelo contratada
                // y total de gastos en vuelos

                /*si se muestran todos los clientes ordenados por apellido habría que ordenarlos quizá
                antes de subirlos a la lista. Si se los muestra ordenados por id, directamente se los lee
                como están en la lista*/

                //metodo "mostrarCliente(Usuario usuario)"

                return true;
            default: break;
        }
        return false;
    }
}
