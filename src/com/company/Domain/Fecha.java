package com.company.Domain;

public class Fecha {

    private final java.time.LocalDate inicio;

    private Fecha(java.time.LocalDate inicio) {
        this.inicio = inicio;
    }

    public static Fecha desde(java.time.LocalDate start) {
        return new Fecha(start);
    }

    public java.time.LocalDate getInicio() {
        return inicio;
    }

    public java.time.LocalDate getEnd() {
        return inicio.plusDays(6);
    }

    public Fecha siguenteDia() { return new Fecha(inicio.plusDays(1)); }

    public Fecha anteriorDia() { return new Fecha(inicio.minusDays(1)); }


}
