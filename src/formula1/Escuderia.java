package formula1;

public class Escuderia {
	
	// ATRIBUTOS.
	
			// constantes de clase:
		private static final int NUMING = 4;
		private static final int NUMMEC = 6;
		private static final int NUMPIL = 2;
		private static final int NUMCOC = 2;
		
			// atributos de instancia
		public final String nombre;
		public JefeEscuderia jefe;
		public MiArrayIngeniero ingenieros;
		public MiArrayMecanico mecanicos;
		public MiArrayPiloto pilotos;
		public MiArrayCoche coches;


		// CONSTRUCTOR

		public Escuderia(String nombre) {

			this.nombre = nombre;
			this.jefe = null;
			this.coches = new MiArrayCoche(NUMCOC);
			this.ingenieros = new MiArrayIngeniero(NUMING);
			this.mecanicos = new MiArrayMecanico(NUMMEC);
			this.pilotos = new MiArrayPiloto(NUMPIL);

		}

}
