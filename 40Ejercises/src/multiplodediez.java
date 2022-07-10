import javax.swing.*;

public class multiplodediez {
    public multiplodediez() {
        mayoroigual();
        multiplo();
    }

    public void multiplo() {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "El numero" + numero + "Es multiplo de 10");
        } else {
            JOptionPane.showMessageDialog(null, "El numero no es multiplo de 10 ");
        }
    }

    public void mayoroigual() {
        int numero1, numero = 100;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numero1 < numero) {
            JOptionPane.showMessageDialog(null, "El numero es menor que " + numero);

        } else {
            JOptionPane.showMessageDialog(null, "El numero es mayor que " + numero);

        }
    }

    public static void main(String[] args) {
        new multiplodediez();
    }
}
