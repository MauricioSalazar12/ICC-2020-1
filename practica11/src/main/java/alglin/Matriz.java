package alglin;

/**
 * Representa una matriz de mxn con entradas en los reales.
 *
 */
public class Matriz {

    private double[][] datos;
    private int m, n;

    /**
     * Crea una matriz de mxn donde todas las entradas son cero.
     *
     * @param m el número de filas
     * @param n el número de columnas
     */
    public Matriz(int m, int n) {
        this.m = m;
        this.n = n;
        datos = new double[m][n];

            for (int i = 0;i < m ;i++ ) {
                for (int j = 0;j < n ;j++ ) {
                    datos [i][j] = 0;
                
                }
            
            }   
        
    }

    /**
     * Regresa la entrada en la i-ésima fila y j-ésima columna de esta matriz.
     *
     * @param i la fila de la entrada deseada
     * @param j la columna de la entrada deseada
     * @return la entrada i,j
     */
    public double obtenerEntrada(int i, int j) {
        
        double entrada = 0;

        if (0 <= i && i <= m && 0 <= j && j <= n ) {
            entrada = datos [i][j];
            
            return entrada; 
        }
        
        return 0;
    }

    /**
     * Inserta el dato dado en la i-ésima fila y j-ésima columna de esta matriz.
     *
     * @param dato el número que se insertará en esta matriz
     * @param i    la fila donde se insertará <code>dato</code>
     * @param j    la columna donde se insertará <code>dato</code>
     */
    public void asignarEntrada(double dato, int i, int j) {
        
        if (0 <= i && i <= m && 0<= j && j <= n) {

            this.datos [i][j] = dato;
            
        }

        else {
            System.out.println("Verifica los indices de tu entrada");
        }
    }

    /**
     * Suma esta matriz con otra. Regresa <code>null</code> si las matrices no tienen las mismas
     * dimensiones.
     *
     * @param otra la otra matriz con la cual se sumará esta
     * @return una matriz nueva que resulta de sumar esta con <code>otra</code>
     */
    public Matriz sumar(Matriz otra) {
        Matriz sumMatriz = new Matriz(datos.length,datos[0].length);

        if(datos.length == otra.datos.length && datos[0].length == otra.datos[0].length){
            for (int i=0;i < datos.length ;i++ ) {
                for (int j = 0;j< datos[i].length ;j++ ) {

                    sumMatriz.datos [i][j] = datos [i][j] + otra.datos[i][j];
                }
            }

            return sumMatriz;
        }
        
        return null;
    }

    /**
     * Multiplica esta matriz por un escalar.
     *
     * @param c el escalar real
     * @return una matriz nueva que resulta de multiplicar esta por <code>c</code>
     */
    public Matriz escalar(double c) {
        Matriz escMatriz = new Matriz(m,n);

        for (int i = 0; i < m ;i++ ) {
            for (int j = 0;j < n; j++ ) {

                escMatriz.datos [i][j] = c * datos [i][j];
                
            }
            
        }
        return escMatriz;
    }

    /**
     * Elimina una fila de esta matriz.
     *
     * @param k la fila a eliminar
     * @return una matriz nueva que resulta de eliminar la k-ésima fila de esta matriz
     */
    public Matriz eliminarFila(int k) {
        Matriz elf = new Matriz(m-1,n);
        if (0 <= k && k < datos.length){
            int fie = 0;

            for (int i = 0; i < datos.length ; i++){
                if (i != k) {
                    for (int j = 0; j < datos[i].length ; j++ ){
                        elf.asignarEntrada(datos[i][j],fie,j);
                    }
                    fie++;
                }
            }      
            return elf;
        }
        return null;
        
    }

    /**
     * Elimina una columna de esta matriz.
     *
     * @param k la columna a eliminar
     * @return una matriz nueva que resulta de eliminar la k-ésima columna de esta matriz
     */
    public Matriz eliminarColumna(int k) {
        Matriz coe = new Matriz(m,datos[0].length-1);
        
        if (0 <= k && k < datos[0].length ) {
            int col;
            for (int i = 0; i < datos.length ;i++ ) {
                col = 0;
                for (int j = 0; j < datos[i].length ;j++ ) {
                    if (k != j) {
                        coe.asignarEntrada(datos[i][j],i,col);
                        col ++;
                    }
                }   
            }
            return coe;
        }
        return null;
        
    }

    /**
     * Calcula el determinante de esta matriz.
     *
     * @return el determinante de esta matriz
     */
    public double determinante() {
        double det = 0;
        Matriz ai = eliminarFila(0);
        double detaij = 0;
        double esc;

        if(this.m == this.n){

            for (int j = 0;j < datos.length ;j++ ) {
                esc = datos[0][j]*Math.pow(-1,j);
                Matriz aij = ai.eliminarColumna(j);
                detaij = ((aij.datos[0][0])*(aij.datos[1][1])*(aij.datos[2][2])+(aij.datos[1][0])*(aij.datos[2][1])*(aij.datos[0][2])+(aij.datos[2][0])*(aij.datos[0][1])*(aij.datos[1][2]))-((aij.datos[2][0])*(aij.datos[1][1])*(aij.datos[0][2])+(aij.datos[1][0])*(aij.datos[0][1])*(aij.datos[2][2])+(aij.datos[0][0])*(aij.datos[2][1])*(aij.datos[1][2]));  
                det = det + esc*detaij;
            
            }

            return det;
        }
        return 0;
    }

    /**
     * Regresa los datos de esta matriz de tal forma que las columnas están separadas por un espacio
     * y las filas están separadas por un salto de línea. Por ejemplo: <br>
     * "2.0 3.0 0.0 1.0 <br>
     * &nbsp;4.0 0.0 9.0 8.0 <br>
     * &nbsp;5.0 7.0 2.0 4.0"
     *
     * @return la representación en <code>String</code> de esta matriz
     */
    @Override
    public String toString() {
        String a ="";
            for (int i = 0; i < m ; i++) {
                for (int j = 0; j < n ;j++ ){
                    if ( j != n-1){
                        a += datos[i][j] + " ";
                    }
                    else{
                        a += datos[i][j];
                    }
                }
                if (i != m-1){
                    a += "\n";
                }
                else
                    a += "";
                
            }

      return a;
    
    }

    /**
     * Regresa <code>true</code> si y sólo si <code>obj</code> es una instancia de 
     * {@link alglin.Matriz} y las matrices son iguales entrada por entrada.
     *
     * @param obj el objeto a comparar
     * @return <code>true</code> si <code>this</code> y <code>obj</code> son iguales entrada por
     *         entrada
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
            
        }
        Matriz otra = (Matriz) obj;
        if (m != otra.m || n != otra.n) {
            return false;
            
        }
        for (int i = 0;i < m  ;i++ ) {
            for (int j=0;j<n ;j++ ) {
                if (datos [i][j] != otra.datos [i][j]) {
                    return false;
                    
                }
                
            }
            
        }
        return true;
    }

}