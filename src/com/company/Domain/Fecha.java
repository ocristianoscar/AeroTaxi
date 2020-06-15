package com.company.Domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {

    private final LocalDate inicio;

    private Fecha(LocalDate inicio) {
        this.inicio = inicio;
    }

    public static Fecha desde(LocalDate start) {
        return new Fecha(start);
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getEnd() {
        return inicio.plusDays(6);
    }

    public Fecha siguenteDia() { return new Fecha(inicio.plusDays(1)); }

    public Fecha anteriorDia() { return new Fecha(inicio.minusDays(1)); }


}
