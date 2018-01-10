package pruebas;

import java.util.Scanner;

public class Enums {

	
	//Talla es un objeto que vale MINI, MEDIANO, o GRANDE.
	enum Talla {MINI,MEDIANO,GRANDE};
	
	//Si queremos hacer más cosas con ese objeto entonces:
	
	enum Talla2{
		//ponemos los posibles valores de objeto que puede ser Talla2
		MINI("S"), MEDIANO("M"), GRANDE("L");
		
		//Si Talla2 es un objeto tipo MINI entonces se creará como MINI("S")
		public String abreviatura;
		
		private Talla2(String abreviatura){
			this.abreviatura=abreviatura;
		}
		
		public String dameAbreviatura(){
			return abreviatura;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner miobjeto = new Scanner(System.in);
		
		System.out.println("Introduce nombre: ");
		
		String entrada = miobjeto.next().toUpperCase();
		
		//la_talla sera un objeto MINI, MEDIANO, o GRANDE.
		Talla2 la_talla = Enum.valueOf(Talla2.class, entrada);
		
		System.out.println(la_talla +" abreviado: " + la_talla.dameAbreviatura());
	}

}
