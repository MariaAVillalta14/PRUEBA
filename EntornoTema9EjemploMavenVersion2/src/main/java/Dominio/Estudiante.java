package main.java.Dominio;

public class Estudiante extends Persona {

	private double beca;

	public Estudiante(String nombre, String apellido, int edad, double beca) {
		super(nombre, apellido, edad);
		this.beca = beca;
	}
	
	

	public double getBeca() {
		return beca;
	}



	public void setBeca(double beca) {
		this.beca = beca;
	}



	@Override
	public String toString() {
		return  "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", beca=" + beca +"]";			
	}

	
	
	
}
