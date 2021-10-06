package fr.algorithmie;

public class AffichageIdentite {

	public static void main(String[] args) {

		// Afficher 10 fois son identité (nom prénom)
		String nom = "Manchelin";
		String prenom = "Gabriel";
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(nom + " " + prenom + "("+i+")");
		}

	}

}
