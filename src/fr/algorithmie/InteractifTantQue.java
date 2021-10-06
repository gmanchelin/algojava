package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

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
		
		System.out.println("Merci!");
	}

}
