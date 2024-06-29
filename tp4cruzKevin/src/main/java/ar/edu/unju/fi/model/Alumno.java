package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Alumno {
	private String dni;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private LocalDate fechaNac;
	private String domicilio;
	private String LibUni;
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	public Alumno(String dni, String nombre, String apellido, String email, String telefono, LocalDate fechaNac,
			String domicilio, String libUni) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.fechaNac = fechaNac;
		this.domicilio = domicilio;
		this.LibUni = libUni;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getLibUni() {
		return LibUni;
	}
	public void setLibUni(String libUni) {
		LibUni = libUni;
	}
	
	
}
