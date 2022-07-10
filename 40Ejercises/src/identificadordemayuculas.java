import javax.swing.*;

public class identificadordemayuculas {

    public identificadordemayuculas()
    {
        Megaplaza();
    }
    public void Character(){
        char letra;
        letra = JOptionPane.showInputDialog("Ingresa un caracter").charAt(0);

        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"La letra es mayuscula");
        }else {
            JOptionPane.showMessageDialog(null,"La letra no   es mayuscula");
        }
    }
    //Este ejercicio fue hecho por mi ya que son ejercicios que el tutorial deja como tarea
    public void Megaplaza()
    {
        int pago;
        double desc = 0.2;

        String sms =  "Ingrese su pago recuerde que si su pago es mayor de 300 " + "" +
                "\n su compra recibira un descuento del 20%";

        JOptionPane.showMessageDialog(null, sms);
        pago = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su pago"));
//La verdad tengo un problema con esto de los porcentajes siempre me alojan estos resultados no se si esta bien o si hay que hacer otro tipo de operacion ya que
        //el 0.02 es el 2% y el 0.2 es el 20% y al restar esto con 300 es una resta insignificante porque solo le esta descontando solo 2 numeros :´(

        if(pago >= 300){
            double res = pago - desc;
            JOptionPane.showMessageDialog(null,"por tu compra mayor de 300 se aplicara el descuento del 20% tu compra quedo en " + res);
        } else {
            JOptionPane.showMessageDialog(null,"no aplicara descunto");
        }

    }
    public static void main(String[] args) {
        new identificadordemayuculas();
    }
}
