public class Temperatura {
       public static int CELCIUS = 0;
       public static int FARENHEIT = 1;
       
       double valor;
       int escala;

       public Temperatura(double valor, int escala) {
              this.valor = valor;
              this.escala = escala; 
                  }

       public double convertirACelcius(double valorF){
              return (valorF-32)/1.8;
                  }

       public double convertirAFarenheit(double valorC) {
              return valorC*1.8+32;
                  }

       public double obtenerTemperaturaenCelcius(){
                 if (escala == CELCIUS) {
                      return valor;     
                                        }
                 else { 
                       return convertirACelcius(valor);
                      }
                                                   }
       public double obtenerTemperaturaenFarenheit(){
                 if (escala == FARENHEIT) {
                      return valor;
                                          }
                 else {
                      return convertirAFarenheit(valor);
                       }
                                                    }

       public boolean esIgual(Temperatura temp) {
                 return escala == temp.escala && valor == temp.valor;
                                                }

       public boolean esMayor(Temperatura temp) {
                 return obtenerTemperaturaenCelcius() > temp.obtenerTemperaturaenCelcius();
              }
       public boolean esMenor(Temperatura temp) {
                 return obtenerTemperaturaenCelcius() < temp.obtenerTemperaturaenCelcius();
              }
           

}
