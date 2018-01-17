package pruebas;

import java.io.*;

public class StreamBytes {

	public static void main(String[] args) {

		int contador = 0;
		int datosInput[] = new int[22610];

		try {

			FileInputStream lector = new FileInputStream(
					"/home/nicocrive/Desktop/prueba_stream/maestruli.jpeg");

			boolean finalArchivo = false;

			while (!finalArchivo) {

				int byteInput = lector.read();

				if (byteInput != -1)

					datosInput[contador] = byteInput;

				else
					finalArchivo = true;

				System.out.println(datosInput[contador]);

				contador++;

			}

			lector.close();

		} catch (IOException e) {

			System.out.println("No se ha encontrado el archivo");
		}

		System.out.println("Cantidad de bytes: " + contador);
		
		CrearArchivo(datosInput);

	}

	static void CrearArchivo(int dataNewArchive[]) {

		try {

			FileOutputStream nuevoArchivo = new FileOutputStream(
					"/home/nicocrive/Desktop/prueba_stream/maestruli-copia.jpeg");

			for(int i=0; i<dataNewArchive.length; i++){
				
				nuevoArchivo.write(dataNewArchive[i]);
			}
			
			nuevoArchivo.close();
			
		} catch (IOException e) {
			
			System.out.println("Error al copiar el archivo");
		}
	}
}