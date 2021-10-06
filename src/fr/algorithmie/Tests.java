package fr.algorithmie;

import java.util.Scanner;

public class Tests {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int option = 0;
		int i = 1;
		int[] saisies = new int[i];
		
		do {
			System.out.println("Saisissez un nombre entier :");
			int saisie = scan.nextInt();
			System.out.println("Que souhaitez-vous faire?");
			System.out.println("1 - Ajouter le nombre au tableau");
			System.out.println("2 - Afficher les nombres existants");
			System.out.println("Tout autre choix vous fera sortir de l'application");
			option = scan.nextInt();
			switch (option) {
			case 1 : 
				for(int j = 0; j < saisies.length ; j++) {
					saisies[j] = saisie;
					System.out.println("Index " + j + " du tableau saisies : " + saisies[j]);
				}
				
				int[] temp = new int[i];
				for(int j = 0; j < temp.length; j++) {
					temp[j] = saisies[j];
					System.out.println("Index " + j + " du tableau temp : " + temp[j]);
				}
				
				saisies = new int[i+1];
				for(int j = 0; j < saisies.length ; j++) {
					System.out.println("Index " + j + " du tableau saisies (après agrandissement) : " + saisies[j]);
				}
				
				for(int j = 0; j < temp.length; j++) {
					saisies[j] = temp[j];
					System.out.println("Index " + j + " du tableau saisies : " + saisies[j]);
				}
				
				
				break;
			case 2 : 
				for (int j = 0; j < saisies.length; j++) {
					System.out.println(saisies[j]);
				}
				break;
			default :
			}
			
			
		} while (option == 1 || option == 2);
		System.out.println("Fermeture du programme.");
		
		
		
	}

}
