package edu.ucjc.programacion.pec1.josu_abad_otano;

public class GestionColegios {
	
	// GitHub: https://github.com/josuabad/PEC1_programacion2023.git

	public static void main(String[] args) { // Nombre, dirección, numero de aulas del colegio, numero de alumnos
		int numAlumnos = Integer.parseInt(args[3]); // Para las operacione se debe cambiar el tipo de datos recibidos de String a integer
		int numAulas = Integer.parseInt(args[2]); // Pasa tanto con el numero de aulas como con el de alumnos
		Alumno[] totalAlumnos = UtilsColegio.nuevosAlumnos(numAlumnos);
		Profesor[] totalProfesores = UtilsColegio.nuevosProfesores(numAulas);
		Aula[] totalAulas = UtilsColegio.nuevasAulas(totalProfesores);
		Colegio colegio = new Colegio(args[0], args[1], totalAulas); // Objeto de tipo Colegio con los argumentos
		GestionColegios miColegio = new GestionColegios();
		miColegio.nuevoColegio(totalAlumnos, colegio);
	}
	
	public void nuevoColegio(Alumno[] Alumnos, Colegio colegio) {
		for (Alumno alumno : Alumnos) {
			colegio.asignaAsientos(alumno);
		}
	}
}
