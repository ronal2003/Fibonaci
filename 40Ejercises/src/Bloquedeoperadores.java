
import java.util.Scanner;

public class Bloquedeoperadores {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float participacion,primerexamen,segundoexamen,examenfinal,notafinal;

        System.out.println("Porfavor diguite la nota de partcicipacion");
        participacion= entrada.nextFloat();

        System.out.println("Diguite la primer nota del parcial");
        primerexamen = entrada.nextFloat();

        System.out.println("Diguite la segunda nota del parcial");
        segundoexamen = entrada.nextFloat();

        System.out.println("Diguite la nota del parcial final");
        examenfinal = entrada.nextFloat();

        participacion *= 0.10f;
        primerexamen *= 0.25f;
        segundoexamen *= 0.25f;
        examenfinal *= 0.40f;

        notafinal = participacion + primerexamen + segundoexamen + examenfinal;

        System.out.println("la nota final es " + notafinal);
    }

}
