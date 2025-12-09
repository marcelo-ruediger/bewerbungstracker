package com.bewerbungstracker;

import java.time.LocalDate;

public class Bewerbung {

    // Statischer Zähler für automatische ID
    private static int idZaehler = 1;

    private String id;
    private LocalDate date;
    private String unternehmen;
    private Status status;
    private String position;
    private String kontakt;
    private String notizen;

    // Basis-Konstruktor mit automatischem Datum (aktuelles Datum)
    public Bewerbung(String unternehmen) {
        this.id = "B" + String.format("%03d", idZaehler++);
        this.date = LocalDate.now();
        this.unternehmen = unternehmen;
        this.status = Status.VERSENDET;
    }

    // Konstruktor mit manuellem Datum (für Laden aus Datenbank)
    public Bewerbung(LocalDate date, String unternehmen) {
        this(unternehmen);
        this.date = date;
    }

    public Bewerbung(String unternehmen, String position) {
        this(unternehmen);
        this.position = position;
    }

    public Bewerbung(String unternehmen, String position, String kontakt) {
        this(unternehmen, position);
        this.kontakt = kontakt;
    }

    public Bewerbung(String unternehmen, String position, String kontakt, String notizen) {
        this(unternehmen, position, kontakt);
        this.notizen = notizen;
    }

    // Methode zum Setzen der ID - vielleicht benötigt beim Laden aus Datenbank
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;

    }

    public void setDate (LocalDate date){
        this.date = date;
    }

    public String getUnternehmen () {
        return unternehmen;
    }

    public void setUnternehmen (String unternehmen){
        this.unternehmen = unternehmen;
    }

    public Status getStatus () {
        return status;
    }

    public void setStatus (Status status){
        this.status = status;
    }

    public String getPosition () {
        return position;
    }

    public void setPosition (String position){
        this.position = position;
    }

    public String getKontakt () {
        return kontakt;
    }

    public void setKontakt(String kontakt){
        this.kontakt = kontakt;
    }

    public String getNotizen () {
        return notizen;
    }

    public void setNotizen (String notizen){
        this.notizen = notizen;
    }

    @Override
    public String toString() {
        return "Bewerbung{" +
                "id=" + id +
                ", date=" + date +
                ", unternehmen='" + unternehmen + '\'' +
                ", status=" + status +
                ", position='" + position + '\'' +
                ", kontakt='" + kontakt + '\'' +
                ", notizen='" + notizen + '\'' +
                '}';
    }
}

