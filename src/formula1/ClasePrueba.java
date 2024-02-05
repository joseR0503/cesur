package formula1;

public class ClasePrueba {
	
public static void main(String[] args) {
		
		//CREAMOS ESCUDERIA
	
		Escuderia ferrari = new Escuderia("Ferrari");
		
		//INSERTAR JEFE, INGENIEROS, MECANICOS, COCHES y PILOTOS.
		
		ferrari.jefe = new JefeEscuderia(50,"Fredderick",124, 6, 5, 8);
		System.out.println(ferrari.jefe.getNombre());
		ferrari.ingenieros = new MiArrayIngeniero(6);
		for (int i=0;i<6;i++) {
			ferrari.ingenieros.insertarValor(new Ingeniero(26+i,"Peter",456+i));
			System.out.println(ferrari.ingenieros.getIntMiArray(i).getNombre()+" dni: "+ferrari.ingenieros.getIntMiArray(i).getDni());
		}
		
		

	}


}
