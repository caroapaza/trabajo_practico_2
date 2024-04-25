package ar.edu.unju.fi.ejercicio3.model;

public class Producto {
	private int codigo;
	private String descripcion;
	private float precioUnitario;
	private Categoria categoria;
	private OrigenFabricacion origenFabricacion;
	
	
	public enum Categoria{
		TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS
	}
	
	public enum OrigenFabricacion{
		ARGENTINA, CHINA, BRASIL, URUGUAY
	}
	
	public Producto() {
		
	}

	/**
	 * @param codigo
	 * @param descripcion
	 * @param precioUnitario
	 * @param categoria
	 * @param origenFabricacion
	 */
	public Producto(int codigo, String descripcion, float precioUnitario, Categoria categoria,
			OrigenFabricacion origenFabricacion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.categoria = categoria;
		this.origenFabricacion = origenFabricacion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public OrigenFabricacion getOrigenFabricacion() {
		return origenFabricacion;
	}

	public void setOrigenFabricacion(OrigenFabricacion origenFabricacion) {
		this.origenFabricacion = origenFabricacion;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario
				+ ", categoria=" + categoria + ", origenFabricacion=" + origenFabricacion + "]";
	}
	
	

}
