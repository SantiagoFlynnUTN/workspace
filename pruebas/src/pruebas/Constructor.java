package pruebas;

public class Constructor {
	private int atri1, atri2, atri3;
	
	public Constructor(int atri1){
		this.atri1 = atri1;
		atri2 = 3;
		atri3 = 43;
	}
	
	public void setter(int atri1){
		this.atri1 = atri1; //this se usa cuando el argumento tiene el mismo nombre que el atributo
	}
	public int getter(){
		return atri1;
	}
}