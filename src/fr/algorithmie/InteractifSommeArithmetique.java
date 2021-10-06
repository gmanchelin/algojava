package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {

		// Scanner et variable de saisie et de somme initialisées
		Scanner scan = new Scanner(System.in);
		int saisie;
		int sommeArithmetique = 0;
		
		// Demande dans la console + récup de la saisie 
		System.out.println("Saisissez un nombre entier :");
		saisie = scan.nextInt();
		
		
		// Boucle for pour additionner dans la variable de somme 
		// tous les entiers compris entre 1 et la saisie
		for(int i = 0; i <= saisie; i++) {
			sommeArithmetique = sommeArithmetique + saisie - i;
		} 
		
		// Affichage du résultat final dans la console 
		System.out.println(sommeArithmetique);

	}

}