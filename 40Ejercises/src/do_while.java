import java.util.Scanner;

public class do_while {
Scanner entrada = new Scanner(System.in);
    public do_while(){


        int i=1,contador;
        System.out.println("Diguite la cantidad de terminos ");
        contador = entrada.nextInt();

        do{
            System.out.println(i);
            i+=2;
        }while(i<=contador);
       // System.out.println(i);
    }

    public static void main(String[] args) {
    new do_while();
    }
}
