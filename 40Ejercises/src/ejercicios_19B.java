import javax.swing.*;

public class ejercicios_19B {

    public ejercicios_19B(){
negatiosYpositivos();
calificaciones();
    }
    public void negatiosYpositivos(){
    int numero;
    boolean hay_registros = false;

    for (int i =0; i<=10; i++){
        numero = Integer.parseInt(JOptionPane.showInputDialog("Diguita un numero"));
        if(numero < 0){
            hay_registros = true;
        }

    }
    if(hay_registros==true){
        System.out.println("Si existe un numero negativo");
    } else {
        System.out.println("No esciste un numero negativo");
    }
    }
    public void calificaciones(){
        int notas,aprobado=0,estable=0,suspenso=0;

        notas= Integer.parseInt(JOptionPane.showInputDialog("Diguita un notas "));

        for(int i=0; i>=5; i++){
            if(notas >=50){
                aprobado++;
            } else if(notas <=40){
                estable++;
            } else {
            suspenso++;
            }
        }
        System.out.println("Alumnos aprobados "+ aprobado);
        System.out.println("Alumnos estables " + estable);
        System.out.println("Alumnos en suspenso " + suspenso);

    }

    public static void main(String[] args) {
        new ejercicios_19B();
    }
}
