package fr.m2i.capgemini.java.partie1PokemonBis;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.Scanner;

public class PokemonsCollection {

	static ArrayList<Pokemons> pokemonsCollection = new ArrayList<Pokemons>();

	public static String pokemonName() {
		Scanner input = new Scanner(System.in);
		String name = "";
		// System.out.println("veuillez entrer le nom du pokémon (par ex : 'Picachou')
		// ");
		if (!input.hasNext()) {
			System.out.println("veuillez entrer un de pokémon nom valide (par ex : 'Picachou')");
			pokemonName();
		} else {
			name = input.next();
			return name;
		}
		return name;
	}

	private static double pokemonWeight() {
		Scanner input = new Scanner(System.in);
		double weight = 0;
		// System.out.println("veuillez entrer le poids du pokémon (par ex : '15,6')");
		// entrer du poids du pokemon
		if (!input.hasNextDouble()) {
			System.out.println("veuillez entrer un poids valide (par ex : '15,6')");
			pokemonWeight();
		} else {
			weight = input.nextDouble();
			return weight;
		}
		return weight;
	}

	private static double pokemonHeight() {
		Scanner input = new Scanner(System.in);
		double height = 0;
		// System.out.println("veuillez entrer la taille du pokémon (par ex : '1,5')");
		// entrer du taille du pokemon
		if (!input.hasNextDouble()) {
			System.out.println("veuillez entrer une taille valide (par ex : '1,5')");
			pokemonHeight();
		} else {
			height = input.nextDouble();
			return height;
		}
		return height;
	}

	private static double pokemonNbFeet() {
		Scanner input = new Scanner(System.in);
		double nbFeet = 0;
		// System.out.println("veuillez entrer le nombre de pattes du pokémon (par ex :
		// '2')");
		// entrer le nombre de pattes du pokemon
		if (!input.hasNextInt()) {
			System.out.println("veuillez entrer un nombre de pattes valide (par ex : '2')");
			pokemonNbFeet();
		} else {
			nbFeet = (double) (input.nextInt());
			return nbFeet;
		}
		return nbFeet;
	}

