package ProgGenerica;

public class UsoGenericas {
	public static void main(String[] args){
		
		/*
		 * El uso de clases genericas est� pensado para ejecutar algoritmos 
		 * sin depender del tipo del objeto.
		 	E: elemento de una colecci�n.
			K: clave.
			N: n�mero.
			T: tipo.
			V: valor.
			S, U, V etc: para segundos, terceros y cuartos tipos.
		 * 
		 * 
		 * Antes se podia manejar las clases y subclases por igual (ver herencia.java)
		 * 
		 * Ahora no se puede hacer pues generica<Herencia> no hereda de generica<Clase>
		 * 
		 * Un ejemplo ser�a implementar un metodo generico para Clase. (ver ClaseGenerica.java)
		 *	
		 * */
		
		
		
		Clase unObj = new Clase(12345);
		ClaseGenerica<Clase> otroObj = new ClaseGenerica<Clase>();
		
		otroObj.setter(unObj);
		System.out.println(otroObj.getter().getter());
		
	}
}
