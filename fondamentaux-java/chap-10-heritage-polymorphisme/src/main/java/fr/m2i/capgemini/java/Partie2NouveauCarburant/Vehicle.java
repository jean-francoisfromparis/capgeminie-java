package fr.m2i.capgemini.java.Partie2NouveauCarburant;


public abstract class Vehicle {

	protected String immat = "";


	protected double weight = 0;


    public static double load = 0;
    
    protected double MaxLoad = 0;



	public Vehicle(String immat, double weight, double load, double maxLoad) {
		super();
		this.immat = immat;
		this.weight = weight;
		this.load = load;
		MaxLoad = maxLoad;
	}



	public String getImmat() {
		return immat;
	}




	public void setImmat(String immat) {
		this.immat = immat;
	}




	public double getWeight() {
		return weight;
	}




	public void setWeight(double weight) {
		this.weight = weight;
	}




	public double getLoad() {
		return load;
	}




	public void setLoad(double load) {
		this.load = load;
	}




	public double getMaxLoad() {
		return MaxLoad;
	}




	public void setMaxLoad(double maxLoad) {
		MaxLoad = maxLoad;
	}




	@Override
	public String toString() {
		return "Pour le véhicule [l'immatriculation est de :" + getImmat() + ", le poids à vide est de :" + getWeight() + ", la charge est de :" + getLoad()
				+ ", la charge Max est de :" + getMaxLoad() + "]";
	}



}
