package edu.ucjc.programacion.pec1.josu_abad_otano;

public class GestionColegios {

	public static void main(String[] args) { // nombre, dirección, numAulas, numAlumnos
		int numAlumnos = Integer.parseInt(args[3]);
		int numAulas = Integer.parseInt(args[2]);
		Alumno[] totalAlumnos = UtilsColegio.nuevosAlumnos(numAlumnos);
		Profesor[] totalProfesores = UtilsColegio.nuevosProfesores(numAulas);
		Aula[] totalAulas = UtilsColegio.nuevasAulas(totalProfesores);
		Colegio colegio = new Colegio(args[0], args[1], totalAulas);
		GestionColegios miColegio = new GestionColegios();
		miColegio.nuevoColegio(totalAlumnos, colegio);
	}
	
	public void nuevoColegio(Alumno[] Alumnos, Colegio colegio) {
		for (Alumno alumno : Alumnos) {
			colegio.asignaAsientos(alumno);
		}
	}
}
