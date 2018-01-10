package pruebas;

public class CastingDeObjetos {
	public static void main(String[] args){
		//hagamos de cuenta que creo un array de una clase cualquiera.
		Clase clases[] = {new Clase(2), new Clase(3), new Herencia(2)};
		
		//entonces podemos usarlas todas como si fueran clases, siendo q una es herencia
		for(Clase c:clases){
			c.getter();
		}
		
		//ahora imaginemos que queremos hacer algo con un metodo propio de herencia.
		
		//clases[2].metodoHerencia();
		
		//nos tira que esta mal, porque metodoHerencia no es un metodo de Clase.
		
		//solucionamos casteando.
		
		Herencia unObjeto = (Herencia) clases[2];
		
		//Y ahora si
		
		unObjeto.metodoHerencia();
		
	}
}
