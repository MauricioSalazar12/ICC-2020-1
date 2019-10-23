package ajedrez.piezas;

import java.util.List;
import ajedrez.piezas.Peon;

public class PruebaPeon {
	public static void main (String [] args) {
		int n = 0;
		System.out.println("Creo 8 Peones blancos en la fila 1, cada uno en una columna diferente");
		System.out.println(" ");

		for (int i = 0 ;i < 8 ;i++ ) {
			n = i+1;
			System.out.println("Peon número:" + n);
			Peon p = new Peon(Color.BLANCO, new Posicion(1,i));
			System.out.println("Movimientos posibles:");
			List<Posicion> movimientos = p.obtenerJugadasLegales();
			System.out.println(movimientos);
			System.out.println(" ");

		}
		System.out.println("Creo 8 Peones negros en la fila 6, cada uno en una columna diferente");
		System.out.println(" ");

		for (int i = 0 ;i < 8 ;i++ ) {
			n = i+1;
			System.out.println("Peon número:" + n);
			Peon p = new Peon(Color.NEGRO, new Posicion(6,i));
			System.out.println("Movimientos posibles:");
			List<Posicion> movimientos = p.obtenerJugadasLegales();
			System.out.println(movimientos);
			System.out.println(" ");

		}

		

		

	}
}