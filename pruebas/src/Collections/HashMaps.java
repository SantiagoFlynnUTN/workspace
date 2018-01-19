package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Persona{
	private String nombre;
	
	public Persona(String nombre){
		this.nombre = nombre;
	}
	
	public String toString(){
		return nombre;
	}
}

class Dni{
	int dni;
	
	public Dni(int dni){
		this.dni = dni;
	}
	
	public String toString(){
		return Integer.toString(dni);
	}
}

public class HashMaps {

	
	/*
	 * Un hashmap sirve para asociar una unica key (unica) a un valor (se puede repetir). 
	 * Tanto la key como el value pueden ser tipos primitivos como objetos.
	 * 
	 * Como resultado tenemos una lista de objetos que se accede mediante la key
	 * 
	 * Ej: tenemos una lista con los dni de cada persona. A cada dni le corresponde una persona
	 *  con sus respectivos datos.
	 *  
	 *  Puedo usar dni como key ya que es unico por persona.
	 */
	
	public static void main(String[] args){
		HashMap<Dni, Persona> miMapa = new HashMap<>();
		
		miMapa.put(new Dni(38820585), new Persona("Santiago"));
		miMapa.put(new Dni(34534654), new Persona("Juan"));
		miMapa.put(new Dni(49392742), new Persona("Lucia"));
		
		Dni unDni = new Dni(1);
		miMapa.put(unDni, new Persona("Mirtha Legrand"));
		
		//si meto otro con el mismo key lo sobreescribe
		miMapa.put(unDni, new Persona("tujavie"));
		
		System.out.println(miMapa.entrySet()); //devuelve una lista set<> de tipo Entry<K, V>
		
		//este metodo entrySet() nos sirve para acceder al mapa con metodos de listas como for each e iteradores.
		
		Set<Map.Entry<Dni, Persona>> miSet = miMapa.entrySet();
		
		//puedo iterar la lista si quiero, por ejemplo para saber los dni que existen
		
		for(Map.Entry<Dni, Persona> s:miSet){
			System.out.println(s.getKey());
		}
		
		//o los valores (personas) que existen
		
		for(Map.Entry<Dni, Persona> s:miSet){
			System.out.println(s.getValue());
		}
	}
}
