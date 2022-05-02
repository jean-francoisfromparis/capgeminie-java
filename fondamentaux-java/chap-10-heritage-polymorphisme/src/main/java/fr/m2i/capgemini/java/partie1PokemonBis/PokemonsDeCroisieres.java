package fr.m2i.capgemini.java.partie1PokemonBis;

public class PokemonsDeCroisieres extends PokemonDeMers{

	public PokemonsDeCroisieres(String name, double weight, double fins) {
		super(name, weight, fins);
	}
	

	@Override
	protected String speed() {
		
		double speed = (this.getFins() * (this.getWeight() / (double)25))/2 ;
		
		return String.format(" ma \r\n"
		  		+ "vitesse est de %.1f km/h", speed) ;
	}

}
