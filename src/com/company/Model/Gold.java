package com.company.Model;
import java.io.Serializable;

import java.io.Serializable;

public class Gold extends Avion implements Serializable {
    private boolean wifi;
    private String silver;

    public Gold(){}

    public Gold(int capacidadCombustible, int costoKM, int capacidadPasajeros, int velMax, Propulsion propulsion, boolean wifi) {
        this.setCapacidadCombustible(capacidadCombustible);
        this.setCostoKM(costoKM);
        this.setCapacidadPasajeros(capacidadPasajeros);
        this.setVelMax(velMax);
        this.setPropulsion(propulsion);
        this.wifi = wifi;
    }

    @Override
    public String toString() {
        return super.toString() + "Oro";
    }
}
