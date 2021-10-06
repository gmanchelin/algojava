package fr.algorithmie;

public class AffichageSuite {
	
	public static void main(String[] args) {
		
		// Afficher tous les nombres de 1 à 10 (avec for)
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// Afficher les chiffres pairs de 0 à 10 (avec for)
		for (int i = 0; i <= 10; i++) {
	      if (i % 2 == 0) {
	        System.out.println(i);
	      }
		}
		
		// Afficher les chiffres impairs de 0 à 10 (avec for)
		for (int i = 0; i <= 10; i++) {
	      if (i % 2 != 0) {
	        System.out.println(i);
	      }
		}
		
		// Afficher tous les nombres de 1 à 10 (avec while)
		int nombres = 1;
		while(nombres <= 10) {
			System.out.println(nombres);
			nombres++;
		}
		
		// Afficher les chiffres pairs de 0 à 10 (avec while)
		nombres = 0;
		while(nombres % 2 == 0 && nombres <= 10) {
			System.out.println(nombres);
			nombres += 2;
		}
				
		// Afficher les chiffres impairs de 0 à 9 (avec while)
		nombres = 1;
		while(nombres % 2 != 0 && nombres <= 9) {
			System.out.println(nombres);
			nombres += 2;
		}
		
	}

}
