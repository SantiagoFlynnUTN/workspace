package pruebas;
import javax.swing.*; // para el formulario

public class ApiConGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = JOptionPane.showInputDialog("Nombre: ");
		
		String edad = JOptionPane.showInputDialog("Edad: ");
		
		int edadEnInt = Integer.parseInt(edad);
		
		System.out.println("Nom: "+ nombre + " edad: " + (edadEnInt+1));
		
		String num = JOptionPane.showInputDialog("Num:");
		
		double numerito = Double.parseDouble(num);
		
		System.out.printf("numerito %1.2f" + "tu vieja", numerito);
	}

}
