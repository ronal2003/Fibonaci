import javax.swing.*;

public class ejercicio9_B {

    public ejercicio9_B() {

        suma();
        For();
    }

    public void For() {


    }

    public void Estructure() {
    for(int i =100; i>=0; i-=7){
        System.out.println(i);
    }
    }

    public void suma() {
        int numero, res;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero"));
        for (int i = 0;  i< 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero"));
            System.out.println("Resultado de la suma de los numeros asignados " + i + i);

        }
    }

    public static void main(String[] args) {

        new ejercicio9_B();
    }
}
