package org.univ_paris8.iut.montreuil.qdev.tp2026.gr53.jeuQuizz.dto;



import org.univ_paris8.iut.montreuil.qdev.tp2026.gr53.jeuQuizz.enums.Langue;

public class QuestionnaireProprietesDto {
    public int idQuestionnaire;
    public String libelleQuestionnaire;
    public Langue langue;

    public QuestionnaireProprietesDto() {
    }

    public QuestionnaireProprietesDto(int idQuestionnaire, String libelleQuestionnaire, Langue langue) {
        this.idQuestionnaire = idQuestionnaire;
        this.libelleQuestionnaire = libelleQuestionnaire;
        this.langue = langue;
    }
}