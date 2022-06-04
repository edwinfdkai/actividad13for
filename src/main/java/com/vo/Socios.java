package com.vo;

public class Socios {
	
	protected int documento;
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected String ocupacion;
	protected String fechaNac;
	

	

	


	public Socios(int documento, String nombre, String apellido, int edad, String ocupacion, String fechaNac) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.ocupacion = ocupacion;
		this.fechaNac = fechaNac;
	}

	public Socios() {
		super();
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	
	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	
	@Override
	public String toString() {
		return "Socios [documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", ocupacion=" + ocupacion + ", fechaNac=" + fechaNac + "]";
	}

	
	
}
