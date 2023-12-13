package practicas;

public class holaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "hola mundo";
		
		for (int x=0; x < cadena.length(); x ++) {
			
			if (x % 2 == 0) {
				
				imprimir(cadena.toLowerCase(),x);
			} else {
				imprimir(cadena.toUpperCase(),x);
			}
			
			
		}
		
		cadena=cadena.toUpperCase();
		System.out.print(cadena);
	}

	static void imprimir(String cadena , int indice) {
		System.out.println(cadena.charAt(indice));
	}
	
	

}
