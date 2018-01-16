package Cap1;


class Contacto {

	private String nombre;
	private String apellido;
	private int cel;
	private int dni;
	private String mail;

	// creo la clase interna Builder.
	public static class Builder {

		// declaro todas las variables e INICIALIZO las opcionales.
		private String nombre;
		private int cel;

		private String apellido = null;
		private int dni = 0;
		private String mail = null;

		// creo el constructor con los args OBLIGATORIOS:
		public Builder(String nombre, int cel) {
			this.nombre = nombre;
			this.cel = cel;
		}

		// creo los patrones (???) de los OPCIONALES:
		public Builder apellido(String apellido) {
			this.apellido = apellido;
			return this;
		}

		public Builder mail(String mail) {
			this.mail = mail;
			return this;
		}

		public Builder dni(int dni) {
			this.dni = dni;
			return this;
		}

		// el metodo build es que va al final de la cadena
		public Contacto build() {
			return new Contacto(this);
		}
	}

	// constructor privado para que no quede opcion que usar el Builder.
	private Contacto(Builder builder) {

		nombre = builder.nombre;
		apellido = builder.apellido;
		cel = builder.cel;
		dni = builder.dni;
		mail = builder.mail;
	}

	public String toString() {
		String ret = "Nombre: " + nombre;
		if (apellido != null)
			ret += " Apellido: " + apellido;
		ret += " Cel: " + cel;
		if (mail != null)
			ret += " Mail: " + mail;
		if (dni != 0)
			ret += " Dni: " + dni;
		ret += ".";
		return ret;
	}
}

public class Item2_UsingBuilders {
	
	public static void main(String[] args){
		
		Contacto nuevoContacto = new Contacto.Builder("Juan", 123).dni(34545).apellido("vieja").build();
		System.out.println(nuevoContacto);
	}
}
