//tipos de variables
// int, string, double, boolean
import java.util.Scanner;
public class operacionesBasicas{
       public static void main(String[] args){
              int edad=20;
              String nombre= "ana";
              double promedio= 8.5;
              boolean aprobado= true;

              System.out.println("Nombre: "+nombre);
              System.out.println("Edad: "+edad);
              System.out.println("Promedio: "+promedio);
              System.out.println("¿Aprobado?: "+ aprobado);

              
        
        // EJERCICIO ENCONTRAR LA EDAD
        // Pedimos el nombre
              Scanner scanner = new Scanner(System.in);
              System.out.print("¿Cómo te llamas? ");
              String nombreEstudiante = scanner.nextLine();

        // Pedimos la edad
              System.out.print("¿Cuántos años tienes? ");
              int edadEstudiante = scanner.nextInt();

        // Mostramos el mensaje
              System.out.println("Hola " + nombreEstudiante + ", el próximo año tendrás " + (edadEstudiante + 1) + " años.");
              
              scanner.close();
 
           }


}