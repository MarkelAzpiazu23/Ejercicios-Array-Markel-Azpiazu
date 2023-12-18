
public class Ejercicio2 {

	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14,72,38};
		int sumar = 0;
		int sumar1 = 0;
		
		for(int i=0;i<=tabla.length/2-1;i++)
			sumar = tabla[i] + sumar;
				System.out.println("La suma es " + sumar);
			
		for(int i=tabla.length/2; i<tabla.length;i++)
			sumar1 = tabla[i] + sumar1;
				System.out.println("La suma es " + sumar1);
				
				if(sumar>sumar1)
					System.out.println("La primera parte es mayor");
				else
					System.out.println("La segunda parte es mayor");

	}

}
