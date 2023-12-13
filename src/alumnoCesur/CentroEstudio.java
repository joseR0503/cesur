package alumnoCesur;

public class CentroEstudio {

	// ATRIBUTOS

	private String nombre;
	private Administrativo[] administrativos;
	private Clase[] clases;
	private final int MAX_ADMIN;
	private final int MAX_CLASES;
	
	
	// CONSTRUCTOR
	
	public CentroEstudio(String nombre, int mAX_ADMIN, int mAX_CLASES) {
		super();
		this.nombre = nombre;
		MAX_ADMIN = mAX_ADMIN;
		MAX_CLASES = mAX_CLASES;
		this.administrativos = new Administrativo[mAX_ADMIN];
		this.clases = new Clase[mAX_CLASES];
	}


	public CentroEstudio(String nombre) {
		super();
		this.nombre = nombre;
		MAX_ADMIN = 10;
		MAX_CLASES = 10;
		this.administrativos = new Administrativo[MAX_ADMIN];
		this.clases = new Clase[MAX_CLASES];
	}

	
	
	
	// GETTERS Y SETTERS 

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Administrativo[] getAdministrativos() {
		return administrativos;
	}


	public void setAdministrativos(Administrativo[] administrativos) {
		this.administrativos = administrativos;
	}


	public Clase[] getClases() {
		return clases;
	}


	public void setClases(Clase[] clases) {
		this.clases = clases;
	}


	public int getMAX_ADMIN() {
		return MAX_ADMIN;
	}


	public int getMAX_CLASES() {
		return MAX_CLASES;
	}


		public String toString() {
			return ("["+"Centro:"+nombre+", CAPACIDAD { clases:"+MAX_CLASES+", Admin:"+MAX_ADMIN+"}]");
		}
	
	
	
	
	
	}
	
	
	
	
	
	


