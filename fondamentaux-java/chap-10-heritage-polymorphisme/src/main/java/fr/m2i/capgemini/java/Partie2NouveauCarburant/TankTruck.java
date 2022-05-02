package fr.m2i.capgemini.java.Partie2NouveauCarburant;

public class TankTruck extends Vehicle  {
	
	final double maxLoad = 10 ;
	
	public TankTruck(String immat, double weight, double load, double maxLoad) {
		super(immat, weight, load, maxLoad);
	}

	public double getMaxLoad() {
		return maxLoad;
	}

	
	  static void maxSpeed() {
		  double maxSpeed = 0;
		  if(load == 0) {
			  maxSpeed = 130;
		  }
		  if (load <= 1) {
			  maxSpeed = 110;
		}
		  if (load <= 4) {
			  maxSpeed = 90 ;
		}
		  if (load > 4) {
			  maxSpeed = 80;
		}
		
		   }
	 

}
