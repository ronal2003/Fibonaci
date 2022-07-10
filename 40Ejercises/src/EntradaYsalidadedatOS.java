import javax.swing.JOptionPane;

public class EntradaYsalidadedatOS {
public static void main(String[] args) {
	String cadena;
	int entero;
	char letra;
	double decimal;
	
	cadena = JOptionPane.showInputDialog( "Diguite una cadena");
	entero = Integer.parseInt(JOptionPane.showInputDialog("Diguite un entero: "));
	letra = JOptionPane.showInputDialog("Diguite una letra ").charAt(0);
	decimal = Double.parseDouble(JOptionPane.showInputDialog("Diguitaun decimal"));
	
	JOptionPane.showMessageDialog(null, "la cadena es " + cadena);
	JOptionPane.showMessageDialog(null, "el numero entero es " + entero);
	JOptionPane.showMessageDialog(null, "el caracter es " + letra);
	JOptionPane.showMessageDialog(null, "el numero decimal es " + decimal);
	
	
	
}
}
