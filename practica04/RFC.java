import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombreCompleto, fecha, dosAP, uDa, dM, dD;
                char inAM, inNom;

                System.out.println("Introduce tu nombre completo: ");
                nombreCompleto = scanner.nextLine();
                
                
                System.out.println("Introduce tu fecha de nacimiento en formato dd/mm/aaaa , recuerda incluir las diagonales");
                fecha = scanner.nextLine();
    
               int  a = nombreCompleto.indexOf(' ');
                dosAP = nombreCompleto.substring(a, a+3);
 
               int  b = nombreCompleto.lastIndexOf(' ');
                inAM = nombreCompleto.charAt(b+1);

                inNom = nombreCompleto.charAt(0);
               
                
                uDa = fecha.substring(8,10);
                dM = fecha.substring(3,5);
                dD = fecha.substring(0,2);
              
               String rfc = dosAP + inAM + inNom + uDa + dM + dD;
               System.out.println("Tu RFC es: ");
               System.out.println(rfc.toUpperCase());
	}

}
