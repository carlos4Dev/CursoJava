package ejercicios7y8;

public class Notas {
	Alumnos alumno;
	Curso curso;
	double nota;
	
	public Notas(Alumnos alumno, Curso curso, double nota) {
		super();
		this.alumno = alumno;
		this.curso = curso;
		this.nota = nota;
	}

	public Alumnos getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumnos alumno) {
		this.alumno = alumno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return alumno + " -->> Curso = " + curso + " -->> nota = " 
				+ nota;
	}
	
	

}
