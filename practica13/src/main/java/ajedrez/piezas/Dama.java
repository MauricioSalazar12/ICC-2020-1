package ajedrez.piezas;

import ajedrez.Tablero;
import java.util.List;
import java.util.LinkedList;

public class Dama extends Pieza {

	Tablero tab = Tablero.obtenerInstancia();

	public Dama(Color color, Posicion posicion) {
		super(color, posicion);
	}

	@Override
	public List<Posicion> obtenerJugadasLegales() {
		LinkedList<Posicion> jugadas = new LinkedList<>();
		int fila = obtenerPosicion().obtenerFila(),
			columna = obtenerPosicion().obtenerColumna();

		for (int i = columna - 1 ;i >= 0  ;i-- ) {
			Pieza p = tab.obtenerPieza(fila,i);
			if (p == null) {
				jugadas.add(new Posicion(fila,i));
			}
			else {
				if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(fila,i));
					break;
				}
				else {
					break;
				}
			}
		}

		for (int i = columna + 1;i <= 7 ; i++ ) {
			Pieza p = tab.obtenerPieza(fila,i);
			if (p == null) {
				jugadas.add(new Posicion(fila,i));
			}
			else {
				if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(fila,i));
					break;
				}
				else {
					break;
				}
			}
		}

		for (int i = fila - 1;i >= 0 ; i-- ) {
			Pieza p = tab.obtenerPieza(i,columna);
			if (p == null) {
				jugadas.add(new Posicion(i,columna));
			}
			else {
				if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(i,columna));
					break;
				}
				else {
					break;
				}
			}
		}	

		for (int i = fila + 1; i <= 7 ;i++ ) {
			Pieza p = tab.obtenerPieza(i,columna);
			if (p == null) {
				jugadas.add(new Posicion(i,columna));
			}
			else {
				if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(i,columna));
					break;
				}
				else {
					break;
				}
			}
		}

		for (int i = fila - 1, j = columna - 1;i >= 0 && j>=0 ;i--, j-- ) {
			Pieza p = tab.obtenerPieza(i,j);
			if (p == null) {
				jugadas.add(new Posicion(i,j));
			}
			else {
				if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(i,j));
					break;
				}
				else {
					break;
				}
			}		
		}

		for (int i = fila + 1, j = columna + 1;i <= 7 && j<=7 ;i++, j++ ) {
			Pieza p = tab.obtenerPieza(i,j);
			if (p == null) {
				jugadas.add(new Posicion(i,j));
			}
			else {
				if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(i,j));
					break;
				}
				else {
					break;
				}
			}			
		}

		for (int i = fila - 1, j = columna + 1;i >= 0 && j <=7 ;i--, j++ ) {
			Pieza p = tab.obtenerPieza(i,j);
			if (p == null) {
				jugadas.add(new Posicion(i,j));
			}
			else {
				if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(i,j));
					break;
				}
				else {
					break;
				}
			}
		}

		for (int i = fila + 1, j = columna - 1; i <= 7 && j >= 0 ;i++, j-- ) {
			Pieza p = tab.obtenerPieza(i,j);
			if (p == null) {
				jugadas.add(new Posicion(i,j));
			}
			else {
				if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(i,j));
					break;
				}
				else {
					break;
				}
			}
		}

		return jugadas;
	}
}
