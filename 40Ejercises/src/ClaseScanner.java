
import java.util.Scanner;

public class ClaseScanner {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int numero1;
        float numero2;
        double numero3;
        char caracter;

        System.out.println("Diguita un caracter");
        caracter = entrada.next().charAt(0);

        System.out.println("Diguita nu nombre");
        nombre = entrada.next();

        System.out.print("Diguite un numero");
        numero1 = entrada.nextInt();

        System.out.println("Diguite un numero de tipo decimal");
        numero2 = entrada.nextFloat();

        System.out.println("Diguite un numero decimal");
        numero3 = entrada.nextDouble();


        System.out.println("Hola" + nombre + "Tu caracter es " + caracter + "Tu numero entero es:  "  + numero1 +  "Tu numero decimal: " + numero2 + "Numero decimal double: " + numero3);

    }

}
