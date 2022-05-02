package fr.m2i.capgemini.java.partie1PokemonBis;

public class PokemonDeMers extends Pokemons {
	
	private double fins;


	public PokemonDeMers(String name, double weight, double fins) {
		super(name, weight);
		this.fins = fins;
	}
	
	
	public double getFins() {
		return fins;
	}
	
	
	
	public String getFinsInString() {
		
		return "j'ai " + (int)(this.fins) + " nageoires";
	}
	

	public void setFins(double fins) {
		this.fins = fins;
	}
	
	

	@Override
	protected String getHoursPerDayTV() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	protected double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	protected String getCardiacFrequency() {
		// TODO Auto-generated method stub
		return null;
	}


	public double speedDouble() {
		return this.getFins() * (this.getWeight() / (double)25);
	}

	@Override
	protected String speed() {
		
		return " ma \r\n"
		  		+ "vitesse est de " + this.getFins() * (this.getWeight() / (double)25) + " km/h";
	}


	@Override
	protected String getNbFeetInString() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String toString() {
		return  String.format("Je suis le pokémon %s mon poids est de %.0f kg, %s  %s",getName(), getWeight(), speed(), getFinsInString());
	}
	
	


}
