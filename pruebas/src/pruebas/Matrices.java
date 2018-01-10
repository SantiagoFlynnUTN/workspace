package pruebas;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String paises[] = {"esp", "arg", "eeuu", "vieja", "tuvieja"};
		
		int matriz[][] = new int[4][5];
		
		int matriz2[][] = {{1, 2, 3, 4, 5, 6}, {3, 3, 4, 5, 2, 3}};
		
		int i = 0;
		for(int num[]:matriz2){
			for(int num2:num){
				i++;
				System.out.println(i + " " + num2);
			}
		}
		

	}

}
