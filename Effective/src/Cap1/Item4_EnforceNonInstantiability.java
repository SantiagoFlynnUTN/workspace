package Cap1;

/*
 * Para asegurar la no instanciabilidad de una clase que tenga unicamente metodos y atributos
 * constantes (final) se debe declarar el constructor de la clase como privado.
 * 
 * Notas: 
 * - No, una clase abstracta no sirve pues se puede heredar y asì instanciar
 * 		-> una clase es abstract o final pero no ambas.
 * - Tampoco sirve no declarar el constructor, en momento de compilación se le da uno por defecto.
 * - Una clase con constructor privado no se puede heredar
		 * 	-> this idiom also prevents the class from being subclassed. All
		constructors must invoke a superclass constructor, explicitly or implicitly, and a
		subclass would have no accessible superclass constructor to invoke.
 */

//EJ:
public class Item4_EnforceNonInstantiability {
	private Item4_EnforceNonInstantiability(){
		throw new AssertionError();//sirve para avisar que es privado a proposito (creo)
	};
}
