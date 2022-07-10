import javax.swing.*;

public class Calculadoraarimetcica {

    public Calculadoraarimetcica(){
    calculadoraaritmetica();
    ejercicio12();
    }

    public void calculadoraaritmetica(){

        int numero1, numero2,suma,resta,multi,div;
char operacion ;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero"));
    operacion = JOptionPane.showInputDialog("Diguite la opracion que desea realizar").charAt(0);

    switch(operacion){
        case's':
        case'S':
            suma = numero1 + numero2;
            JOptionPane.showMessageDialog(null,"la  suma es " + suma);
            break;

        case 'R':
        case 'r':
            resta = numero1 - numero2;
            JOptionPane.showMessageDialog(null,"la  resta es " + resta);
            break;

        case'p':
        case 'P':
        case 'm':
        case 'M':

        multi = numero1 * numero2;
        JOptionPane.showMessageDialog(null,"La multiplicacion es " + multi);

        case 'd':
        case 'D':

            div = numero1 / numero2;
            JOptionPane.showMessageDialog(null, "la division es " + div);
        default: JOptionPane.showMessageDialog(null, "error se equivoco de numero");
    }
    }
    public void ejercicio12(){
        int nota1,nota2,nota3,nota4,nota5,nota6,nota7,nota8,nota9,nota10;
        char forma;
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Diguite la nota"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Diguite la nota"));
        nota3 = Integer.parseInt(JOptionPane.showInputDialog("Diguite la nota"));
        nota4 = Integer.parseInt(JOptionPane.showInputDialog("Diguite la nota"));
        nota5 = Integer.parseInt(JOptionPane.showInputDialog("Diguite la nota"));
        nota6 = Integer.parseInt(JOptionPane.showInputDialog("Diguite la nota"));
        nota7 = Integer.parseInt(JOptionPane.showInputDialog("Diguite la nota"));
        nota8 = Integer.parseInt(JOptionPane.showInputDialog("Diguite la nota"));
        nota9 = Integer.parseInt(JOptionPane.showInputDialog("Diguite la nota"));
        nota10 = Integer.parseInt(JOptionPane.showInputDialog("Diguite la nota"));

        forma = JOptionPane.showInputDialog("Diguite una opcion ").charAt(0);

        switch(forma){
            case 'a':
            JOptionPane.showMessageDialog(null,"insufiiciente" + nota1 + "-" + nota2 + "-" + nota3);
           break;

            case 'b':
                JOptionPane.showMessageDialog(null,"suficiente" + nota4 + "-" + nota5 + "-" + nota6);
                break;
            case 'c':
                JOptionPane.showMessageDialog(null,"bien" + nota7);
                break;
            case 'd':
                JOptionPane.showMessageDialog(null,"notable" + nota8 + "-" + nota9);
                break;
            case 'e':
                JOptionPane.showMessageDialog(null,"sobresaliente" + nota10);
                break;
            default: JOptionPane.showInputDialog("Esta opcion no esta disponible en este programa");







        }
    }
    public static void main(String[] args) {
    new Calculadoraarimetcica();
    }
}
