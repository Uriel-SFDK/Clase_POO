public class Persona extends Object{
	public String nombre;
	public String apellidos;
	public String genero;
	public String curp;



	Persona() {

		this.nombre = "";
		this.apellidos = "";
		this.genero = "Mujer";
		this.curp = "";


	}

	Persona(String n, String a, String g, String c) {


		this.nombre = n;
		this.apellidos = a;
		this.genero = g;
		this.curp = c;


	}

	

	public String toString() {

		return "Nombre: " + this.nombre +
		"\nApellidos: " + this.apellidos +
		"\nGenero: " + this.genero + 
		"\nCurp: " + this.curp;






	}//fin toString



}//fin class