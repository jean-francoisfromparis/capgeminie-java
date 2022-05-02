package fr.m2i.capgemini.java.partie1PokemonBis;

public class PokemonsCasaniers extends PokemonsTerriens{
	
	private double hoursPerDayTV;

	public PokemonsCasaniers(String name, double weight, double height, double nbFeet, double hoursPerDayTV) {
		super(name, weight, height, nbFeet);
		this.hoursPerDayTV = hoursPerDayTV;
	}

	public String getHoursPerDayTV() {
		return "je regarde la télé " + (int)(hoursPerDayTV) + "h par jour";
	}

	public void setHoursPerDayTV(double hoursPerDayTV) {
		this.hoursPerDayTV = hoursPerDayTV;
	}

	@Override
	protected String getCardiacFrequency() {
		// TODO Auto-generated method stub
		return null;
	}
}
