public class incrementoydecremento {
	public static void main(String[] args) {
	
		int x =5, y;
		//x++; vvariable de incremento 
		//x--; variable de decremento
		y = --x;
		// hay que poer cuidado en que parte se pone el signo de incremento y decremento
		// si esta en prefijo primero hace la funcion de decremento como en este caso y luego asigna
		// pero si esta en sufijo primero asigna el valor y despues el 
		
		System.out.println(y);
		System.out.println(x);
	}

}
