import javax.swing.*;

public class Ejercicio9 {

    public Ejercicio9(){
        caso9();
    }
    public void caso9(){
    int dia, mes, a�o;

    dia = Integer.parseInt(JOptionPane.showInputDialog("Diguite el dia"));
    mes = Integer.parseInt(JOptionPane.showInputDialog("Diguite el mes"));
    a�o = Integer.parseInt(JOptionPane.showInputDialog("Diguite el año"));

    if((dia>=1) && (dia <= 30)){
        if((mes>=1) && (mes <= 30)) {
            if(a�o != 0){

                JOptionPane.showMessageDialog(null,"Fecha correcta");
            } else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
        }
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
    } else {
        JOptionPane.showMessageDialog(null, "Fecha incorrecta, dia inocrrecto");

    }
    }
    public void mesdidaa�o(){
        int dia,mes,a�o;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Diguite el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Diguite el mes"));
        a�o= Integer.parseInt(JOptionPane.showInputDialog("Diguite el año"));

        if((dia>=1) && (dia <= 30)){
            if((mes>=1) && (mes <= 30)) {
                if((mes>=31) && (mes<=28)){
                    if(a�o != 0){
                        JOptionPane.showMessageDialog(null,"Fecha correcta");
                    } else {
                        JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
                    }


                }  else {
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
            }
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
        } else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, dia inocrrecto");

        }
    }
    public static void main(String[] args) {
        new Ejercicio9();
    }
    // ejercicio 9 de video 24
}
