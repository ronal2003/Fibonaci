import javax.swing.*;

public class ejercicio_13 {
    public ejercicio_13() {
        tablademultiplicar();
        ciclosobluqles();
    }

    public void ciclosobluqles() {
        int edad, sumaredad = 0, conteomayor18 = 0, contadormayor75 = 0;
        float altura, sumaAltura = 0, mediaedad = 0, mediaAltura = 0;

        for (int i = 1; i <= 5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno " + i + "\n Diguite su edad "));
            altura = Integer.parseInt(JOptionPane.showInputDialog("Alumno " + i + "\n Diguite su estatura"));

            sumaredad += edad;//suma iterativa de edades
            sumaAltura += altura; // suma iterativa de las alturas

            if (edad > 18) {// si la edad es mayor a 18 pues el conteo de 18 aumenta
                conteomayor18++;
            }
            if (altura > 1.75) {// si la cantidad es mayor a 1.75 pues esta aumenta
                contadormayor75++;

            }

        }
        mediaedad = (float) sumaredad / 5;
        mediaAltura = (float) sumaAltura / 5;
        System.out.println("La edad promedio es: " + mediaedad);
        System.out.println("La estatura promedio es: " + mediaAltura);
        System.out.println("La cantidad de los alumnos mayores a 18 años es: " + conteomayor18);
        System.out.println("Cantidad de alumnos que miden mas de 1.75 " + contadormayor75);

    }

    public void tablademultiplicar() {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero"));
        System.out.println("Tabla del " + numero);
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {

                if (numero == i) {

                    System.out.println(i + " x " + j + " = " + i * j);
                }

            }
        }
    }

    public static void main(String[] args) {
        new ejercicio_13();
    }
}
