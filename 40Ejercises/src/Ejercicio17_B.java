import javax.swing.*;

public class Ejercicio17_B {

    public Ejercicio17_B() {
        ejercicio();
        ejercicio18();

    }

    public void ejercicio() {
        int codigo, litros, litrosarticulo1 = 0, conteoMas600 = 0;
        float preciolitro, importefactura, facturacionTotal = 0;
        for (int i = 0; i <= 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N° " + i + "\n Diguite el codigo del articulo"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N° " + i + "\n Diguite el codigo de los litros"));
            preciolitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo N° " + i + "\n Diguite el precio por litro"));

            importefactura = (float) litros * preciolitro;//importe por factura
            facturacionTotal += importefactura;//suma iteractiva de las sumas si e aprendido cosas nuevas como esta

            if (codigo == 1) {
                litrosarticulo1 += litros;
            }
            if (importefactura > 600) {
                conteoMas600++;
            }
        }
        System.out.println("Resumen de ventas");
        System.out.println("Facturacion total " + facturacionTotal);
        System.out.println("cantidad de litros articulo 1 " + litrosarticulo1);
        System.out.println("Cantidad de facturas mayores a 600" + conteoMas600);
    }

    public void ejercicio18() {

        int codigo, litros, litrosarticulo1 = 0, conteoMas600 = 0;
        float preciolitro1 = 06, preciolitro2 = 3, preciolitro3 = 125, importefactura, facturacionTotal = 0;
        for (int i = 0; i <= 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N° " + i + "\n Diguite el codigo del articulo"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N° " + i + "\n Diguite la cantidad de litros"));
            //preciolitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo N° " + i + "\n Diguite el precio por litro"));

            importefactura = (float) litros * preciolitro1; //importe por factura
            facturacionTotal += importefactura;//suma iteractiva de las sumas si e aprendido cosas nuevas como esta

            if (codigo == 1) {
                litrosarticulo1 += litros;
            }
            if (importefactura > 600) {
                conteoMas600++;
            }
            if (litros >= litrosarticulo1) {
                System.out.println(preciolitro1);
            } else if (litros >= preciolitro2) {
                System.out.println(preciolitro2);
            } else {
                System.out.println(preciolitro3);
            }
        }
        System.out.println("Resumen de ventas");
        System.out.println("Facturacion total " + facturacionTotal);
        System.out.println("cantidad de litros articulo 1 " + litrosarticulo1);
        System.out.println("Cantidad de facturas mayores a 600" + conteoMas600);
    }

    public static void main(String[] args) {
        new Ejercicio17_B();
    }
}
