package alumnoCesur;

import java.util.Random;

import practicas.Creator;

public class AlumnoCesur {

	// MAIN

	public static void main(String[] args) {

		Random aleatorio = new Random();
		CentroEstudio cesurEste = new CentroEstudio("cesur El Palo", 7, 4);
		Clase claseTemp;
		String nombreClaseTemp= Creator.newClase();
		
		for (int i = 0; i < 5; i++) {
			claseTemp = new Clase(Creator.newClase());

			for (int x = 0; x < 15; x++) {
				claseTemp.add(new Alumno(Creator.newName(), Creator.newAge(), nombreClaseTemp));
				
				claseTemp.setProfesor(new Profesor(Creator.newName(), Creator.newAge(),nombreClaseTemp));// METO UN PROFESOR ALEATORIO EN LA CLASE I-ESIMA

				
			}
			cesurEste.getClases()[i]=claseTemp;
			System.out.println(cesurEste.getClases()[i]);
			
			
		}
		Administrativo adminTemp;
		
		for (int i=0; i<=3; i++) {
			adminTemp = new Administrativo(
					Creator.newName(),
					Creator.newAge(),
					aleatorio.nextBoolean());
			
			cesurEste.getAdministrativos()[i] = adminTemp;
			System.out.println(cesurEste.getAdministrativos()[i]);
			
		}
		
		
	
		
		
	}// FIN MAIN

	
	
} // FIN ALUMNOCESUR