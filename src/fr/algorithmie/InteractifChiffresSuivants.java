package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {

		// Scanner et variable de saisie initialisées
		Scanner scan = new Scanner(System.in);
		int saisie;
		
		// Demande dans la console + récup de la saisie 
		System.out.println("Saisissez un nombre entier :");
		saisie = scan.nextInt();
		
		// Boucle for pour afficher les 10 nombres suivant la saisie
		for(int i = 1; i <= 10; i++) {
			System.out.println(saisie + i);
		}

	}
	
}
