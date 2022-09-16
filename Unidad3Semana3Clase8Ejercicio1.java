package unidad.pkg3semana.pkg3clase.pkg8ejercicio.pkg1;
import java.util.Scanner;
public class Unidad3Semana3Clase8Ejercicio1 {
    public static void main(String[] args) {
       Scanner Reader = new Scanner(System.in);
    String quieroJugar = "si";
    while(quieroJugar.equals("si")){
      System.out.println("¿Quieres seguir jugando?");
      quieroJugar = Reader.next();
    } 
  }  
}
