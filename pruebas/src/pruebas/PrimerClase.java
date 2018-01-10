package pruebas;

public class PrimerClase {
	public static void main(String args[]){
		int a =2;
		byte b = 1;
		short c =5;
		long d = 50l;
		float e = 3.1423f;
		double f = 4.542;
		char ch = 'a';
		boolean x = true;
		
		final int constante = 10;
		
		double raiz = Math.sqrt(4.5);
		
		int raiz2 = (int) Math.sqrt(4.5); //casting
		
		String tuvieja = "hola vieja";
		
		String vieja = tuvieja.replace('a', 'r');
		
		String segunda = tuvieja.substring(1);
		
		System.out.println("hola mundo " + raiz + " " + vieja + " "+ segunda);
	}
}
