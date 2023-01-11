package com.florian.TP1;

import java.util.ArrayList;
import java.util.List;

public class Secteur {

    private TypeAnimal typeAnimauxDansSecteur;
    private List<Animal> animauxDansSecteur;

    Secteur(TypeAnimal typeAnimauxDansSecteur){
        this.typeAnimauxDansSecteur=typeAnimauxDansSecteur;
        animauxDansSecteur =new ArrayList<>();
    }

    public void ajouterAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {
        if(animal.getTypeAnimal().equals(typeAnimauxDansSecteur)) {
            animauxDansSecteur.add(animal);
        }
        else{
            throw new AnimalDansMauvaisSecteurException("Animal dans mauvais secteur");
        }
    }
    public int getNombreAnimaux(){
        return animauxDansSecteur.size();
    }
    public TypeAnimal obtenirType(){
        return typeAnimauxDansSecteur;
    }

}
