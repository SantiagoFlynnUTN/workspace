package Cap1;

//import java.lang.Math;
import java.lang.*;

class Complex {
	
	private double im, re;

	public String toString(){
		return re + "i "+ im + "j";
	}
	
	//Resuelve que no podemos tener dos constructores con el mismo tipo de dato y parametros.
    public static Complex fromCartesian(double real, double imag) {
        return new Complex(real, imag);
    }

    public static Complex fromPolar(double modulus, double angle) {
        return new Complex(modulus * Math.cos(angle), modulus * Math.sin(angle));
    }

    private Complex(double im, double re) {
        this.re = re;
        this.im = im;
    }
}


public class Item1_FactoryMethods {

	//El factory se encarga del new. Las clases que usan factory methods devuelven una instancia del objeto.
	
	public static void main(String[] args){
	
	Complex c = Complex.fromPolar(1, Math.PI/4);
	System.out.println(c);
	}
}
