package ProgGenerica;

public class Clase implements Comparable {
	private double atri1;
	
	public int compareTo(Object obj){
		Clase objCasteado = (Clase) obj;
		if(atri1<objCasteado.getter())
			return -1;
		if(atri1>objCasteado.getter())
			return 1;
		else return 0;
	}
	
	public String toString(){
		String a = atri1 + "";
		return a;
	}
	
	public Clase(double atri1){
		this.atri1 = atri1;
	}
	
	public void setter(int atri1){
		this.atri1 = atri1; //this se usa cuando el argumento tiene el mismo nombre que el atributo
	}
	public double getter(){
		return atri1;
	}
}