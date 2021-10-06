package fr.boucles;

public class ExerciceTableauEntier {
	
	public static void main(String[] args) {

	// EXERCICE : BOUCLES DE BASE 	
	
		// Tableau d'entiers de 1 à 10 :
		int[] nombreEntiers = new int[10];
		for (int i = 0; i <10; i++) {
			nombreEntiers[i] = i+1;
		} 
		
		//1er élément du tableau : 
		System.out.println(nombreEntiers[0]); // 1
		
		//Longueur du tableau : 
		System.out.println(nombreEntiers.length); // 10
		
		//Valeur du dernier élément du tableau :
		System.out.println(nombreEntiers[nombreEntiers.length-1]); // 10
		
		//Modif de la valeur de l'élément d'index 4 --> 8
		
		nombreEntiers[4] = 8;
		System.out.println(nombreEntiers[4]); // 8
		
	}
}
