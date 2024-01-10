package animales;

public class mamiferos extends Animal {
	private boolean velloCorporal;

	public mamiferos(String nombre, int tpoVida, boolean velloCorporal) {
		super(nombre, tpoVida);
		this.velloCorporal = velloCorporal;
	}

	public boolean isVelloCorporal() {
		return velloCorporal;
	}

	public void setVelloCorporal(boolean velloCorporal) {
		this.velloCorporal = velloCorporal;
	}
	
	

}
