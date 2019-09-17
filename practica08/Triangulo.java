package geometria;

/**
 * Representa un polígono de tres lados. Está definido por tres puntos en el plano cartesiano.
 * tres puntos en el plano cartesiano
 * @author  Hector Mauricio Salazar Ledesma
 * @version 1.0 
 */

   public class Triangulo {
        /**
         *Declaracion de atributos
         */

        private Punto a;
        private Punto b;
        private Punto c;
        private double x,y,z;
        
        /** 
         *Campos
         */
       public static final int EQUILATERO = 0;
       public static final int ISOSCELES = 1;
       public static final int ESCALENO = 2;

           
        /**
         *Constructor por omision Crea un trinagulo equilatero de lado 1 con vertices en (0,0), (1,0) y (0.5, sin(pi/3))
         */
                public  Triangulo(){
                      a = new Punto(0,0); 
                      b = new Punto(1,0);
                      c = new Punto(0.5, Math.sin(Math.PI/3));
                            }
          /**
           *Constructor con parametros Crea un triangulo con los tres puntos dados
           *@param a vertice A
           *@param b vertice B
           *@param c vertice C
           */
               public Triangulo (Punto a, Punto b, Punto c){ 
                          this.a = a;
                          this.b = b;
                          this.c = c;
                           }
           /**
            *Determina si los vertices de este triangulo estan alineados.
            *@return boolean
            */
              public boolean tieneVerticesAlineados() {
                             return a.estanAlineados(b,c);
                             }
           /**
            *Regresa el tipo de este triangulo segun la longitud de sus lados; puede ser equilatero, isosceles o escaleno
            *@return int
            */
             public int tipo(){
                            x = a.distancia(b);
                            y = a.distancia(c);
                            z = b.distancia(c);

                              if (x==y && x==z){
                                           return EQUILATERO; 
                                            } 
                              else { if (x==y || x==z || y==z){
                                           return ISOSCELES;
                                                              }
                                     else { 
                                            return ESCALENO;
                                          }

                                     }
                              }






}
