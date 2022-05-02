package fr.m2i.capgemini.java.Partie2NouveauCarburant;


public class main {

	public static void main(String[] args) {
			
		
		//Partie 2
		/*
		 * Vehicle camion = new Vehicle("monCamion", 3, 10, 10);
		 * System.out.println(camion);
		 */
		
			Bus ligne1 = new Bus("ligne1", 4, 0, 0);
			System.out.println(ligne1);
			System.out.printf("La vitesse maximale  est %.0f km/h",Bus.maxSpeed());
	}

}
