package topGun;

public class Combate extends Avion {
	
	private boolean esFurtivo;

	public Combate( int idAvion, int capAvion, String modAvion, Piloto piloto,boolean esFurtivo) {
		super(idAvion,capAvion,modAvion,piloto);
		this.esFurtivo = esFurtivo;
	}

	public boolean isEsFurtivo() {
		return esFurtivo;
	}

	public void setEsFurtivo(boolean esFurtivo) {
		this.esFurtivo = esFurtivo;
	}
	
	

}
