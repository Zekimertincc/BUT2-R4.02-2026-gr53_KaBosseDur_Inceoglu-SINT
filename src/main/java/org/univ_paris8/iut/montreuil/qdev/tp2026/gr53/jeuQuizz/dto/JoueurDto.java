package org.univ_paris8.iut.montreuil.qdev.tp2026.gr53.jeuQuizz.dto;


public class JoueurDto {
    public String pseudo;
    public String prenom;

    public JoueurDto() {
    }

    public JoueurDto(String pseudo, String prenom) {
        this.pseudo = pseudo;
        this.prenom = prenom;
    }
}