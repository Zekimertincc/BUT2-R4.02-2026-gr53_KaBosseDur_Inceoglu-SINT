package org.univ_paris8.iut.montreuil.qdev.tp2026.gr53.jeuQuizz.dto;
import java.util.List;

public class ElementsDispoPourPartieDto {
    public List<JoueurDto> listeJoueurs;
    public List<QuestionnaireProprietesDto> listeQuestionnaires;

    public ElementsDispoPourPartieDto() {
    }

    public ElementsDispoPourPartieDto(List<JoueurDto> listeJoueurs, List<QuestionnaireProprietesDto> listeQuestionnaires) {
        this.listeJoueurs = listeJoueurs;
        this.listeQuestionnaires = listeQuestionnaires;
    }
}
