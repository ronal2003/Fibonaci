import javax.swing.*;

public class ejercicio_12b {

    //Los primeros metodos de los ejercicios son hechos por el video
    //los segundos son hechos por mi que son los que deja el video

    public ejercicio_12b() {
        sueldo();
        Ejerciciodelvideo();
    }

    public void Ejerciciodelvideo() {
        int numero, suma_neg = 0, suma_pos = 0, conteo_pos = 0, conteo_neg = 0, conteo_ceros = 0;
        float media_pos, media_neg;

        for (int i = 0; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero"));
            if (numero == 0) {
                conteo_ceros++;//aumentamos en uno en uno el numero de 0

            } else if (numero > 0) {
                suma_pos += numero;//suma iterativa de positivos
                conteo_pos++;
            } else { // si el numero es negativo
                suma_neg += numero;
                conteo_neg++;
            }
        }
        //tratamos con los positivos
        if (conteo_pos == 0) {
            System.out.println("No se puede sacar el conteo de los positivos");
        } else {
            media_pos = (float) suma_pos / conteo_pos;
            System.out.println("la media de los numers ´positivos es " + media_pos);
        }
//tratamos con los negativos
        if (conteo_neg == 0) {
            System.out.println("No se puede sacar la media a los negativos");
        } else {
            media_neg = (float) suma_neg / conteo_neg;
            System.out.println("La media de los negativos son " + media_neg);
        }
        System.out.println("La cantidad de ceros  es " + conteo_ceros);
    }

    public void sueldo() {
        int sueldo, cant = 0, total;
        sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su sueldo"));

        for (int i = 0; i <= 10; i++) {
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su sueldo mono"));
            if (sueldo > 1000) {
                cant++;
            }

        }
        total = sueldo + cant;
        System.out.println("La suma de los 10 sueldos son de " + total + "Y la cantidad de sueldo mayores de 1000  son " + cant);

    }

    public static void main(String[] args) {
        new ejercicio_12b();
    }
}
