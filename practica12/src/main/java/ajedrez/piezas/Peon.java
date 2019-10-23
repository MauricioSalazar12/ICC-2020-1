/**
 * Clase que modela un Peon en ajedrez
 * @author Salazar Ledesma Hector Mauricio
 * @version 22/10/2019
 */
package ajedrez.piezas;

import java.util.List;
import java.util.LinkedList;

public class Peon extends Pieza {
/**
 * Constructor que asigna color y posicion al peon
 * @param color -- color del peon ya sea negro o blanco.
 * @param posicion -- posicion inicial del peon en el tablero
 */    
	public Peon(Color color, Posicion posicion) {
		super(color, posicion);
	}
/**
 * Metodo que obtiene las posible jugadas del peon dependiendo de su posicion en el tablero
 * @return List -- Lista que contiene las posibles jugadas
 */
	@Override
	public List<Posicion> obtenerJugadasLegales() {
		LinkedList<Posicion> jugadas = new LinkedList<>();
		int fila = obtenerPosicion().obtenerFila(),
			columna = obtenerPosicion().obtenerColumna();
		
		if (obtenerColor() == Color.NEGRO){

			if (columna - 1 >= 0) {
				jugadas.add(new Posicion (fila - 1, columna - 1));
			}
			if (columna + 1 <= 7) {
				jugadas.add(new Posicion (fila - 1, columna + 1));
			}
			if (fila == 6) {
				jugadas.add(new Posicion (fila - 2 , columna));
			}
			if (fila - 1 >= 0 ) {
				jugadas.add(new Posicion (fila - 1, columna));
			}
			return jugadas;
		}

		if (obtenerColor() == Color.BLANCO) {

			if (columna - 1 >= 0) {
				jugadas.add(new Posicion(fila + 1, columna - 1));
			}
			if (columna + 1 <= 7) {
				jugadas.add(new Posicion (fila + 1, columna + 1));
			}
			if (fila == 1) {
				jugadas.add(new Posicion(fila + 2, columna));
			}
			if (fila + 1 <= 7) {
				jugadas.add(new Posicion(fila + 1, columna));
			}
			return jugadas;
		}
		return jugadas;
	}

}