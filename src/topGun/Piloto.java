package topGun;

public class Piloto {
	
	// ATRIBUTOS
	private int idPiloto;
	private String nomPiloto;
	private int horasVuelo;
	private String rangoPiloto;
	
	
	// CONSTRUCTOR
	public Piloto(int idPiloto, String nomPiloto, int horasVuelo, String rangoPiloto) {
		super();
		this.idPiloto = idPiloto;
		this.nomPiloto = nomPiloto;
		this.horasVuelo = horasVuelo;
		this.rangoPiloto = rangoPiloto;
	}

	public void mostrarPiloto () {
		System.out.println("La id de un piloto es " + idPiloto);
		System.out.println("El nombre de un piloto es " + nomPiloto);
		System.out.println("Las horas de vuelo de un piloto son " + horasVuelo);
		System.out.println("El rango de un piloto es  " + rangoPiloto);
		
	}
		//GETTER Y SETTER
	public int getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}

	public String getNomPiloto() {
		return nomPiloto;
	}

	public void setNomPiloto(String nomPiloto) {
		this.nomPiloto = nomPiloto;
	}

	public int getHorasVuelo() {
		return horasVuelo;
	}

	public void setHorasVuelo(int horasVuelo) {
		this.horasVuelo = horasVuelo;
	}

	public String getRangoPiloto() {
		return rangoPiloto;
	}

	public void setRangoPiloto(String rangoPiloto) {
		this.rangoPiloto = rangoPiloto;
	}
	
	

}
