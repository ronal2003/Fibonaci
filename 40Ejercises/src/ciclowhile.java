import java.util.Scanner;

public class ciclowhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int i =1,contador;

        System.out.println("Diguite cuantos numero quiere en su pantalla");
        contador = entrada.nextInt();

        while (i<=contador){
            System.out.println(i);
            i+=2;
        }
    }
}
