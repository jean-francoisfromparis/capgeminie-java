package fr.m2i.capgemini.java.partie1PokemonBis;

public abstract class Pokemons {
	
    private String name;


    private double weight;

	
    public Pokemons(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		
		return String.format("Je suis le pokémon %s mon poids est de %.0f kg, %n %s %s, ma taille \r\n"
				+ "est de %sm %s %s",name, weight, speed(), getNbFeetInString(), getHeight(),( getCardiacFrequency() != null ) ? getCardiacFrequency() : "", (getHoursPerDayTV() != null ) ? getHoursPerDayTV(): "" );
	}

	protected abstract String getHoursPerDayTV();

	protected abstract double getHeight();

	protected abstract String getCardiacFrequency();

	protected abstract String getNbFeetInString();

	protected abstract String speed();
	
	protected abstract double speedDouble();




}
