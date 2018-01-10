package pruebas;

import java.util.*; // para el scanner

public class EntradaConsola {
	public static void main(String[] args){
		
		/*
		 * mi objeto es un objeto hecho con un constructor
		 * 
		 * Metodo estatico: necesita un static, y se debe llamar como Clase.metodo
		 * 	Ej: System.out.println
		 * 
		 * Metodo dinamico: uso el metodo usando el objeto
		 * 	Ej: miObjeto.metodo
		 * 	
		 * */
		
		Scanner miobjeto = new Scanner(System.in);
		
		System.out.println("Introduce nombre: ");
		
		String nombreUser = miobjeto.nextLine();
		
		System.out.println("Introduce edad: ");
		
		int edadUser = miobjeto.nextInt();
		
		System.out.println("Sos " + nombreUser + " y tenes " + edadUser + " años");
		
	}
}
