package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int option = 0;
		int batons = 21;

		
		System.out.println("JEU DE NIM");
		System.out.println("Il reste " + batons +" bâtons : ");
		for (int i = 0; i < batons; i++) {
			System.out.print("|");
		}
		System.out.println(" ");
		
		do {
			System.out.println("Que souhaitez-vous faire?");
			System.out.println("1- Prendre 1 bâton");
			System.out.println("2- Prendre 2 bâton");
			System.out.println("3- Prendre 3 bâton");
			int saisie = scan.nextInt();
			if (saisie > batons) {
				System.out.println("Vous ne pouvez pas prendre plus de bâtons qu'il n'en reste");
			} else if (saisie > 0 && saisie < 4) {
				
				System.out.println("Vous avez pris " + saisie + " bâtons");
				batons = batons - saisie;
				System.out.println("Il reste " + batons +" bâtons : ");
				for (int i = 0; i < batons; i++) {
					System.out.print("|");
				};
				System.out.println(" ");
				System.out.println("Au tour de l'adversaire!");
				int random = new Random().nextInt(3)+1;
				System.out.println(random);
				System.out.println("L'adversaire a pris " + random + " bâtons");
				batons = batons - random;
				System.out.println("Il reste " + batons +" bâtons : ");
				for (int i = 0; i < batons; i++) {
					System.out.print("|");
				};
				
			} else {
				System.out.println("Veuillez saisir un entier entre 1 et 3 uniquement!");
			}

		} while (batons != 0);


	}

}
