
import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        int numero, dato=5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero"));
        if(numero == dato)
        {
            JOptionPane.showMessageDialog(null, "El numero si es " + numero);
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + numero + "No coincide con el numero propuesto que es 5");
        }

        if(numero != dato)
        {
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }

    }

}
