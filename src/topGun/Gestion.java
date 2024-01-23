package topGun;


public class Gestion {

	public static void main(String[] args) {
		
		Piloto piloto1= new Piloto ( 4, "Pete Maverick", 10000, "Capitan");
		Piloto piloto2= new Piloto( 5, "Natasha Phoenix", 3000, "Teniente"); 
		Piloto piloto3= new Piloto( 6,"Bradley Rooster", 3500, "Teniente");
		Piloto piloto4= new Piloto(7, "Rambo", 5000, "Coronel");
		Piloto piloto5= new Piloto(8, "Xavi Hernandez", 200, "Cabo");
		
		
		System.out.print("Primer Piloto: ");
		piloto1.mostrarPiloto();
		
		System.out.print("Segundo Piloto: ");
		piloto2.mostrarPiloto();
		
		

	}

}
