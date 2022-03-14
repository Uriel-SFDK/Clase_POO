public class Docente Extends Persona {
		public String numeroEmpleado;
		public String especialidad;



	Docente() {
		super();
		this.numeroEmpleado = "";
		this.especialidad = "";


	}

	Docente (String n, String a, String g, String c, String ne, String es) {
			super(n,a,g,c);
			this.numeroEmpleado = ne;
			this.especialidad = es;
	}

	public String toString() {
		return super.toString() +
		"\nNum Empleado: " + this.numeroEmpleado +
		"\nEspecialidad: " + this.especialidad;


	}




}