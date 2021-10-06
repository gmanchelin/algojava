package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {

		// Scanner et variable de saisie initialisées
		Scanner scan = new Scanner(System.in);
		int saisie;
		
		// La console demande qu'un saisisse un entier tant que celui-ci
		// n'est pas entre 1 et 10
		do {
		System.out.println("Saisissez un nombre entier entre 1 et 10 : ");
		saisie = scan.nextInt();
		} while (saisie < 1 || saisie > 10);
		
		// On boucle avec concaténation dans le Sysout pour gérer l'affichage
		// des résultats de multiplication (de 1 à 10) dans la console 
		for(int i = 1; i <= 10; i++) {
			System.out.println(saisie + " * " + i + " = " + saisie*i);
		}

	}

}
