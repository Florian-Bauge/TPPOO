package com.florian.TP1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp1Application {

	public static void main(String[] args) throws AnimalDansMauvaisSecteurException {
		SpringApplication.run(Tp1Application.class, args);
		Zoo zoo=new Zoo();
		Animal lion1=new Animal("Rémi",TypeAnimal.Tigre);
		System.out.print(lion1.getNomAnimal()+"type : "+lion1.getTypeAnimal());
		Secteur secteur1=new Secteur(TypeAnimal.Tigre);
		secteur1.ajouterAnimal(lion1);
		zoo.ajouterSecteur(TypeAnimal.Tigre);
		zoo.nouvelAnimal(lion1);
		System.out.print(zoo.nombreAnimaux());

	}

}
