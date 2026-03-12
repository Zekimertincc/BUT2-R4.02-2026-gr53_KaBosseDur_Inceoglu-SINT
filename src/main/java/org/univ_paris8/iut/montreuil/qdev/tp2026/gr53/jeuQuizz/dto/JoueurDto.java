package org.univ_paris8.iut.montreuil.qdev.tp2026.gr53.jeuQuizz.dto;


import org.univ_paris8.iut.montreuil.qdev.tp2026.gr53.jeuQuizz.enums.Langue;

public class JoueurDto {
    public String pseudo;
    public String prenom;
    public int anneeNaissance;
    public String centresInterets;
    public Langue languePreferee;
    public JoueurDto() {
    }

    public JoueurDto(String pseudo, String prenom) {
        this.pseudo = pseudo;
        this.prenom = prenom;
        this.anneeNaissance =  anneeNaissance;
        this.centresInterets = centresInterets;
        this.languePreferee = languePreferee;

    }
}