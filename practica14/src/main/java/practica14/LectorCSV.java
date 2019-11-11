package practica14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java util.LinkedList;

public class LectorCSV {
	
	public static List<String []> leer(String ruta) throws IOException {

		List<String> lineas = Files.rendAllLines(Paths.get(ruta));

		LinkedList<Sring[]> ls = new LinkedList<>();

		for(String linea : lineas) {
			
			ls.add(linea.trim().split(","));
		}

		return ls;
	}
}