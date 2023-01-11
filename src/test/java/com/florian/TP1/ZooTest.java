package com.florian.TP1;

import org.junit.jupiter.api.Test;

public class ZooTest {
    @Test
    public void testNombreMaxiVisiteur() throws LimiteVisiteurException {
        Zoo zoo=new Zoo();
        zoo.ajouterSecteur(TypeAnimal.Lion);
        try {
            for (int i = 0; i <16 ; i++) {
                zoo.nouveauVisiteur();}
        }
        catch (LimiteVisiteurException e)



        }



    }
}
