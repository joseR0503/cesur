package practicas;

public class ContadorInverso {
	
	//[1200.... 620] de 20 en 20
	
	public static void main(String[] args) {
		
		int x =1200;
		
		while(x>=620) {
			System.out.print(x +" ");
			x = x-20; 
		}
		 
		int i = 1200;
		
		System.out.println();
		
		do { 
			System.out.print(i +" ");
			i = i -20;	
		} while ( i>=620);
		
		System.out.println();
		
		for (int r = 1200; r >=620; r=r-20) {
			System.out.print(r + " ");
		}
		
	}

}
