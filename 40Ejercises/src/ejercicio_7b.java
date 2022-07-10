import javax.swing.*;

public class ejercicio_7b {

    public ejercicio_7b() {
        ejercicio1();
        N();
    }

    public void ejercicio1() {
        int numero, elementos = 0, suma = 0;
        float media;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero"));

        while (numero >= 0) {
            suma += numero;
            elementos++;

            numero = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero"));

            if (elementos == 0) {
                System.out.println("Error la division entre cero no existe");
            } else {
                media = suma / elementos;
            }
            media = (float) suma / elementos;
            System.out.println("La  media es " + media);

        }
    }

    public void N() {

        int N;

        N = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero de N "));
        for(int i=1; i<N; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new ejercicio_7b();
    }
}
