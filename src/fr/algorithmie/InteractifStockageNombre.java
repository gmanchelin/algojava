package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
			
		// Initialisation de variables (scan, i, option pour récup la saisie
		// dans le menu (1 ou 2) et le tableau stockant les saisies
		Scanner scan = new Scanner(System.in);
		int option = 0;
		int i = 1;
		int[] saisies = new int[i];
		
		// Boucle du menu
		do {
			System.out.println("Que souhaitez-vous faire?");
			System.out.println("1 - Ajouter le nombre au tableau");
			System.out.println("2 - Afficher les nombres existants");
			System.out.println("Tout autre choix vous fera sortir de l'application");
			option = scan.nextInt();
			switch (option) {
			case 1 : // Ajout du nombre dans le tableau
				// Récupération de la saisie dans le tableau :
				System.out.println("Saisissez un nombre entier :");
				int saisie = scan.nextInt();
				saisies[i-1] = saisie;
				
				// Création d'un tableau temporaire pour stocker les valeurs
				// du tableau saisie (on fait cela car un tableau en Java ne peut 
				// être redimensionné, il faut donc le réinitialiser)
				int[] temp = new int[i];
				for(int j = 0; j < temp.length; j++) {
					temp[j] = saisies[j];
				} 
					
				// Réinitialisation du tableau, et length augmentée de 1
				saisies = new int[i+1];
				
				// Réattribution des valeurs du tableau temporaire au tableau
				// des saisies
				for(int j = 0; j < temp.length; j++) {
					saisies[j] = temp[j];
				}
				
				// Incrément du i pour ne pas réécraser la première entrée 
				// du tableau à chaque fois
				i++;
				
				break;
			case 2 : // Affichage des nombres du tableau
				for (int j = 0; j < saisies.length; j++) {
					System.out.println(saisies[j]);
				}
				break;
			default :
			}
			
		// While fermant le programme si une option autre que 1 ou 2 est saisie	
		} while (option == 1 || option == 2);
		System.out.println("Fermeture du programme.");
				
		
	}
	
}
