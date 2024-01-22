package topGun;

public class Avion {
	
	//ATRIBUTOS
	private int idAvion;
	private int capAvion;
	private String modAvion;
	private Piloto piloto;
	
	
	
	//CONSTRUCTOR
	public Avion(int idAvion, int capAvion, String modAvion, Piloto piloto) {
		super();
		this.idAvion = idAvion;
		this.capAvion = capAvion;
		this.modAvion = modAvion;
		this.piloto = piloto;
	}
	public void mostrarAvion() {
		System.out.println("La id de un avion es " + idAvion );
		System.out.println("La capacidad de un avion es " + capAvion);
		System.out.println("El modelo de un avion es " + modAvion);
		System.out.print("La id de un piloto es ");
		piloto.mostrarPiloto();
	}
		// GETTER Y SETTER 
	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public int getCapAvion() {
		return capAvion;
	}

	public void setCapAvion(int capAvion) {
		this.capAvion = capAvion;
	}

	public String getModAvion() {
		return modAvion;
	}

	public void setModAvion(String modAvion) {
		this.modAvion = modAvion;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	
	

}
