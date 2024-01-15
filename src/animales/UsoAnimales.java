package animales;

public class UsoAnimales {

	public static void main(String[] args) {
		mamiferos perro = new mamiferos("perro", 15, true);
		Insecto hormiga = new Insecto("hormiga", 1, false, true, "oso hormiguero");
		System.out.println("El animal: " + hormiga.getNombre() + " tiene alas?: " + hormiga.isAlas());
		System.out.println(hormiga.getNombre() + " tiene de enemigo a: " + hormiga.getEnemigo().getNombre());

		Insecto atomica;
		Insecto volantona;
		volantona = hormiga;
		atomica = new Insecto(hormiga.getNombre() + " atomica", hormiga.getTpoVida(), hormiga.isAlas(),
				hormiga.isAntenas(), hormiga.getEnemigo().getNombre()

		);
		
		
		hormiga.setAlas(true);
		volantona.setNombre("volantona");
		System.out.println(hormiga.getNombre() + " tiene alas?: " + hormiga.isAlas());
		System.out.println(atomica.getNombre() + "tiene alass?: " + atomica.isAlas());
		System.out.println(volantona.getNombre() + " tiene alas?: " + volantona.isAlas());  
		
		
        volantona.setNombre(atomica.getNombre());
		
		System.out.println();

	}

}
