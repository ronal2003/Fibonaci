import javax.swing.*;

public class paroimpar {

    public paroimpar() {
        pareseimpares();
        Ejercicio();

    }
    public void pareseimpares(){
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        while(numero !=0){
            if(numero%2 == 0){

                System.out.println("El numero " + numero + "es par");
            } else {
                System.out.println("El numero " + numero + "es impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        }
        Ejercicio();
    }    public void Ejercicio() {
        int i;
        i = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero"));

        while (i >= 0) {


                System.out.println("Los numeros ingresados fueron " + i);
                i++;
            i = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero"));

            //  numero1 = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero"));
          // i++;
        }
    }

    public static void main(String[] args) {
        new paroimpar();
    }
}
