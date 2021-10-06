package fr.boucles;

public class ExercicesBouclesEtTests {

	public static void main(String[] args) {
		
		// Tableau d'entiers avec des valeurs :
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Affichage de tous les éléments avec une boucle :
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		// Affichage de tous les éléments dans le sens inverse : 
		for(int i = array.length; i > 0; i--) {
			System.out.println(array[i-1]);
		}

		// Combinaison boucle + test pour n'afficher que les entiers > 3 :
		for(int i =0; i < array.length; i++) {
			if(array[i] > 3) {
				System.out.println(array[i]);
			}
		}
		
		// Combinaison boucle + test pour n'afficher que les entiers pairs :
		for(int i =0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
			
		// Combinaison boucle + test pour n'afficher que les entiers impairs :
		for(int i =0; i < array.length; i++) {
			if(array[i] % 2 == 1) {
				System.out.println(array[i]);
			}
		}
		
	}
	
}
