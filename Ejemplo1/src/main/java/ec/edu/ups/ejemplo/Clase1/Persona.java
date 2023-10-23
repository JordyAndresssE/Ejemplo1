package ec.edu.ups.ejemplo.Clase1;

import java.util.Date;

public class Persona { 
	
	private String numeroCedula;
	private String nombre;
	private String apellido;
	private Date fechaNac;
	private double estatura;
	private double peso;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Persona(String numeroCedula, String nombre, String apellido) {
		this.numeroCedula = numeroCedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Persona(String numeroCedula, String nombre, String apellido, Date fechaNac, double estatura, double peso) {
		this.numeroCedula = numeroCedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.estatura = estatura;
		this.peso = peso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public String getNombre() {
		return nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getApellido() {
		return apellido;
	}
		
	public void setNumeroCedula(String numeroCedula) {
			this.numeroCedula = numeroCedula;
		}
		
	public String getNumeroCedula() {
			return numeroCedula;
	}
	
	public int calcularEdad(Date fechaActual) {
		return 0;
	}
	public double calcularIMC() {
		return 2.5;
	}
	public boolean esMayorDeEdad(int limiteEdad) {
		return true;
	}
	
	public String toString() {
		return "CEDULA : " + numeroCedula + " ---> " + "NOMBRE : " + nombre ;
	}
}
