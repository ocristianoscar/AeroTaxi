package com.company.Controller;

import com.company.App.ContratarVuelo;
import com.company.MVC.Controller;
import com.company.Model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContratarVueloController implements Controller {
    private List<Vuelo> vuelos = new ArrayList<>();

    private ContratarVuelo contratarVuelo;

    public ContratarVueloController(ContratarVuelo contratarVuelo) {
        this.contratarVuelo = contratarVuelo;
    }

    //en este punto debe seguirse una serie de pasos:
    //1 - elegir fecha
    //2 - si hay vuelos disponibles, se debe elegir origen
    //3 - elegir destino
    //4 - elegir aviones disponibles
    //5 - elegir si se viaja con acompañantes o no
    //6 - finalmente, mostrar y confirmar vuelo

    public boolean execute(String command) {
        switch (command){
            case "1":
                //TODO:
                return true;
            case "2":
                //TODO:
                return true;
            case "3":
                //TODO:
                return true;
            case "4":
                //TODO:
                return true;
            case "5":
                //TODO:
                return true;
            default: break;
        }
        return false;
    }
    public void add(Vuelo vuelo) {
        this.vuelos.add(vuelo);
    }

    public double calcularCosto(Vuelo vuelo){
        //(Cantidad de kms * Costo del km) + (cantidad de pasajeros * 3500) + (Tarifa del tipo de avión)
        double costo_final = 1;
        double costo_km = 1;// costo por km del avion elegido
        double cant_km = 1;// km de distancia entre las ciudades
        double cant_pas = 1;// numero de viajeros
        double tarifa = 1;

        // cant_pas = vuelo.calcularPasajeros();

        tarifa = descubrirTarifa(vuelo);

        costo_km = vuelo.getAvion().getCostoKM();

        System.out.println("Costo por km: " + costo_km);
        System.out.println("Cantidad de km: " + cant_km);
        System.out.println("Cantidad de pasajeros: " + cant_pas);
        System.out.println("Tarifa: " + tarifa);

        costo_final = (cant_km * costo_km) + (cant_pas * 3500) + tarifa;

        return costo_final;
    }

    public double descubrirTarifa(Vuelo vuelo){
        double tarifa=2;

        if(vuelo.getAvion() instanceof Bronze){
            tarifa = 3000;
        }
        else if(vuelo.getAvion() instanceof Silver){
            tarifa = 4000;
        }
        else if(vuelo.getAvion() instanceof Gold){
            tarifa = 6000;
        }

        return tarifa;
    }

    public double descubrirCiudadOrigenYDestino(Vuelo vuelo){
        double cant_km=2;

        if(((vuelo.getCiudadOrigen() == Ciudad.Bs_As) && (vuelo.getCiudadDestino() == Ciudad.Cordoba)) || ((vuelo.getCiudadOrigen() == Ciudad.Cordoba) && (vuelo.getCiudadDestino() == Ciudad.Bs_As)))
            cant_km = 695;
        else if(((vuelo.getCiudadOrigen() == Ciudad.Bs_As) && (vuelo.getCiudadDestino() == Ciudad.Santiago)) || ((vuelo.getCiudadOrigen() == Ciudad.Santiago) && (vuelo.getCiudadDestino() == Ciudad.Bs_As)))
            cant_km = 1400;
        else if(((vuelo.getCiudadOrigen() == Ciudad.Bs_As) && (vuelo.getCiudadDestino() == Ciudad.Montevideo)) || ((vuelo.getCiudadOrigen() == Ciudad.Montevideo) && (vuelo.getCiudadDestino() == Ciudad.Bs_As)))
            cant_km = 950;
        else if(((vuelo.getCiudadOrigen() == Ciudad.Montevideo) && (vuelo.getCiudadDestino() == Ciudad.Cordoba)) || ((vuelo.getCiudadOrigen() == Ciudad.Cordoba) && (vuelo.getCiudadDestino() == Ciudad.Montevideo)))
            cant_km = 1190;
        else if(((vuelo.getCiudadOrigen() == Ciudad.Santiago) && (vuelo.getCiudadDestino() == Ciudad.Cordoba)) || ((vuelo.getCiudadOrigen() == Ciudad.Cordoba) && (vuelo.getCiudadDestino() == Ciudad.Santiago)))
            cant_km = 1050;
        else if(((vuelo.getCiudadOrigen() == Ciudad.Montevideo) && (vuelo.getCiudadDestino() == Ciudad.Santiago)) || ((vuelo.getCiudadOrigen() == Ciudad.Santiago) && (vuelo.getCiudadDestino() == Ciudad.Montevideo)))
            cant_km = 2100;

        return cant_km;
    }

    public List<Vuelo> on(LocalDate date) {
        return vuelos.stream()
                .filter(vuelo -> vuelo.isOn(date))
                .collect(Collectors.toList());
    }
}
