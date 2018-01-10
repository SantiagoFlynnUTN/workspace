package pruebas;

public class ArraysForForEach {
	public static void main(String[] args){
		
		//dos formas de declarar arrays
		int [] array = new int[5];
		int array2[] = new int[5];
		
		array[0] = 1;
		array[1] = 5;
		array[2] = 3;
		array[3] = 56;
		array[4] = 22;
		
		int array3[] = {1,2,6,4,34,6,7,4,4,4,24,4,5};
		int cantElementos = array3.length;
		
		String paises[] = {"arg", "chile", "brasil", "eeuu", "asd"};
		
		//for comun
		for(int i = 0; i<paises.length; i++){
			System.out.println("Pais: "+ paises[i]);
		}
		
		
		//for each
		for(String elem:paises){
			System.out.println("Pais: "+ elem);
		}
	}
}
