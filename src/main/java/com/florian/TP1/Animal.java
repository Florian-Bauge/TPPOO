package com.florian.TP1;

public class Animal {
    private String nomAnimal;
    private TypeAnimal typeAnimal;
    Animal(String nomAnimal,TypeAnimal typeAnimal){
        this.nomAnimal=nomAnimal;
        this.typeAnimal=typeAnimal;
    }

    public String getNomAnimal() {
        return nomAnimal;
    }

    public TypeAnimal getTypeAnimal() {
        return typeAnimal;
    }
}
