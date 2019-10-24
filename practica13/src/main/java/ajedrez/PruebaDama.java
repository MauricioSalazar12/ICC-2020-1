package ajedrez.piezas;

import java.util.List;
import ajedrez.piezas.Dama;
import ajedrez.Tablero;

public class PruebaDama {
	public static void main (String [] args) {
		int n = 0;
		System.out.println("Creo el tablero: ");
		Tablero tab = Tablero.obtenerInstancia();

		System.out.println("Creo una dama BLANCA en la posicion (7,3)");

		Dama dam = new Dama(Color.BLANCO,new Posicion(7,3));



		System.out.println("Obtengo sus posibles movimientos :");

		List<Posicion> movimientos = dam.obtenerJugadasLegales();
		System.out.println(movimientos);

		System.out.println(" ");
		System.out.println("Creo una dama NEGRA en la posicion (0,3)");

		Dama da = new Dama(Color.NEGRO,new Posicion(0,3));

		System.out.println("Obtenego sus posibles movimientos :");
		List<Posicion> mov = da.obtenerJugadasLegales();

		System.out.println(mov);

	}
}