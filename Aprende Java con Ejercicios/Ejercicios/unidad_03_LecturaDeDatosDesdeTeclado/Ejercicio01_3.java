package unidad_03_LecturaDeDatosDesdeTeclado;
import java.util.Scanner;
public class Ejercicio01_3 {

	public static void main(String[] args) {
		
		
		// 
Scanner s = new Scanner(System.in);
	System.out.println("Introduce el primer número.");

int primero = Integer.parseInt(s.nextLine());

	System.out.println("Introduce el segundo número.");
	
int segundo = Integer.parseInt(s.nextLine());

int resultado = primero*segundo;

	System.out.println("La multiplicación de esos números es igual a "+resultado+".");

	}
}
