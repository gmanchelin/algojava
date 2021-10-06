package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {

		// Scanner et tableau de saisie initialisés
		Scanner scan = new Scanner(System.in);
		int[] saisies = new int[10];
		
		// Programme qui demande 10 entiers à l'utilisateur 
		// et qui les stocke dans le tableau de saisies
		for (int i = 0; i < saisies.length; i++) {
				System.out.println("Saisissez un nombre entier :");
				int saisie = scan.nextInt();
				saisies[i] = saisie;
		}

		// Afficher le plus grand nombre saisi du tableau 
		Arrays.sort(saisies);
		System.out.println(saisies[saisies.length-1]);

	}

}
