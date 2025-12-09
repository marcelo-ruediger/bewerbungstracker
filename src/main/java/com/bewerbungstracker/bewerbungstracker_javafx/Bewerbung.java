package com.bewerbungstracker.bewerbungstracker_javafx;

import java.time.LocalDate;

public class Bewerbung {


    private int id;
    private LocalDate date;
    private String unternehmen;
    private Status status;
    private String position;
    private String kontakt;
    private String notizen;

    public Bewerbung(LocalDate date, String unternehmen) {
        this.unternehmen = unternehmen;
        this.date = date;
//        Standardmäßig wird "Versendet" als Status angezeigt.
        this.status = Status.VERSENDET;

    }

    public Bewerbung(LocalDate date, String unternehmen, String position) {
        this(date, unternehmen);
        this.position = position;

    }

    public Bewerbung(LocalDate date, String unternehmen, String position, String kontakt) {
        this(date, unternehmen, position);
        this.kontakt = kontakt;

    }

    public Bewerbung(LocalDate date, String unternehmen, String position, String kontakt, String notizen) {
        this(date, unternehmen, position, kontakt);
        this.notizen = notizen;
    }

        public int getId() {
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

