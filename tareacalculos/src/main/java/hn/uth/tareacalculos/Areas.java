package hn.uth.tareacalculos;

import java.util.*;

public class Areas {
	public static Scanner entrada=new Scanner(System.in);
 
	public static void main(String[] args) {
		int opc=-1;
		double base=0,altura=0,radio=0;
 
		while(opc!=0){
			opc=menu();
			switch(opc) {
				case 1:
					radio=solicitarValor("Indica el radio: ");
					System.out.printf("\nArea de circulo:  %1.2f\n", Math.PI*(Math.pow(radio,2)));
					break;
				case 2:
					base=solicitarValor("Indica la base o altura: ");
					System.out.println("\nArea de cuadrado: " + (base*base));
					break;
				case 3:
					base=solicitarValor("Indica la base: ");
					altura=solicitarValor("Indica la altura: ");
					System.out.println("\nlArea de rectangulo " + (base*altura));
					break;
				case 4:
					
					base=solicitarValor("Indica la base: ");
					altura=solicitarValor("Indica la altura: ");
					System.out.printf("\nArea de triangulo. %1.2f\n", (base*altura)/2);
					break;
			}
		}
		entrada.close();
	}
 
	private static double solicitarValor(String texto) {
		while(true){
			try {
				System.out.print(texto);
			return entrada.nextDouble();
			}catch(InputMismatchException e) {
				
			System.out.println("El valor tiene que ser numerico...");
			entrada.nextLine();
			}
          }
	}
 
	private static int menu() {
		int opcion=-1;
		System.out.println("\n\n-----------MENU DE CALCULOS----------------");
		System.out.println("1-Area de circulo");
		System.out.println("2-Area de cuadrado");
		System.out.println("3-Area de circulo");
		System.out.println("4-Area de trinagulo");
		System.out.println("0-Salir");
		System.out.println("\n\n-------------------------------------------");
		System.out.println("Selecciona una opción");
		System.out.println("\n\n-------------------------------------------");
		while(opcion<0) {
			try {
				opcion=entrada.nextInt();
			}catch(InputMismatchException e) {
				
				System.out.println("El valor no es numerico...");
				entrada.nextLine();
				opcion=-1;
			}
		
 
		return opcion;
	}

		
		return 0;
	}
	
	
	
	
	/*prueba para el test*/

	public static int AreaCuadrado(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int rectangulo(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int AreaCirculo(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
