package unidad.pkg2semana.pkg4clase.pkg11ejercicio.pkg2;
import java.util.Scanner;
public class Unidad2Semana4Clase11Ejercicio2 {
    public static void main(String[] args) {
    Scanner ingresar = new Scanner(System.in);
    String cadena= "";
    System.out.println("Ingresar un carectar: ") ;
    String caracter = ingresar.nextLine() ;
    for (int i=1; i<=20; i++) {
      cadena = cadena + caracter;
      System.out.println(cadena) ;
    }
   } 
}
