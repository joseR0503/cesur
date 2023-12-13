package alumnoCesur;

class Administrativo extends Persona {

	
	// ATRIBUTOS
	 private boolean idiomas;

	// CONSTRUCTOR

	public Administrativo(String nombre, int edad, boolean idiomas) {
		super(nombre, edad);

		this.idiomas = idiomas;
	}

	// CONSTRCTOR

	public Administrativo(String nombre) {
		super(nombre, 0);

		this.idiomas = false;
	}

	// GETTERS Y SETTERS

	public boolean isIdiomas() {
		return idiomas;
	}

	public void setIdiomas(boolean idiomas) {
		this.idiomas = idiomas;
	}

}