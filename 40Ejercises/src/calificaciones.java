
import java.util.Scanner;

public class calificaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1,nota2,nota3,suma;

        System.out.println("Diguita tus 3 notificaciones: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();

        suma = nota1 + nota2 + nota3;
        System.out.println("\n la suma es: " + suma);
    }

}
