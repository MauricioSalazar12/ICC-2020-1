/**
 * Clase libro
 * @author Mauricio Salazar
 * @version 1.0
 */

public class Libro {
                   
     /**
      * Declaracion de atributos
      */
     public String Titulo, Autor, Año;
     
     /**
      * Constructor default
      */
     public Libro (){
           this.Titulo = "";
           this.Autor = "";
           this.Año = "";
       }
    
    /**
     * Constructor con parametros
     * @param Titulo parametro del titulo 
     * @param Autor parametro del autor
     * @param Año parametro del año
     */
    public Libro (String Titulo,String Autor, String Año){
           this.Titulo = Titulo;
           this.Autor = Autor;
           this.Año = Año;
           }

    /**
     * Accede al Titulo
     * @return Titulo
     */
   public String obtenerTitulo(){
             return Titulo;
             }

    /**
     * Accede al Autor
     * @return Autor
     */
   public String obtenerAutor(){
           return Autor;
           }

    /**
     * Accede al año     
     * @return Año
     */
    public String obtenerAño(){
            return Año;
            }

    /**
     * Asigna un nuevo Titulo
     * @param Titulo nuevoTitulo
     */
    public void modificaTitulo(String Titulo){
           this.Titulo = Titulo;
           }

    /**
     * Asigna un nuevo Autor
     * @param Autor nuevo Autor
     */
   public void modificarAutor(String Autor){
          this.Autor = Autor;
          }

    /**
     * Asigna un nuevo Año
     * @param Año nuevoAño
     */
    public void modificarAño(String Año){
           this.Año = Año;
           }

}
