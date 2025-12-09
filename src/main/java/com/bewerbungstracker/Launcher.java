package com.bewerbungstracker;

import javafx.application.Application;

public class Launcher {
    public static void main(String[] args) {
//        Application.launch(HelloApplication.class, args);
        Bewerbung b1 = new Bewerbung("Ahaaaron GmbH");
        Bewerbung b2 = new Bewerbung("Mimimi GmbH", "Softwareentwickler", null, "Bestes Unternehmen der Welt!");

        System.out.println(b1);
        System.out.println("===================");
        System.out.println("Unternehmen: " + b2.getUnternehmen());
        System.out.println("Position: " + b2.getPosition());
        System.out.println("Kontakt: " + b2.getKontakt());
        System.out.println("Notizen: " + b2.getNotizen());

    }
}

//TODO: pom.xml anpassen: "com.bewerbungstracker" statt "com.bewerbungstracker_javafx" usw...
// <mainClass>
//    com.bewerbungstracker/com.bewerbungstracker.HelloApplication
//</mainClass>

//TODO: Gut überlegen die Use Cases! Was muss der User auf jeden Fall eingeben und was darf leer sein?

//TODO: Alle Klassen unter "com.bewergungstracker" Paket behalten.
