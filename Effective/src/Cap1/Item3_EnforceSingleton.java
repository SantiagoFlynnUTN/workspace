package Cap1;

public class Item3_EnforceSingleton {

	public static void main(String[] args){
		//opcion 1 -> enum (mas recomendable)
		Single x = Single.INSTANCE;
		x.setAtr("prueba");
		
		
		Single y = Single.INSTANCE;
		y.setAtr("prueba2");
		
		//da el valor de b por singleton.
		System.out.println(x.getAtr());
		
		
		
		//opcion 2 -> con factory method
		
		Single2 a = Single2.getInstance();
		a.setAtr("prueba");
		
		
		Single2 b = Single2.getInstance();
		b.setAtr("prueba2");
		
		//da el valor de b por singleton.
		System.out.println(a.getAtr());
	}
	
}

// Singleton with enum (mejor opcion)

enum Single {

	INSTANCE;
	private String atr;

	public String getAtr() {
		return atr;
	}

	public void setAtr(String nombre) {
		this.atr = nombre;
	}
}

// Singleton with static factory (segunda opcion)
class Single2 {

	private String atr;

	public String getAtr() {
		return atr;
	}

	public void setAtr(String nombre) {
		this.atr = nombre;
	}

	private static final Single2 INSTANCE = new Single2();
	
	//constructor es innecesario en este caso, sirve de recordatorio que es PRIVADO
	private Single2() { 
		atr = null;
	}

	public static Single2 getInstance() {
		return INSTANCE;
	}
}