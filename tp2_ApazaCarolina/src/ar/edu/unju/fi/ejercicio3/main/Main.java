package ar.edu.unju.fi.ejercicio3.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio3.model.Producto;
import ar.edu.unju.fi.ejercicio3.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio3.model.Producto.OrigenFabricacion;

public class Main {

	public static void main(String[] args) {
		Producto producto = new Producto();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese código de producto: ");
		producto.setCodigo(sc.nextInt());
		sc.nextLine();
		System.out.println("Ingrese descripción:");
		producto.setDescripcion(sc.nextLine());
		System.out.println("Ingrese precio unitario: ");
		producto.setPrecioUnitario(sc.nextFloat());
		System.out.println("------ CATEGORIA -----");
		System.out.println("1 - TELEFONIA");
		System.out.println("2 - INFORMATICA");
		System.out.println("3 - ELECTROHOGAR");
		System.out.println("4 - HERRAMIENTAS");
		System.out.println("-----------------------");
		System.out.println("Seleccione nro de categoría: ");
		int categ = sc.nextInt();
		switch(categ) {
			case 1:producto.setCategoria(Categoria.TELEFONIA);break;
			case 2: producto.setCategoria(Categoria.INFORMATICA);break;
			case 3: producto.setCategoria(Categoria.ELECTROHOGAR);break;
			case 4: producto.setCategoria(Categoria.HERRAMIENTAS);break;
			default: System.out.println("No existe opción seleccionada!");
		}
		System.out.println("--- ORIGEN FABRICACION -----");
		System.out.println("1 - ARGENTINA");
		System.out.println("2 - CHINA");
		System.out.println("3 - BRASIL");
		System.out.println("4 - URUGUAY");
		System.out.println("----------------------------");
		System.out.println("Seleccione País de fabricación: ");
		int pais = sc.nextInt();
		switch(pais) {
			case 1:producto.setOrigenFabricacion(OrigenFabricacion.ARGENTINA);break;
			case 2:producto.setOrigenFabricacion(OrigenFabricacion.CHINA);break;
			case 3:producto.setOrigenFabricacion(OrigenFabricacion.BRASIL);break;
			case 4:producto.setOrigenFabricacion(OrigenFabricacion.URUGUAY);break;
			default: System.out.println("No existe opción seleccionada!");
		}
		System.out.println(producto);
		
	}

}
