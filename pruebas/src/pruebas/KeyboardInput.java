package pruebas;

import java.io.*;

public class KeyboardInput {
	
	public static void main(String[] args) {
		
		try {
			
			System.out.print("Presiona una tecla: ");
			char key = (char) System.in.read();
			
			System.out.println("Presionaste la tecla: " + key);
			
			System.out.println("La clase es: " + System.in.toString());
		
		} catch (IOException ioe) {}
	}
}