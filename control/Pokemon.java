package control;

import usuarios.PedirDatos;

public class Pokemon {

	private String nombre;
	private int numero;
	private String tipo;
	private String habilidad;
	
	
	public Pokemon(String nombre, int numero, String tipo, String habilidad) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.tipo = tipo;
		this.habilidad = habilidad;
	}




	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getHabilidad() {
		return habilidad;
	}


	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}


	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", numero=" + numero + ", tipo=" + tipo + ", habilidad=" + habilidad + "]";
	}
	
	
	
	
	
}
