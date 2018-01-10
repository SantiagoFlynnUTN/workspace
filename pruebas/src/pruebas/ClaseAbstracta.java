package pruebas;

public abstract class ClaseAbstracta {
	private double atri1, atri2, atri3;
	
	public ClaseAbstracta(double atri1){
		this.atri1 = atri1;
		atri2 = 3;
		atri3 = 42;
	}
	
	public ClaseAbstracta(int atri1){
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
	
	public abstract String texto();
}


class ClaseHijo extends ClaseAbstracta{
	public ClaseHijo(double atri){
		super(atri);
	}
	
	public String texto(){
		return "prueba";
	}
}

