/**
 * Clase abstracta que simula una pieza de ajedrez
 * @author Salazar Ledesma Hector Mauricio
 * @version 22/10/2019
 */
package ajedrez.piezas;

import java.util.List;
import ajedrez.piezas.Posicion;


public abstract class Pieza {

	private Color color;
	private Posicion posicion;
/**
 * Constructor que asigna color y posicion a la pieza
 * @param color -- color de la ficha ya sea negro o blanco
 * @param posicion -- posicion de la pieza en el tablero
 */
	public Pieza(Color color, Posicion posicion) {
		this.color = color;
		this.posicion = posicion;
	}
/**
 * Metodo abstracto que define las jugadas legales de la pieza
 * @return List -- Lista de las jugadas posibles
 */
	
        public abstract List<Posicion> obtenerJugadasLegales();
/**
 * Metodo que obtiene el color de la pieza
 * @return Color -- Retorna ell color de la pieza
 */
	public Color obtenerColor() {
		return color;
	}
/**
 * Metodo que obtiene la posicion en el tablero de la pieza
 * @return Posicion -- retorna la posicion en el tablero de la ficha
 */
	public Posicion obtenerPosicion() {
		return posicion;
	}
/**
 * Metodo que asigna la posicion en el tablero de la pieza
 * @param posicion -- posicion en el tablero de la pieza
 */
	public void asignarPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
/**
 * Metodo que determina si dos piezas estan en la misma posicion
 * @param obj -- objeto con el que se va a comparar
 * @return boolean -- true si son iguales, false si no lo son
 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null && getClass() != obj.getClass()) {
			return false;
		}
		Pieza otra = (Pieza) obj;
		return color == otra.color && posicion.equals(otra.obtenerPosicion());

	}

}