package fr.algorithmie;

import java.util.Arrays;

public class RechercheMax {

	public static void main(String[] args) {

		// Tableau d'entiers avec des valeurs :
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Chercher le plus grand élément du tableau :
		Arrays.sort(array);
		System.out.println(array[array.length-1]);
		
	}

}
