import javax.swing.*;

public class ciclosobucles {


    public ciclosobucles(){
    //numero_aleatorios();
    ejercicio();
    }
    public void numero_aleatorios() {
        int numero, aleatorio, contador = 0;

        aleatorio = (int) (Math.random() * 100);
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Diguite un valor"));
            if (aleatorio > numero) {
                System.out.println("Dguite un numero mayor");
            } else {
                System.out.println("Dguite un numero  menor");
            }
            contador++;
        }  while (numero != aleatorio) ;

            System.out.println("Muy bien adivinaste el numero en " + contador + "intentos");



        System.out.println(aleatorio);
    }
    public void ejercicio(){
        int numero1,numero2 =3;
        int suma;

          do{
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero"));
            //numero2 = Integer.parseInt(JOptionPane.showInputDialog("Diguite otro numero"));

              //suma = numero1 + numero2;


        }while(numero1 !=0);
        suma = numero1 + numero2;
        System.out.println("El resultado de tu suma es " + suma);
       numero2+=2;
    }
    public static void main(String[] args) {
        new ciclosobucles();
    }
}
