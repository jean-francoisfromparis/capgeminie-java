package fr.m2i.capgemini.java.Partie2NouveauCarburant;

public class Bus extends Vehicle {

	public Bus(String immat, double weight, double load, double maxLoad) {
		super(immat, weight, load, maxLoad);
	}
	static double maxSpeed() {
		return 150;
	}

}
