package Collections;
import java.util.*;

import pruebas.Clase;

public class ArrayLists {

	public static void main(String[] args) {
		
		//En memoria se reserva como para que entren 10 elementos. 
		ArrayList<Clase> arr = new ArrayList<Clase>();
		
		/*
		 * El problema de los arrays es que si no sé qué cantidad de elementos
		 * voy a tener 
		 */
		
		//puedo prealocar memoria para mejorar la performance.
		arr.ensureCapacity(15);
		
		arr.add(new Clase(1.0));
		arr.add(new Clase(2.0));
		arr.add(new Clase(3.4));
		arr.add(new Clase(7.3));
		arr.add(new Clase(3.2));
		
		
		
		
		/* imaginemos que queremos añadir uno mas pero en el indice 2.
		 * seria algo equivalente a arr[1] = new Clase(2.5)
		 * Sobreescribe al que estaba en el segundo lugar 
		 */
		arr.set(1, new Clase(2.5));
		
		//imaginamos que ya sabemos que no vamos a agregar más elementos. Esto libera la memoria reservada sobrante.
		arr.trimToSize();
		
		//Si por alguna razon necesitamos pasar a un array estatico podemos hacer..
		
		Clase arrayEstatico[] = new Clase[arr.size()];
		//copio la lista en el array
		arr.toArray(arrayEstatico);
		//listo, uso arrayEstatico como siempre...
		
		
		//iterator
		Iterator <Clase> mi_iterador = arr.iterator();
		
		while(mi_iterador.hasNext()){ //hasNext() apunta al primero
			System.out.println(mi_iterador.next().getter()); //next()
			mi_iterador.remove(); //remove() elimina el elemento del array
		}
		
		
		
		/*
		for(Clase c:arr){			
			System.out.println(c.getter());
		}*/

	}

}
