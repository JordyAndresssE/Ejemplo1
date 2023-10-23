package ec.edu.ups.est.ejemplo.uno.test;

import ec.edu.ups.est.ejemplo.uno.clases.Persona;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		/*Scanner t = new Scanner(System.in);
		String nombre;
		String numeroCedula;
		String apellido;*/
		

		/*Persona personaUno=new Persona();
		System.out.println("Escriba el nombre:");	
		personaUno.setNombre(nombre= t.nextLine());
		System.out.println("Escriba el apellido:");
		personaUno.setApellido(apellido= t.nextLine());
		System.out.println("Esccriba el n'umero de cedula:");
		personaUno.setNumeroCedula(numeroCedula= t.nextLine());*/
		
		Persona personaDos= new Persona("010101","Carlos", "Lopez");
		//System.out.println(personaDos.getNumeroCedula());
		personaDos.setNumeroCedula("020202");
		//System.out.println(personaDos.getNumeroCedula());
		
		System.out.println(personaDos);

		
		//System.out.println(personaUno.getNombre()+" "+personaUno.getApellido()+" "+ personaUno.getNumeroCedula());
	
	}
	
}