import java.util.Scanner;

public class ciclsofor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador;

        System.out.println("Ingrese los terminos");
        contador = entrada.nextInt();

        for(int i=2; i<contador; i+=2){
            System.out.println(i);
        }
    }
}
