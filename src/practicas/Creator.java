


package practicas;

import java.util.Random;

public class Creator {

	private static String[] asistencia = { "premiumPlus", "online", "presencial" };
	private static String[] tipoCurso = { "DAM", "DAW", "CiberSeguridad", "Bigdata" };

	private static String[] nombres = { "Daniel", "Andres", "Francisco", "Santiago", "JoseRamon", "Ramon", "Dario",
			"JuanCarlos", "Alvaro", "Janhin", "Adrian", "Alejandro", "Simri" };

	private static String[] apellidos = { "Fernandez", "Campos", "Garcia", "Perez", "Ruiz", "Ungureanu", "Diaz",
			"Rodriguez", "Torres", "Villa" };

	public static String newName() {
		Random aleatorio = new Random();
		int numNombre = aleatorio.nextInt(nombres.length);
		int numApellido1 = aleatorio.nextInt(apellidos.length);
		int numApellido2 = aleatorio.nextInt(apellidos.length);

		return (nombres[numNombre] + " " + apellidos[numApellido1] + " " + apellidos[numApellido2]);
	}

	public static int newAge() {
		Random aleatorio = new Random();
		return (17 + aleatorio.nextInt(30));
	}

	public static String newClase() {
		Random aleatorio = new Random();
		return (asistencia[aleatorio.nextInt(asistencia.length)] + " "
				+ tipoCurso[aleatorio.nextInt(tipoCurso.length)]);

	}

}
