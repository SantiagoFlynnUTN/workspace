package ProgGenerica;

//Un objeto de la clase generica va a tener como atributo un objeto del tipo <T>
public class ClaseGenerica<T> {

	private T atributo;
	
	public ClaseGenerica(){
		atributo = null;
	}
	
	public T getter(){
		return atributo;
	}
	
	public void setter(T atributo){
		this.atributo = atributo;
	}
	
	public static void imprimirAtributoDeLaGenerica(ClaseGenerica<? extends Clase> unClase){
		System.out.println(unClase.getter());
	}
}



//lo unico rescatable es esto
class ClaseNoGenerica{
	
	//metodo generico
	public static <T extends Comparable> T getMenor(T arr[]){ //si, extends para una interfaz, y no se sabe por qué
		
		T minimo;
		
		if(arr == null || arr.length == 0)
			return null;
		
		minimo = arr[0];
		
		for(int i=1; i<arr.length; i++){
			if(minimo.compareTo(arr[i]) > 0)
				minimo = arr[i];
		}
		
		return minimo; //es de tipo T.
	}
}