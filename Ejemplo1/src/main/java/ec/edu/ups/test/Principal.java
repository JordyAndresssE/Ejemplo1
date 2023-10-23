package ec.edu.ups.test;

import ec.edu.ups.ejemplo.Clase1.Persona;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner ingresoDatos = new Scanner(System.in);
				
		Persona juanitoPerez = new Persona();
		
		//System.out.println("Ingrese el nombre: ");
       // String nombre = ingresoDatos.nextLine();
       //juanitoPerez.setNombre(nombre);
        
       //System.out.println("Ingrese el apellido: ");
       // String apellido = ingresoDatos.nextLine();
        //juanitoPerez.setApellido(apellido);
        
        //System.out.println("Ingrese el número de cédula: ");
       // String numeroCedula = ingresoDatos.nextLine();
       // juanitoPerez.setNumeroCedula(numeroCedula);
		
		//System.out.println("Su nombre es "  + juanitoPerez.getNombre() +" "+ juanitoPerez.getApellido() + " y su numero de cedula es ---> "+ juanitoPerez.getNumeroCedula());
		
		Persona personaDos = new Persona ("0107475914","Mario","Cabrera");
		System.out.println(personaDos.getNumeroCedula());
		personaDos.setNumeroCedula("0399039033");
		System.out.println(personaDos.getNumeroCedula());
		
		System.out.println(personaDos);
		
		//Manejo de la clase Scanner
		Scanner entrada = new Scanner(System.in);
		//pedimos datos
		System.out.println("Ingrese su nombre : ");
		//Leemos un texto por teclado
		String nombre = entrada.next();
		//pedimos datos
		System.out.println("Ingrese su cedula : ");
		//Leemos un texto por teclado
		String numeroCedula = entrada.next();
		//Mostramos el texto ledio concatenado con la palabra "Hola"
		System.out.println("Hola,"+ nombre);
		System.out.println("Tu cedula es : "+ numeroCedula);
		// Instanciamos un nuevo objeto demonidado personita
		Persona personita = new Persona();
		//Asignamos el valor leido por teclado y asignado a la variable nombre
		//en el atributo nombre del objeto personita
		personita.setNombre(nombre);
		personita.setNumeroCedula(numeroCedula);
		//Mostramos los datos del objeto personita a travez del metodo toString()
		System.out.println(personita.toString());
		
	}

}