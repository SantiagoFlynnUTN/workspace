package Hilos;

import java.util.*;

class ClaseThread implements Runnable{ //la clase debe implementar si o si Runnable
	String name;
	int time;
	Random r = new Random();
	
	public ClaseThread(String name){
		this.name = name;
		time = r.nextInt(999);
	}
	
	public void run(){
		try{
			System.out.println(name + " sleeping for " + time);
			Thread.sleep(time);
			System.out.println(name + " termino.");
		}catch(Exception e){} //por si falla algo al crear el hilo.
	}
}

public class TestHilos {

	public static void main(String[] args) {
			Thread t1 = new Thread(new ClaseThread("uno"));
			Thread t2 = new Thread(new ClaseThread("dos"));
			Thread t3 = new Thread(new ClaseThread("tres"));
			Thread t4 = new Thread(new ClaseThread("cuatro"));
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();
		
	}

}
