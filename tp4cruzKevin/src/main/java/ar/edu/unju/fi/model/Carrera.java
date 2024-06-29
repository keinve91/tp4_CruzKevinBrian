package ar.edu.unju.fi.model;

public class Carrera {
	private String codigo;
	private String nombre;
	private int cantAños;
	private boolean estado;
	
	public Carrera() {
		// TODO Auto-generated constructor stub
	}

	public Carrera(String codigo, String nombre, int cantAños, boolean estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantAños = cantAños;
		this.estado = estado;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantAños() {
		return cantAños;
	}

	public void setCantAños(int cantAños) {
		this.cantAños = cantAños;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}

