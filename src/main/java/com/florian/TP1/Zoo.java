package com.florian.TP1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private int visiteur;
    private List<Secteur> secteurAnimaux;
    private static int nbvisiteurMaxParSecteur=15;

    public void ajouterSecteur(TypeAnimal typeAnimal){
        secteurAnimaux.add(new Secteur(typeAnimal));


    }
    Zoo( ){

        secteurAnimaux=new ArrayList<>();

    }
    public void nouveauVisiteur() throws LimiteVisiteurException{
        if(visiteur<getLimitVisiteur()) {
            visiteur++;
        }
        else throw new LimiteVisiteurException("Limite visiteur atteinte");
    }
    public int getLimitVisiteur(){
        return nbvisiteurMaxParSecteur*secteurAnimaux.size();
    }
    public void nouvelAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {
        for (Secteur secteurAnimal : secteurAnimaux){
            if(animal.getTypeAnimal().equals(secteurAnimal.obtenirType())){
                secteurAnimal.ajouterAnimal(animal);
            }
        }

    }
    public int nombreAnimaux(){
        int cpt=0;
        for(Secteur secteur: secteurAnimaux){
            cpt=cpt+secteur.getNombreAnimaux();
        }
        return cpt;
    }

}
