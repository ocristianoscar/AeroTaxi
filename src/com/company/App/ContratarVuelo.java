package com.company.App;

import com.company.MVC.Model;
import com.company.Model.Ciudad;
import com.company.Model.Usuario;
import com.company.Model.Vuelo;
import com.company.Model.Avion;

import java.time.LocalDate;
import java.util.List;

public class ContratarVuelo extends Model{

    LocalDate fechaElegida;
    String ciudadOrigen;
    String ciudadDestino;
    String acompañantes;
    List<Avion> listaAvion;
    // hacer arreglo de ciudades

    public ContratarVuelo() {
        this.fechaElegida=null;
        this.ciudadOrigen=null;
        this.ciudadDestino=null;
        this.acompañantes=null;
        this.listaAvion=null;
    }
    public void setFechaElegida(LocalDate fechaElegida) {
        this.fechaElegida = fechaElegida;
        changed();
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
        changed();
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
        changed();
    }

    public void setAcompañantes(String acompañantes) {
        this.acompañantes = acompañantes;
        changed();
    }

    public void setListaAvion(List<Avion> listaAvion) {
        this.listaAvion = listaAvion;
        changed();
    }

    public List<Avion> getListaAvion() {
        return listaAvion;
    }


    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public LocalDate getFechaElegida() {
        return fechaElegida;
    }

    public String getAcompañantes() {
        return acompañantes;
    }

}
