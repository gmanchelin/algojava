package fr.algorithmie;

public class CalculMoyenne {
	
	public static void main(String[] args) {

		// Tableau d'entiers avec des valeurs :
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Moyenne de tous les éléments du tableau : 
		int somme = 0;
		for(int i = 0; i < array.length; i++) {
			somme = somme + array[i];
		}
		
		double moyenne = (double)somme / array.length;
		System.out.println(moyenne);
		
	}

}
