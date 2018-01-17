package pruebas;

import java.io.*;

public class KeyboardInputString {
	
	public static void main( String[ ] args ) {

		BufferedReader teclado = new BufferedReader(new InputStreamReader( System.in ));
		
		try{

			System.out.print( "Ingresa una frase y presiona 'enter' para continuar: " );
			String string = teclado.readLine( );
			
			System.out.println( "La frase que ingresaste es: " + string);
			
			teclado.close( );
		
		}catch( IOException e ){

			e.printStackTrace( );
			}
	}
}
