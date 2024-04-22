package ar.edu.unju.fi.ejercicio1.main;

import ar.edu.unju.fi.ejercicio1.model.Semaforo;
import ar.edu.unju.fi.ejercicio1.model.Semaforo.ColorSemaforo;

public class Main {

	public static void main(String[] args) {
		// uso enum
		
		Semaforo semaforo1 = new Semaforo();
		System.out.println(semaforo1);
		System.out.println("El color del semaforo es: "+semaforo1.getColor().toString());
		
		Semaforo semaforo2 = new Semaforo(ColorSemaforo.AMARILLO,true);
		
		semaforo1.setColor(ColorSemaforo.VERDE);
		System.out.println(semaforo1);
	

	}

}
