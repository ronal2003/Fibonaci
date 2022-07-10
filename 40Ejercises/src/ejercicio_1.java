import java.util.Scanner;
//15
public class ejercicio_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float guillermo,luis,juan,total;
		
		System.out.println("Diguite la cantidad de dinero que tiene guillermo");
		guillermo = entrada.nextFloat();
		
		luis = guillermo/2;
		juan = (guillermo+luis)/2;
		
		total =guillermo+luis+juan;
		
		System.out.println("La cantidad de dinero entre los tres es: " + total);
		
	}

}
