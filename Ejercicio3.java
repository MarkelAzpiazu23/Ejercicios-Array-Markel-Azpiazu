
public class Ejercicio3 {

	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14,72,38};
		boolean iguales = false;
		
		for(int i=0;i<tabla.length;i++)
			for(int j= i+1;j<tabla.length;j++)
				if(tabla[i] == tabla [j]) 
					iguales = true;
		if(iguales==true)
		System.out.println("En este caso los array si son iguales");
		else 
			System.out.println("En este caso los array no son iguales");
				
	}

}
