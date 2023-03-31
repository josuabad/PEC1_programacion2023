package edu.ucjc.programacion.pec1.josu_abad_otano;

import java.util.Scanner;

public class UtilsColegio {

	public static Alumno[] nuevosAlumnos(int numAlumnos) {
		Scanner scan = new Scanner(System.in);
		Alumno[] alumnos = new Alumno[numAlumnos];
		for (int alumno = 0; alumno < numAlumnos; alumno++) {
			System.out.print("Introduce el nombre: ");
			String nombre = scan.nextLine();
			System.out.print("Introduce los apellidos: ");
			String apellido = scan.nextLine();
			System.out.print("Introduce el DNI: ");
			String dni = scan.nextLine();
			System.out.print("Introduce la nota media: ");
			double notaMedia = scan.nextDouble();
			scan.nextLine(); // Se añade un nextLine() para consumir el espacio que queda (caracter de nueva linea)
			Alumno tempAlumno = new Alumno(nombre, apellido, dni, notaMedia); // Se guardan los datos
			alumnos[alumno] = tempAlumno; // La variable tempAlumno se puede sobreescribir porque los datos no se pierden, están guardados en el array
		}
		scan.close();
		return alumnos;
	}
	
	public static Profesor[] nuevosProfesores(int numAulas) {
		Scanner scan = new Scanner(System.in);
		Profesor[] profesores = new Profesor[numAulas];
		for (int aula = 0 ; aula < numAulas; aula++) {
			System.out.print("Introduce el nombre: ");
			String nombre = scan.nextLine();
			System.out.print("Introduce los apellidos: ");
			String apellido = scan.nextLine();
			System.out.print("Introduce el DNI: ");
			String dni = scan.nextLine();
			System.out.print("Introduce la asignatura: ");
			String asignatura = scan.nextLine();
			Profesor tempProfesor = new Profesor(nombre, apellido, dni, asignatura);
			profesores[aula] = tempProfesor;
		}
		scan.close();
		return profesores;
	}
	
	public static Aula[] nuevasAulas(Profesor[] profesores) {
		Aula[] aulas = new Aula[profesores.length];
		for (int numAula = 0; numAula < profesores.length; numAula++) {
			Aula tempAula = new Aula(numAula, 1, profesores[numAula]); // Suponiendo que el colegio tiene solo una planta
			aulas[numAula] = tempAula;
		}
		return aulas;
	}
}
