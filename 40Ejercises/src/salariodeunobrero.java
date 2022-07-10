import javax.swing.*;

public class salariodeunobrero {
    //ejercicio22
    public salariodeunobrero() {
        paroimpar();
        calcularsalariodeunorero();
    }

    public void calcularsalariodeunorero() {
        int horasTrabajadas;
        float salariototal;

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Diguite el total de horas trabajadas"));

        if (horasTrabajadas <= 40) {
            salariototal = horasTrabajadas * 16;

        } else {
            salariototal = (40 * 16) + ((horasTrabajadas - 40) * 20);
        }
        JOptionPane.showMessageDialog(null, "El salario total es " + salariototal);

    }

    public void paroimpar() {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un muero"));
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + "es par");
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + numero + "es impar");
        }
    }

    public static void main(String[] args) {
        new salariodeunobrero();
    }
}
