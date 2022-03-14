public class Estudiante extends Persona {

	public String numeroControl;
	public String carrera;


	Estudiante() {
		super();
		this.numeroControl = "";
		this.carrera = "";
	}


	Estudiante (String n, String a, String g, String c, String nc, String ca) {
		super(n,a,g,c);
		this.numeroControl = nc;
		this.carrera = ca;

	}


	public String toString() {
		return super.toString() +
	"\nNum control: " + this.numeroControl +
	"\nCarrera: " + this.carrera;


	}

}