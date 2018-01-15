import javax.swing.*;
import java.util.LinkedList;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Contacto.saludo();
		String agregar= "SI";
		LinkedList<Contacto> myList = new LinkedList<Contacto>();
		Contacto c;
		Contacto listaContactos[] = new Contacto[2];
		
		
		
		listaContactos[0] = new Familiar("Andres", "Calamaro", 15789087, "padre");
		listaContactos[1] = new Familiar("Andres", "Calamaro", 15789087, "padre");
		listaContactos[1].setter(9);
		
		//listaContactos[1] = new Trabajo("Sofia", 15789056, "Jefe");
		/*listaContactos[2] = new Familiar("Santiago", "Maldonado", 15122187, "nieto");
		listaContactos[3] = new Otro("Nicolas", 15783337, "pasea perros");
		listaContactos[4] = new Trabajo("Andrea", "Rincon", 15743287, "limpieza");
		*/
		//for(Contacto c:listaContactos){
		String a = new String(), b= new String();
		a= "hola";
		b= "hola";
		b = "holo";
		System.out.println("holo" == b);
			
		while(agregar.equals("SI")){
			
			String nombre = JOptionPane.showInputDialog("Nombre: ");
			String apellido = JOptionPane.showInputDialog("Apellido: ");
			int numeroInt;
			while (true) {
				try {
					String numeroStr = JOptionPane.showInputDialog("Numero: ");
					numeroInt = Integer.parseInt(numeroStr);
					break;
				} catch (NumberFormatException e) {

					System.out.println("Ingresaste mal el numero, volve a ingresar por favor");
					
				}
			}
			
			String relacion = JOptionPane.showInputDialog("Relacion (Familiar; Trabajo; Otro): ");
			String rel = relacion.toUpperCase();
			
			if(rel.equals("FAMILIAR")){
				
				String parentezco = JOptionPane.showInputDialog("Parentezco: ");
				c = new Familiar(nombre, apellido, numeroInt, parentezco);
				myList.add(c);
			}
			else if(rel.equals("TRABAJO")){
				
				String puesto = JOptionPane.showInputDialog("Puesto: ");
				c = new Trabajo(nombre, apellido, numeroInt, puesto);
				myList.add(c);
			}
			else{
			
				c = new Otro(nombre, apellido, numeroInt, rel);
				myList.add(c);
			}
			
			System.out.println(myList.getLast().dameInfo());
			
			
			
			String agregar1 = JOptionPane.showInputDialog("Desea agregar otro contacto (si o no): ");
			agregar = agregar1.toUpperCase();
		//}
		}
	}

}