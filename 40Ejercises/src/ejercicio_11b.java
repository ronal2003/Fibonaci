import javax.swing.*;

public class ejercicio_11b {

    public ejercicio_11b() {
        factorial();
        ejerciciodelvideo();
    }

    public void ejerciciodelvideo() {
        long producto = 1;

        for (int i = 1; i <= 20; i += 2) {
            producto = producto * i;
        }
        System.out.println("El producto es " + producto);
    }

    public void factorial() {
        int N, factor;

        N = Integer.parseInt(JOptionPane.showInputDialog("Asignale un valor a N"));

        for (int i = 1; i <= 10; i++) {
            N = N * i;

            System.out.println("Factor de N " + N);
        }
    }

    public static void main(String[] args) {
        new ejercicio_11b();
    }
}
