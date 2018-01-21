package Cap2;

public class Item10_AlwaysOverrideToString {

}

class Clase3 {
	private double atri1, atri2, atri3;
	
	//formato generico
	@Override
	public String toString() {
		return "Clase3 [atri1=" + atri1 + ", atri2=" + atri2 + ", atri3=" + atri3 + "]";
	}

	public Clase3(double atri1){
		this.atri1 = atri1;
		atri2 = 3;
		atri3 = 42;
	}
	
	public Clase3(int atri1){
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