package com.company.Domain;

import java.time.LocalDate;

public class Date {

    private final java.time.LocalDate start;

    private Date(java.time.LocalDate start) {
        this.start = start;
    }

    public static Date since(java.time.LocalDate start) {
        return new Date(start);
    }

    public java.time.LocalDate getStart() {
        return start;
    }

    public java.time.LocalDate getEnd() {
        return start.plusDays(6);
    }

    public Date next() {
        return new Date(start.plusDays(1));
    }

    public Date previous() {
        return new Date(start.minusDays(1));
    }


}