	private static double pokemonCardiacFrequency() {
		Scanner input = new Scanner(System.in);
		double cardiacFrequency = 0;
		// System.out.println("veuillez entrer la fréquence cardiaque du pokémon (par ex
		// : '130')");
		// entrer la fréquence cardiaque du pokemon
		if (!input.hasNextInt()) {
			System.out.println("veuillez entrer une fréquence cardiaque valide (par ex : '130')");
			pokemonCardiacFrequency();
		} else {
			cardiacFrequency = (double) (input.nextInt());
			return cardiacFrequency;
		}
		return cardiacFrequency;
	}

	
	private static double pokemonHoursPerDayTV() {
		Scanner input = new Scanner(System.in);
		double hoursPerDayTV = 0;

		// entrer le nombre d'heure devant la TV du pokemon
		if (!input.hasNextInt()) {
			System.out.println("veuillez entrer un nombre d'heures devant la TV du pokémon (par ex : '8')");
			pokemonHoursPerDayTV();
		} else {
			hoursPerDayTV = (double) (input.nextInt());
			return hoursPerDayTV;
		}
		return hoursPerDayTV;

	}

	
	private static double pokemonNbFins() {
		Scanner input = new Scanner(System.in);
		double fins = 0;

		// entrer le nombre d'heure devant la TV du pokemon
		if (!input.hasNextInt()) {
			System.out.println("veuillez entrer un nombre d'heures devant la TV du pokémon (par ex : '8')");
			pokemonNbFins();
		} else {
			fins = (double) (input.nextInt());
			return fins;
		}
		return fins;
	}

	
	static void createPokemon() {

		// Initialisation des variables
		int category = 0;
		String name = "";
		double weight = 0;
		double height = 0;
		double nbFeet = 0;
		double cardiacFrequency = 0;
		double hoursPerDayTV = 0;
		double fins = 0;

		Scanner input = new Scanner(System.in);
			System.out.println("veuillez entrer la catégorie de votre pokémon \n" + "(1) pour un pokémon sportif \n"
				+ "(2) pour un pokémon casanier \n" + "(3) pour un pokémon des mers \n"
				+ "(4) pour un pokémon de croisière \n");

		ValueRange range = ValueRange.of(1, 4);

		if (!input.hasNextInt() && !range.isValidIntValue(input.nextInt())) {
			System.out.println("veuillez entrer un de pokémon nom valide");
		} else {
			// entrer la catégorie du pokemon
			category = input.nextInt();

			switch (category) {
			case 1: {
				// code pour les pokémons sportifs
		
				System.out.println("veuillez entrer le nom du pokémon (par ex : 'Picachou') ");
				name = pokemonName();

				System.out.println("veuillez entrer le poids du pokémon (par ex : '15,6')");
				weight = pokemonWeight();

				System.out.println("veuillez entrer la taille du pokémon (par ex : '1,5')");
				height = pokemonHeight();

				System.out.println("veuillez entrer le nombre de pattes du pokémon (par ex : '2')");
				nbFeet = pokemonNbFeet();

				System.out.println("veuillez entrer la fréquence cardiaque du pokémon (par ex : '130')");
				cardiacFrequency = pokemonCardiacFrequency();

		

		
				PokemonsSportifs pokemonName = new PokemonsSportifs(name, weight, height, nbFeet, cardiacFrequency);
				pokemonsCollection.add(pokemonName);
				
				input.close();
				//return pokemonsCollection.add(pokemonName);
			}
			case 2: {
				// code pour les pokémons casaniers

				// entrer le nom du pokemon
				System.out.println("veuillez entrer le nom du pokémon (par ex : 'Picachou') ");
				name = pokemonName();

				// entrer du poids du pokemon
				System.out.println("veuillez entrer le poids du pokémon (par ex : '15,6')");
				weight = pokemonWeight();

				// entrer la taille du pokemon
				System.out.println("veuillez entrer la taille du pokémon (par ex : '1,5')");
				height = pokemonHeight();

				// entrer le nombre de pattes du pokemon
				System.out.println("veuillez entrer le nombre de pattes du pokémon (par ex : '2')");
				nbFeet = pokemonNbFeet();

				// entrer le nombre d'heure devant la tv du pokemon
				System.out.println("veuillez entrer un nombre d'heures devant la TV du pokémon");
				hoursPerDayTV = pokemonHoursPerDayTV();

				PokemonsCasaniers pokemonName = new PokemonsCasaniers(name, weight, height, nbFeet, hoursPerDayTV);
				pokemonsCollection.add(pokemonName);
				input.close();
				//return  pokemonsCollection.add(pokemonName);
			}
			case 3: {
				// code pour les pokémons casaniers

				// entrer le nom du pokemon
				System.out.println("veuillez entrer le nom du pokémon (par ex : 'Picachou') ");
				name = pokemonName();

				// entrer du poids du pokemon
				System.out.println("veuillez entrer le poids du pokémon (par ex : '15,6')");
				weight = pokemonWeight();

				// entrer le nombre de nageoires du pokemon
				System.out.println("veuillez entrer le nombre de nageoires du pokémon (par ex : '2')");
				fins = pokemonNbFins();



				PokemonDeMers pokemonName = new PokemonDeMers(name, weight, fins);
				pokemonsCollection.add(pokemonName);
				input.close();
				//return  pokemonsCollection.add(pokemonName);
			}
			case 4: {
				// code pour les pokémons casaniers

				// entrer le nom du pokemon
				System.out.println("veuillez entrer le nom du pokémon (par ex : 'Picachou') ");
				name = pokemonName();

				// entrer du poids du pokemon
				System.out.println("veuillez entrer le poids du pokémon (par ex : '15,6')");
				weight = pokemonWeight();

				// entrer le nombre de nageoires du pokemon
				System.out.println("veuillez entrer le nombre de nageoires du pokémon (par ex : '2')");
				fins = pokemonNbFins();

				PokemonsDeCroisieres pokemonName = new PokemonsDeCroisieres(name, weight, fins);
				pokemonsCollection.add(pokemonName);
				input.close();
				//return  pokemonsCollection.add(pokemonName);
			}
			default:
				throw new IllegalArgumentException("valeur non valide : " + category);
			}
		}
		input.close();
		//return false;
	}

	
		public static void addPokemons(Pokemons item) {
				
			pokemonsCollection.add(item);
		}
		
		public static double getSpeedAverage(ArrayList<Pokemons> item) {
			
			double sum = 0;
			item.size();
			for (int i = 0; i < item.size(); i++) {
				sum += item.get(i).speedDouble();
			}
			return sum/item.size();
		}
		
		public static double getPokemonsSportifSpeedAverage(ArrayList<Pokemons> item) {
			int j = 0;
			double sum = 0;
			for (int i = 0; i < item.size(); i++) {
				if (item.get(i) instanceof PokemonsSportifs) {
					sum += item.get(i).speedDouble();
					j++;
					j =+j;
				}
				
				
			}
				
			/*
			 * double sum = 0; item.size(); for (int i = 0; i < item.size(); i++) { sum +=
			 * item.get(i).speedDouble(); } return sum/item.size();
			 */
			return sum/j;
		}
	
}
