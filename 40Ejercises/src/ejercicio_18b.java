import javax.swing.*;

public class ejercicio_18b {

    public ejercicio_18b() {

    }

    public void Ejerciciodelvideo() {
        float nota;
        int aprobados = 0, condicionados = 0, suspenso = 0;

        for (int i = 0; i <= 6; i++) {
            do {
                nota = Float.parseFloat(JOptionPane.showInputDialog("Diguite una nota"));
            }while (nota<0 || nota>10);
            if(nota == 4){ // si nota es igual a 4
                condicionados++;
            }else if(nota>=5){
                aprobados++;
            }else {
                suspenso++;
            }
        }
        System.out.println("Cantidad aprobados " + aprobados);
        System.out.println("Cantidad condicionados" + condicionados);
        System.out.println("Cantidad suspenso " + suspenso);


    }
    public void sueldoN(){
        int sueldo, cant = 0, total;
        sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su sueldo"));

        for (int i = 0; i <= 10; i++) {
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su sueldo mono"));
            if (sueldo > 1000) {
                cant++;
            }

        }
        total = sueldo + cant;
        System.out.println("La suma de los 10 sueldos son de " + total + "Y la cantidad de sueldo mayores de 1000  son " + cant);

    }

    public static void main(String[] args) {
        new ejercicio_18b();
    }
}
