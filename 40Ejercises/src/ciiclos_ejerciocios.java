import javax.swing.*;

public class ciiclos_ejerciocios {
    public static void main(String[] args) {
        int numero,cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero"));

        while(numero >=0){
            //cuadrado = (int) Math.pow(numero, 2);
            //JOptionPane.showMessageDialog(null,"El numero " + numero + "elevado al cuadrado es " + cuadrado);

            numero = Integer.parseInt(JOptionPane.showInputDialog("Diguite otro numero"));
        }
    }
}
