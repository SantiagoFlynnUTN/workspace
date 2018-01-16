package pruebas;

import javax.swing.*;

public class Excepciones1 {

	// El programa comprueba si un mail es correcto o no
	public static void main(String[] args) {

		String mail = JOptionPane.showInputDialog("Introduce el mail");

		try {
			examinaMail(mail);
		} catch (Mail_corto_error e) {

			System.out.println("La direccion de mail no es correcta");
			System.out.println("Surgio un error del tipo: "
					+ e.getClass().getName());
			// con este comando se informa el nombre del error
			System.out.println(e.getMessage());
			// con este comando se muestra el mensaje del error
		}

	}

	static void examinaMail(String mail) throws Mail_corto_error {
		// se declara en el throws que puede (y va) a ocurrir un error del tipo
		// "Mail_corto_error"
		int arroba = 0;
		boolean punto = false;

		if (mail.length() <= 3) {

			throw new Mail_corto_error("El mail introducido es demasiado corto");
			// en este punto se lanza un error de tipo "Mail_corto_error" con un
			// msj personalizado

		} else {

			for (int i = 0; i < mail.length(); i++) {

				if (mail.charAt(i) == '@') {

					arroba++;
				}
				if (mail.charAt(i) == '.') {

					punto = true;
				}
			}

			if (arroba == 1 && punto == true) {

				System.out.println("Es correcto");
			} else {

				System.out.println("No es correcto");
			}
		}
	}
}

class Mail_corto_error extends Exception {
	// como hereda de Exception estamos obligados a usar try catch
	public Mail_corto_error() {
	}

	public Mail_corto_error(String mensajeError) {

		super(mensajeError);
	}
}