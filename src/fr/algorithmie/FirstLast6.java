package fr.algorithmie;

public class FirstLast6 {
	
	public static void main(String[] args) {

		// Tableau d'entiers avec des valeurs (6 au début et à la fin) :
		int[] array1 = {6, 9, 5, -4, 6};
		
		// Initialisation du Booléen
		boolean controle1;
		
		// Méthode qui renvoie true s'il y a des valeurs, et 6 en valeur en début ou à la fin : 
		if (array1.length != 0 && array1[0] == 6 || array1[array1.length-1] == 6) {
			controle1 = true;
			System.out.println(controle1);
		} else {
			controle1 = false;
			System.out.println(controle1); 
		} // Retourne true
		
		
		// --------------------------------------------------------------------------------------
		
		// Tableau d'entiers avec des valeurs (6 au début) :
		int[] array2 = {6, 9, 5, -4};
		
		// Initialisation du Booléen
		boolean controle2;
		
		// Méthode qui renvoie true s'il y a des valeurs, et 6 en valeur en début ou à la fin : 
		if (array2.length != 0 && array2[0] == 6 || array2[array2.length-1] == 6) {
			controle2 = true;
			System.out.println(controle2);
		} else {
			controle2 = false;
			System.out.println(controle2); 
		} // Retourne true
		
		// --------------------------------------------------------------------------------------
		
		// Tableau d'entiers avec des valeurs (6 à la fin) :
		int[] array3 = {9, 5, -4, 6};
		
		// Initialisation du Booléen
		boolean controle3;
		
		// Méthode qui renvoie true s'il y a des valeurs, et 6 en valeur en début ou à la fin : 
		if (array3.length != 0 && array3[0] == 6 || array3[array3.length-1] == 6) {
			controle3 = true;
			System.out.println(controle3);
		} else {
			controle3 = false;
			System.out.println(controle3); 
		} // Retourne true
		
		// --------------------------------------------------------------------------------------
		
		// Tableau d'entiers avec des valeurs (pas de 6 au début ou à la fin) :
		int[] array4 = {9, 5, -4, 6, 9};
		
		// Initialisation du Booléen
		boolean controle4;
		
		// Méthode qui renvoie true s'il y a des valeurs, et 6 en valeur en début ou à la fin : 
		if (array4.length != 0 && array4[0] == 6 || array4[array4.length-1] == 6) {
			controle4 = true;
			System.out.println(controle4);
		} else {
			controle4 = false;
			System.out.println(controle4); 
		} // Retourne false
		
		// --------------------------------------------------------------------------------------
		
		// Tableau d'entiers sans valeurs :
		int[] array5 = {};
		
		// Initialisation du Booléen
		boolean controle5;
		
		// Méthode qui renvoie true s'il y a des valeurs, et 6 en valeur en début ou à la fin : 
		if (array5.length != 0 && array5[0] == 6) {
			controle5 = true;
			System.out.println(controle5);
		} else {
			controle5 = false;
			System.out.println(controle5); 
		} // Retourne false
		
	}


}
