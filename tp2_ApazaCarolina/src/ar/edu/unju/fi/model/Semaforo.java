package ar.edu.unju.fi.model;

public class Semaforo {
	private ColorSemaforo color;
	private boolean parpadeando;
	
	public enum ColorSemaforo{
		ROJO, AMARILLO, VERDE
	}
	
	
	
	public Semaforo() {
		this.color = ColorSemaforo.ROJO;
		this.parpadeando =false;
	}



	/**
	 * @param color
	 * @param parpadeando
	 */
	public Semaforo(ColorSemaforo color, boolean parpadeando) {
		super();
		this.color = color;
		this.parpadeando = parpadeando;
	}



	public ColorSemaforo getColor() {
		return color;
	}



	public void setColor(ColorSemaforo color) {
		this.color = color;
	}



	public boolean isParpadeando() {
		return parpadeando;
	}



	public void setParpadeando(boolean parpadeando) {
		this.parpadeando = parpadeando;
	}



	@Override
	public String toString() {
		return "Semaforo [color=" + color + ", parpadeando=" + parpadeando + "]";
	}
	
	
	

}
