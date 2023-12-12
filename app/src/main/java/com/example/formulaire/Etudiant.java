package com.example.formulaire;

import java.io.Serializable;

public class Etudiant implements Serializable {
    private String nom;
    private String prenom;
    private String genre;
    private String choix;

    public Etudiant(String nom, String prenom, String genre, String choix){
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.choix = choix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getChoix() {
        return choix;
    }

    public void setChoix(String choix) {
        this.choix = choix;
    }
}
