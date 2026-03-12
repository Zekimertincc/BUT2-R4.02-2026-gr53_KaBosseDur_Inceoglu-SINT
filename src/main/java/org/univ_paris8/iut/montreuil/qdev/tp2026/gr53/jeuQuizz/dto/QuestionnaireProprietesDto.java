package org.univ_paris8.iut.montreuil.qdev.tp2026.gr53.jeuQuizz.dto;



import org.univ_paris8.iut.montreuil.qdev.tp2026.gr53.jeuQuizz.enums.Langue;

public class QuestionnaireProprietesDto {
    public int idQuestionnaire;
    public String libelleQuestionnaire;
    public Langue langue;
    public int nbQuestions;
    public int nbQuestionsSimples;
    public int nbQuestionsIntermediaires;
    public int nbQuestionsExpertes;
    public QuestionnaireProprietesDto() {
    }

    public QuestionnaireProprietesDto(int idQuestionnaire, String libelleQuestionnaire, int nbQuestions,int nbQuestionsSimples,int nbQuestionsIntermediaires,int nbQuestionsExpertes ,Langue langue) {
        this.idQuestionnaire = idQuestionnaire;
        this.libelleQuestionnaire = libelleQuestionnaire;
        this.langue = langue;
        this.nbQuestions = nbQuestions;
        this.nbQuestionsSimples = nbQuestionsSimples;
        this.nbQuestionsIntermediaires = nbQuestionsIntermediaires;
        this.nbQuestionsExpertes = nbQuestionsExpertes;

    }
}