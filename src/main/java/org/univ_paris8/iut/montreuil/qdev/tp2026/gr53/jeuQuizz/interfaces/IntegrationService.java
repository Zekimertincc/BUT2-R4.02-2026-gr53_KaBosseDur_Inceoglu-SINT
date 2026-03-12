package org.univ_paris8.iut.montreuil.qdev.tp2026.gr53.jeuQuizz.interfaces;
import org.univ_paris8.iut.montreuil.qdev.tp2026.gr53.jeuQuizz.dto.ElementsDispoPourPartieDto;
import org.univ_paris8.iut.montreuil.qdev.tp2026.gr53.jeuQuizz.exceptions.JoueurIndisponibleException;
import org.univ_paris8.iut.montreuil.qdev.tp2026.gr53.jeuQuizz.exceptions.QuestionnaireIndisponibleException;


public interface IntegrationService {
    ElementsDispoPourPartieDto determinerElementsDispoPourPartie()
            throws QuestionnaireIndisponibleException, JoueurIndisponibleException;
}