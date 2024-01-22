package topGun;

public class Entrenamiento extends Avion {
	
	private boolean tieneDobleMando;

	public Entrenamiento( int idAvion, int capAvion, String modAvion, Piloto piloto,boolean tieneDobleMando) {
		super(idAvion, capAvion, modAvion, piloto);
		this.tieneDobleMando = tieneDobleMando;
	}

	public boolean isTieneDobleMando() {
		return tieneDobleMando;
	}

	public void setTieneDobleMando(boolean tieneDobleMando) {
		this.tieneDobleMando = tieneDobleMando;
	}
	
	

}
