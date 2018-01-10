
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Contacto.saludo();
	
		Contacto listaContactos[] = new Contacto[5];
		
		listaContactos[0] = new Familiar("Andres", "Calamaro", 15789087, "padre");
		listaContactos[1] = new Trabajo("Sofia", 15789056, "Jefe");
		listaContactos[2] = new Familiar("Santiago", "Maldonado", 15122187, "nieto");
		listaContactos[3] = new Otro("Nicolas", 15783337, "pasea perros");
		listaContactos[4] = new Trabajo("Andrea", "Rincon", 15743287, "limpieza");
		
		for(Contacto c:listaContactos){
			
			System.out.println(c.dameInfo());
		}
		
	}

}