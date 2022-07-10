import java.util.Scanner;

public class ejercicio7bloqueoperadores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int horasTotales,semanas,dias,horas;
		System.out.println("Porfavor diguite el numero de horas");
		horasTotales = entrada.nextInt();
		
		semanas = horasTotales / 168;
		dias = horasTotales%168/24;
		horas = horasTotales %24;
		System.out.println("El equivalente de semanad es: " + semanas );
		System.out.println("El equivalente de dias es: " + dias);
		System.out.println("El equivalente de horas es: " + horas);
	}

}
