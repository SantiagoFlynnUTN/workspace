package Cap2;

public class Item9_EqualsAndHashCode {

}

/*
 * Always override hashCode() when override Equals
 * 
 * Steps to generate hashCode:
 * 
 * 	1. Store some constant nonzero value, say, 17, in an int variable called result.
 * 
 * 
	2. For each significant field f in your object (each field taken into account by the
	equals method, that is), do the following:
	
		a. Compute an int hash code c for the field:
		
			i. If the field is a boolean, compute (f ? 1 : 0).
			
			ii. If the field is a byte, char, short, or int, compute (int) f.
			
			iii. If the field is a long, compute (int) (f ^ (f >>> 32)).
			
			iv. If the field is a float, compute Float.floatToIntBits(f).
			
			v. If the field is a double, compute Double.doubleToLongBits(f), and
			then hash the resulting long as in step 2.a.iii.
			
			vi. If the field is an object reference and this class’s equals method
			compares the field by recursively invoking equals, recursively
			invoke hashCode on the field. If a more complex comparison is
			required, compute a “canonical representation” for this field and
			invoke hashCode on the canonical representation. If the value of the
			field is null, return 0 (or some other constant, but 0 is traditional).
			48 CHAPTER 3 METHODS COMMON TO ALL OBJECTS
			
			vii. If the field is an array, treat it as if each element were a separate field.
			That is, compute a hash code for each significant element by applying
			these rules recursively, and combine these values per step 2.b. If every
			element in an array field is significant, you can use one of the
			Arrays.hashCode methods added in release 1.5.
		
		b. Combine the hash code c computed in step 2.a into result as follows:
		 result = 31 * result + c;
	 
	 
	3. Return result.
	
	
	4. When you are finished writing the hashCode method, ask yourself whether
	equal instances have equal hash codes. Write unit tests to verify your intuition!
	If equal instances have unequal hash codes, figure out why and fix the problem.
 * 
 */

class Clase2 {
	
	private double atri1, atri2, atri3;
	
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clase2 other = (Clase2) obj;
		if (Double.doubleToLongBits(atri1) != Double.doubleToLongBits(other.atri1))
			return false;
		if (Double.doubleToLongBits(atri2) != Double.doubleToLongBits(other.atri2))
			return false;
		if (Double.doubleToLongBits(atri3) != Double.doubleToLongBits(other.atri3))
			return false;
		return true;
	}

	public Clase2(double atri1){
		this.atri1 = atri1;
		atri2 = 3;
		atri3 = 42;
	}
	
	public Clase2(int atri1){
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