package ProgGenerica;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Math;

public class UsoGenericas {
	public static void main(String[] args){
		
		/*
		 * El uso de clases genericas está pensado para ejecutar algoritmos 
		 * sin depender del tipo del objeto.
		 	E: elemento de una colección.
			K: clave.
			N: número.
			T: tipo.
			V: valor.
			S, U, V etc: para segundos, terceros y cuartos tipos.
		 * 
		 * 
		 * Antes se podia manejar las clases y subclases por igual (ver herencia.java)
		 * 
		 * Ahora no se puede hacer pues generica<Herencia> no hereda de generica<Clase>
		 * 
		 * Un ejemplo sería implementar un metodo generico para Clase. (ver ClaseGenerica.java)
		 *	
		 * */
		
		
		
		Clase unObj = new Clase(12345);
		ClaseGenerica<Clase> otroObj = new ClaseGenerica<Clase>();
		
		otroObj.setter(unObj);
		System.out.println(otroObj.getter().getter());
		
		ArrayList<Clase> unArray = new ArrayList<>();
		
		unArray.add(new Clase(8.9));
		unArray.add(new Clase(2.6));
		unArray.add(new Clase(7.2));
		unArray.add(new Clase(5.4));
		unArray.add(new Clase(Math.PI));
		
		
		Iterator<Clase> mi_iterador = unArray.iterator();
		
		while (mi_iterador.hasNext()) { // hasNext() apunta al primero
			System.out.println(mi_iterador.next().getter()); // next()
			mi_iterador.remove(); // remove() elimina el elemento del array
		}
		
		Clase arrayEstatico[] = new Clase[unArray.size()];
		
		unArray.toArray(arrayEstatico);
		
		//pasar a toArray sirve para manejar el array "como siempre"
		System.out.println(arrayEstatico[3]);
		
		System.out.println(ClaseNoGenerica.getMenor(arrayEstatico));		
	}
}
