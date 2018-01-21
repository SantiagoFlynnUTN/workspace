package Cap2;

public class Item8_OverridingEquals {

}

class Clase {
	//Si dos obj son iguales (de acuerdo a equals) tienen que generar el mismo hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(atri1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(atri2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(atri3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //es la misma referencia
			return true;
		if (obj == null) //no es la misma entonces compruebo != null
			return false;
		if (getClass() != obj.getClass()) //debe ser la misma clase.
			return false;
		Clase other = (Clase) obj; //es la misma clase, casteo.
		
		//chequeo los atributos 
		if (Double.doubleToLongBits(atri1) != Double.doubleToLongBits(other.atri1))
			return false;
		if (Double.doubleToLongBits(atri2) != Double.doubleToLongBits(other.atri2))
			return false;
		if (Double.doubleToLongBits(atri3) != Double.doubleToLongBits(other.atri3))
			return false;
		return true;
	}
	
	private double atri1, atri2, atri3;
	
	public Clase(double atri1){
		this.atri1 = atri1;
		atri2 = 3;
		atri3 = 42;
	}
	
	public Clase(int atri1){
		this.atri1 = atri1;
		atri2 = 3;
		atri3 = 43;
	}
	
	public void setter(int atri1){
		this.atri1 = atri1; //this se usa cuando el argumento tiene el mismo nombre que el atributo
	}
	public double getter(){
		return atri3;
	}
}