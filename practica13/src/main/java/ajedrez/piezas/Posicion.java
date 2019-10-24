/**
 * Clase que simula la posicion en el tablero de las piezas de ajedrez
 * @author Salazar Ledesma Hector Mauricio
 * @version 22/10/2019
 */

package ajedrez.piezas;

public class Posicion {
	
	private int fila;
	private int columna;

   /**
    * Constructor de la posicion de una pieza a partir de su fila y columna
    * @param fila - fila en el tablero
    * @param columna - columna en el tablero
    */

	public Posicion( int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}

	/**
	 * Metodo para obtener la fila en que se encuentra la pieza
	 * @return int - fila en que se encuentra la pieza
	 */

	public int obtenerFila() {
		return fila;
	}

	/**
	 * Metodo para obtener la columna en que se encuentra la pieza
	  *@return int - columna en que se encuentra la pieza
	  */
	
	public int obtenerColumna() {
		return columna;
	}

	public String toString() {
		String a = new String();

		a = "Fila:" + " "+ obtenerFila() + " "+ "Columna:" + " " + obtenerColumna();
		return a;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Posicion otra = (Posicion) obj;
		return fila == otra.fila && columna == otra.columna;
	}

}