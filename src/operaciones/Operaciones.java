package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        String nombre = "";
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Porfavor Ingrese su nombre");
        nombre = Entrada.nextLine();
        
        System.out.println("Bienvenido: " + nombre);

        


    }
}
