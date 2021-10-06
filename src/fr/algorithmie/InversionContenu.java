package fr.algorithmie;

public class InversionContenu {
	
	public static void main(String[] args) {
		
		// Tableau d'entiers avec des valeurs :
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Affichage de tous les éléments avec une boucle :
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		// Copie de array dans arrayCopy (sens inverse) + affichage :
		int[] arrayCopy = new int[array.length];
		for (int i = 0 ; i < array.length; i++) {
			arrayCopy[i] = array[array.length-1-i];
			System.out.println(arrayCopy[i]);
		}
		
	}

}
