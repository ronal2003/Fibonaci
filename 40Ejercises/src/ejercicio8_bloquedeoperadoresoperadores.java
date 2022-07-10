import java.util.Scanner;

public class ejercicio8_bloquedeoperadoresoperadores {

	Scanner entrada = new Scanner(System.in);	
		/// el math sqrt es para la raiz cuadrada
		// y el math pow es para los exponentes
	
	// este es un ejercicio resuelto por mi con base de todos los videos de guia que e visto en los videos hasta hoy
	
		public ejercicio8_bloquedeoperadoresoperadores() {
			exponente();
			raizes();
		
}
		public void exponente() {
			
			
			int a,b,c,resultado;
			
			System.out.println("Diguite los numero de tu exprecion de exponente");
			a = entrada.nextInt();
			b = entrada.nextInt();
			c = entrada.nextInt();
			
			resultado = (int) Math.pow(a, 2) + b + c;
			
			
			System.out.println("el resultado de tu exprecion es: " + a +"X" + b + "X" + c + "=" + resultado);
		}
		public void raizes() {
			
			double a,b,r;
			System.out.println("Ingrese los numero para resolver tu raiz cuadrada");
			b = entrada.nextDouble();
			a = entrada.nextDouble();
			//c = entrada.nextInt();
			
			//r = b - (int) Math.sqrt(a -c )/b;
			r =  Math.pow(a, 2) - 4 ; 
			r = b + Math.sqrt(r);
			r = r/2;
			
			
			System.out.println("El resultado de tu exprecion con raiz cuadrada es de: " + r );
				
		}
		public static void main(String[] args) {
			new ejercicio8_bloquedeoperadoresoperadores();
		}

}
