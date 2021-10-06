package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
	
	// EXERCICE : BOUCLES DE BASE 
		
		// Afficher tous les nombres de 1 à 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// Afficher 20 fois nom et prénom
		for (int i = 1; i <= 20; i++) {
			System.out.println("Gabriel Manchelin : "+ i);
		}
		
		// Afficher les chiffres pairs de 1 à 100
		for (int i = 1; i <= 100; i++) {
	      if (i % 2 == 0) {
	        System.out.println(i);
	      }
		}
		
		// Afficher les chiffres impairs de 1 à 100
		for (int i = 1; i <= 100; i++) {
	      if (i % 2 != 0) {
	        System.out.println(i);
	      }
		}
		
	// EXERCICE : PARCOURS D'UN TABLEAU D'ENTIERS
		// Ctrl + Shift + C pour commenter des lignes sélectionnées
		// Ctrl + Shift + F pour formater automatiquement
		
		int[] nbs = new int[3];
		nbs[0] = 14;
		System.out.println(nbs[1]);

	}

}
