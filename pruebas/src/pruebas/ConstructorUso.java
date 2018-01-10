package pruebas;

public class ConstructorUso { //clase principal, es la que lleva el nombre del archivo.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseHijo obj = new ClaseHijo(5);  //new llama al constructor de la clase.
		
		System.out.println(obj.getter());
	}
}

class otroConstructor{
	otroConstructor(){
		
	}
}