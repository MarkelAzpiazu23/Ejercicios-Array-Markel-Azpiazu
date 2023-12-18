
public class Ejercicio1 {

	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14};
		int contiene = 0;
		
		
		for(int i=0;i<tabla.length;i++) 
			if(tabla[i] == 3) {
				contiene++;	
		}
		System.out.println("Hay " + contiene);
		

	}

}
