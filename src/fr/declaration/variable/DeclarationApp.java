package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
		
		//Entiers :
		byte testbyte = 127;
		short testshort = 32767;
		int testint = 124;
		long testlong = 12L;
		
		//R�els : 
		float testfloat = 19.4F;
		double testdouble = 12.9D;
		
		//Caract�res : 
		char testchar = 'E';
		
		//Bool�en : 
		boolean testboolean = true;
		
		//String : 
		String testString = "Bonjour!";
		
		//Test de print une variable dans la console :
		System.out.println(testbyte);
		String randomString = "Voici le r�sultat d'un calcul : 1+5=6";
		System.out.println(randomString);
		randomString = "Voici le r�sultat d'un calcul :\n1+5=6";
		System.out.println(randomString);
	}

}
