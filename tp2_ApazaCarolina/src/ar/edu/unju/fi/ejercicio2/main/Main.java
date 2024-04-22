package ar.edu.unju.fi.ejercicio2.main;

import ar.edu.unju.fi.ejercicio2.constantes.Dia;

public class Main {

	public static void main(String[] args) {
		for(Dia dia: Dia.values()) {
			System.out.println("El día de la semana es: "+dia);
		}
		Dia diaDomingo = Dia.DOMINGO;
		System.out.println(diaDomingo.name());
		System.out.println(diaDomingo.ordinal());
		System.out.println(diaDomingo.toString());

	}

}
