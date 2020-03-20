package main.java.Presentacion;

import main.java.Dominio.Estudiante;
import main.java.Dominio.Persona;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1= new Persona("Mario","Marugán",27);
		System.out.println(p1.toString());

		Persona p2=new Estudiante("María","Villalta",21,2800);
		System.out.println(p2.toString());
		System.out.println(((Estudiante)p2).getBeca());
	}

}
