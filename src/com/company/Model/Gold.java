package com.company.Model;

public class Gold extends Avion {
    private Boolean wifi;

    public Gold(int capacidadCombustible, int costoKM, int capacidadPasajeros, int velMax , Propulsion propulsion  ,Boolean wifi) {
        this.setCapacidadCombustible(capacidadCombustible);
        this.setCostoKM(costoKM);
        this.setCapacidadPasajeros(capacidadPasajeros);
        this.setVelMax(velMax);
        this.setPropulsion(propulsion);
        this.wifi = wifi;
    }
}
