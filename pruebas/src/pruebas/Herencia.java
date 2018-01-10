package pruebas;

public class Herencia extends Clase{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int num;
	
	public Herencia(int num){
		super(4.2);
		this.num = num;
	}
	
	public double getter(){ //sobreescribo el metodo de la clase padre
		double var = super.getter() + 2;
		return var;
	}

	public String metodoHerencia(){
		return "tu vieja";
	}
	
}
