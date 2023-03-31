package edu.ucjc.programacion.pec1.josu_abad_otano;

public class Colegio {

	private String nombre;
	private String direccion;
	private Aula[] aulas;

	public Colegio(String nombre, String direccion, Aula[] aulas) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.aulas = aulas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Aula[] getAulas() {
		return aulas;
	}

	public void setAulas(Aula[] aulas) {
		this.aulas = aulas;
	}
	
	public void asignaAsientos(Alumno alumno) {
		boolean asignado = false;
		for (Aula aula : aulas) {
			int numAsiento = 0;
			for (Alumno asiento : aula.getAsientos()) {
				numAsiento++;
				if (asiento == null) {
					asiento = alumno;
					asignado = true;
					System.out.println("El alumno " + alumno.getNombre() + " con DNI: " + alumno.getDni() + ", está sentado en el asiento " + numAsiento + " del aula " + aula.getNumero());
					break;
				}
			}
			if (asignado == false) {
				System.out.println("El aula " + aula.getPlanta() + "." + aula.getNumero() + " está llena");
			} else {
				break;
			}
		}
		if (asignado == false) {
			System.out.println("Ya no hay hueco en el colegio");
		}
	}

}
