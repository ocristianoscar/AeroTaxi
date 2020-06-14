package com.company.Model;

public class Gold extends Avion {
    private boolean wifi;
    private String silver;

    public Gold(int capacidadCombustible, int costoKM, int capacidadPasajeros, int velMax, Propulsion propulsion, boolean wifi, boolean vueloProgramado) {
        this.setCapacidadCombustible(capacidadCombustible);
        this.setCostoKM(costoKM);
        this.setCapacidadPasajeros(capacidadPasajeros);
        this.setVelMax(velMax);
        this.setTarifa(6000);
        this.setPropulsion(propulsion);
        this.setVueloProgramado(vueloProgramado);
        this.wifi = wifi;
    }
}
