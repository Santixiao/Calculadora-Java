package principal;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcionMenu = 0;
		Scanner sc;
		sc = new Scanner(System.in);
		
		do {
			
			System.out.println(" ** CALCULADORA ** ");
			System.out.println("Eliga la operación a realizar:");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. División");
			System.out.println("5. Resto");
			System.out.println("0. Salir");
			System.out.print("Introduzca una opción válida: ");
			
			opcionMenu = Integer.parseInt(sc.nextLine());
			
			
			
			if(opcionMenu < 0 || opcionMenu > 5) {
				
				System.out.println("Introduzca una opción válida!");
				
			}else if(opcionMenu != 0) {
				
				System.out.println("\n");
				float operando1, operando2;
				
				System.out.print("Introduzca el primer operando: ");
				operando1 = Float.parseFloat(sc.nextLine());
				
				System.out.print("Introduzca el segundo operando: ");
				operando2 = Float.parseFloat(sc.nextLine());
				
			switch(opcionMenu){
			
				case 1://Suma
					System.out.println("El resultado de la suma es: " + (operando1 + operando2));
					break;
				case 2://Resta
					System.out.println("El resultado de la resta es: " + (operando1 - operando2));
					break;
				case 3://Multiplicación
					System.out.println("El resultado de la resta es: " + (operando1 * operando2));
					break;
				case 4://Dividir
					System.out.println("El resultado de la división es: " + (operando1 / operando2));
					break;
				case 5://Resto
					System.out.println("El resultado del resto es: " + (operando1 % operando2));
					break;
			}
			}
			
		}while(opcionMenu != 0); {
			
			sc.close();
			
			System.out.println("Apagando la calculadora...");
			
		}
		
	}
	

}
