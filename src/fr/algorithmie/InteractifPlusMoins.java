package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {

		// Scanner et variable de saisie et du nombre de coups initialisés
		Scanner scan = new Scanner(System.in);
		int saisie = 0;
		int nbCoups = 0;
		
		// Nombre aléatoire entre 1 et 100 
		int random = new Random().nextInt(100)+1;
		System.out.println(random);

		do {
		System.out.println("Devinez le nombre aléatoire entre 1 et 100");
		saisie = scan.nextInt();
		nbCoups ++;
		} while (saisie != random);
		
		System.out.println("Bravo, vous avez trouvé en " + nbCoups + " coups!");
		
	}

}
