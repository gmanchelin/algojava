package fr.algorithmie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparaisonTableau {
	
	public static void main(String[] args) {

		// Tableaux d'entiers avec des valeurs :
		
		// Dans un premier temps, je mets dans des ArrayList les valeurs des array :
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		List<Integer> listArray1 = new ArrayList<Integer>(array1.length);
		for (int i : array1) {
			listArray1.add(i);
		}
		
		
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		List<Integer> listArray2 = new ArrayList<Integer>(array2.length);
		for (int i : array2) {
			listArray2.add(i);
		}
		
		
		// Puis avec la méthode retainAll, je modifie la listArray1 pour ne garder
		// que ses éléments en commun avec la listArray2
		listArray1.retainAll(listArray2);
		
		// .size() est l'équivalent en ArrayList de .length pour les array[]
		System.out.println(listArray1.size());
	
	}
	
}
