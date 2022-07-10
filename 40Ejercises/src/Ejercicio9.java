import javax.swing.*;

public class Ejercicio9 {

    public Ejercicio9(){
        caso9();
    }
    public void caso9(){
    int dia, mes, año;

    dia = Integer.parseInt(JOptionPane.showInputDialog("Diguite el dia"));
    mes = Integer.parseInt(JOptionPane.showInputDialog("Diguite el mes"));
    año = Integer.parseInt(JOptionPane.showInputDialog("Diguite el aÃ±o"));

    if((dia>=1) && (dia <= 30)){
        if((mes>=1) && (mes <= 30)) {
            if(año != 0){

                JOptionPane.showMessageDialog(null,"Fecha correcta");
            } else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, aÃ±o incorrecto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
        }
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, aÃ±o incorrecto");
    } else {
        JOptionPane.showMessageDialog(null, "Fecha incorrecta, dia inocrrecto");

    }
    }
    public void mesdidaaño(){
        int dia,mes,año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Diguite el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Diguite el mes"));
        año= Integer.parseInt(JOptionPane.showInputDialog("Diguite el aÃ±o"));

        if((dia>=1) && (dia <= 30)){
            if((mes>=1) && (mes <= 30)) {
                if((mes>=31) && (mes<=28)){
                    if(año != 0){
                        JOptionPane.showMessageDialog(null,"Fecha correcta");
                    } else {
                        JOptionPane.showMessageDialog(null, "Fecha incorrecta, aÃ±o incorrecto");
                    }


                }  else {
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
            }
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, aÃ±o incorrecto");
        } else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, dia inocrrecto");

        }
    }
    public static void main(String[] args) {
        new Ejercicio9();
    }
    // ejercicio 9 de video 24
}
