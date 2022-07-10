import javax.swing.*;

public class Cajero {

    public Cajero(){
        ejercicio14();
        ///cajero();
    }
    public void cajero(){
        final int saldo_inicial = 1000;
float ingreso,saldoactual,retiro;
        int opcion;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\n "
        + "1. Ingresar dinero a la cuneta \n"
        + "2. retirar dinero de la cuenta \n"
        + "3. salir "));

        switch(opcion){
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Diguite la cantidad que desea ingresar en cuenta "));
            saldoactual = saldo_inicial + ingreso;
            JOptionPane.showMessageDialog(null, "Dinero en cuenta " + saldoactual);

            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad que desea retirar"));

            if(retiro > saldo_inicial){
            JOptionPane.showMessageDialog(null,"No cuenta con la cantidad suficiente");
            } else {
                saldoactual = saldo_inicial - retiro;
                JOptionPane.showMessageDialog(null, "A retirado dinero su saldo actual quedo " + saldoactual);
            }
            break;

            case 3:
                JOptionPane.showMessageDialog(null, "Error opcion no esta dentro del las opciones ");
                System.exit(0);
                break;


        }


    }
    public void ejercicio14(){

        int kg = 1000;
        int quintales = 10;
        int gr = 1000000;
        int Lb = 2205;
char opcion;



//        int qtl = Ton * quintales;

        String sms = "Menu de conversion de masa\n\n";
        sms += "1. conversion de ton a kg\n";
        sms += "2. conversion de ton a quintales\n";
        sms += "3. conversion de ton a gr\n";
        sms += "4. conversion de ton a libras\n";

        opcion = JOptionPane.showInputDialog(sms).charAt(0);


        int Ton = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cant de toneladas"));
        switch (opcion){

            case 1:

                int KG = Ton * kg;
                JOptionPane.showMessageDialog(null, "la conversion de Ton a - kg es: " + KG);

                break;
            case 2:

                int qtl = Ton * quintales;
                JOptionPane.showMessageDialog(null, "la conversion de Ton a - quintales es: " + qtl);

                break;
            case 3:
                int GR = Ton * gr;
                JOptionPane.showMessageDialog(null, "la conversion de Ton a - gramos es: " + GR);
                break;
            case 4:
                int LB = Ton * Lb;
                JOptionPane.showMessageDialog(null, "la conversion de Ton a - Libras es: " + LB);

                break;
        }




    }

    public static void main(String[] args) {
        new Cajero();
    }
}
