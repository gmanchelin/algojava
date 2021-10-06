package fr.algorithmie;

public class FirstLast {
	
	public static void main(String[] args) {
	
		// Tableau d'entiers avec des valeurs (6 au début et à la fin) :
		int[] array1 = {6, 9, 5, -4, 6};
		
		// Initialisation du Booléen
		boolean controle1;
		
		// Méthode qui renvoie true s'il y a au moins une valeur, et si le premier
		// et le dernier élément du tableau ont la même valeur :  
		if (array1.length >= 1 && array1[0] == array1[array1.length-1]) {
			controle1 = true;
			System.out.println(controle1);
		} else {
			controle1 = false;
			System.out.println(controle1); 
		} // Retourne true
		
		
		// --------------------------------------------------------------------------------------
		
		// Tableau d'entiers avec des valeurs (celles de début et de fin différentes) :
		int[] array2 = {6, 9, 5, -4};
		
		// Initialisation du Booléen
		boolean controle2;
		
		// Méthode qui renvoie true s'il y a au moins une valeur, et si le premier
		// et le dernier élément du tableau ont la même valeur :  
		if (array2.length >= 1 && array2[0] == array2[array2.length-1]) {
			controle2 = true;
			System.out.println(controle2);
		} else {
			controle2 = false;
			System.out.println(controle2); 
		} // Retourne false
		
	
	}
}
