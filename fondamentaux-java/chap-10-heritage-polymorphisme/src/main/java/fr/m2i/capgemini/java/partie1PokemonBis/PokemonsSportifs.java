package fr.m2i.capgemini.java.partie1PokemonBis;

public class PokemonsSportifs extends PokemonsTerriens{
	
	private double cardiacFrequency;


	public PokemonsSportifs(String name, double weight, double height, double nbFeet, double cardiacFrequency) {
		super(name, weight, height, nbFeet);
		this.cardiacFrequency = cardiacFrequency;
	}


	public String getCardiacFrequency() {
		return "ma fréquence cardiaque est de " + (int)(cardiacFrequency) + " pulsations à la minute";
	}


	public void setCardiacFrequency(double cardiacFrequency) {
		this.cardiacFrequency = cardiacFrequency;
	}


	@Override
	protected String getHoursPerDayTV() {
		return null;
	}

}
