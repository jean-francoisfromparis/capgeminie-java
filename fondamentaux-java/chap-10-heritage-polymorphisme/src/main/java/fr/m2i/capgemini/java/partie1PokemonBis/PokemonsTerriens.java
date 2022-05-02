package fr.m2i.capgemini.java.partie1PokemonBis;

public abstract class PokemonsTerriens extends Pokemons{

    private double height;
    
    private double nbFeet;
	

	public PokemonsTerriens(String name, double weight, double height, double nbFeet) {
		super(name, weight);
		this.height = height;
		this.nbFeet = nbFeet;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getNbFeet() {
		return nbFeet;
	}
	
	public String getNbFeetInString() {
		return String.format("j'ai %.0f pattes", nbFeet);
	}


	public void setNbFeet(double nbFeet) {
		this.nbFeet = nbFeet;
	}
	
	public double speedDouble() {
		return (this.getHeight() * this.getNbFeet() * 3);
	}
	

	@Override
	protected String speed() {
		double speed = (this.getHeight() * this.getNbFeet() * 3);
		return  String.format(" ma vitesse est de  %.1f km/h", speed);
	}
}
