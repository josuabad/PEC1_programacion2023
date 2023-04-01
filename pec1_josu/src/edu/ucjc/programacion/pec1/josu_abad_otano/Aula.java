package edu.ucjc.programacion.pec1.josu_abad_otano;

public class Aula {

	private int numero;
	private int planta;
	private Profesor profesor;
	private Alumno[] asientos = new Alumno[3]; // Los asientos son arrays de 3 alumnos
	
	public Aula(int numero, int planta, Profesor profesor) {
		super();
		this.numero = numero;
		this.planta = planta;
		this.profesor = profesor;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Alumno[] getAsientos() {
		return asientos;
	}

	public void setAsientos(Alumno[] asientos) {
		this.asientos = asientos;
	}

}
