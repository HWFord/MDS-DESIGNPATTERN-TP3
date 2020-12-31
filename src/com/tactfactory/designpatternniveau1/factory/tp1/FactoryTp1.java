package com.tactfactory.designpatternniveau1.factory.tp1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
*
* @author tactfactory
*
* - Modifier le programme pour permettre de créer des Building au travers d'un design pattern "Factory" :
*   - 1 : Il existe 3 façon de créer des Building
*     - 1 : Créer aléatoirement pour toutes les classes du package courant qui implémente "Building", qui possède un
*         constructeur vide, qui sont publiques et qui ne sont pas abstraites
*     - 2 : Créer depuis une chaine de caractère qui représente le "simpleName" de la classe à utiliser qui implémente
*         "Building", qui possède un constructeur vide, qui est publique et qui n'est pas abstraite
*     - 3 : Depuis une classe qui implémente "Building", qui possède un constructeur vide, qui est publique et qui
*         n'est pas abstraite
*   - 2 : Créer deux listes de building dans le point d'entré de l'application
*     - 1 : La première liste doit contenir 20 Building généré aléatoirement
*     - 2 : La deuxième doit contenir au moins une fois chaque classe qui implémente "Building", qui possède un
*         constructeur vide, qui sont publiques et qui ne sont pas abstraites. En utilisant soit les chaine de
*         caractères ou les classes
*/
public class FactoryTp1 {
	public static void main(String[] args) {
		randomTown();
	    System.out.println("---------------------------");
	    manualTown();
	    
	}

  private static void manualTown() {
	  Creator creator = new ConcreteCreator();
	  ArrayList<Building> buildingsListM= new ArrayList<Building>();
	  buildingsListM.add(creator.createBuilding("CityHall"));
	  buildingsListM.add(creator.createBuilding("House"));
	  buildingsListM.add(creator.createBuilding("FireDepartement"));
	  for (Building product : buildingsListM) {
	      product.addBuilding();
	    }
  }

  private static void randomTown() {
	  Random random = new Random();
	  ArrayList<Buildings> buildingsListR= new ArrayList<Buildings>();
	  for (int i = 0; i < 20; i++){
		  Buildings randomBuildings = Buildings.values()[random.nextInt(Buildings.values().length)];
	      buildingsListR.add(randomBuildings);
	  }
	  System.out.println(Arrays.toString(buildingsListR.toArray()));
	  
  }

}
