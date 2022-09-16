package unidad.pkg3semana.pkg7clase.pkg19ejercicio.pkg1;
import java.util.Scanner;
public class Unidad3Semana7Clase19Ejercicio1 {
    public static void main(String[] args) {
       Scanner objeto = new Scanner(System.in);
    int numero1, numero2, respuesta, contador;
    System.out.println("Ingresar el primer número: ");
    numero1 = objeto.nextInt();
    System.out.println("Ingresa el segundo número: ");
    numero2= objeto.nextInt();
    contador = numero1;
    while (contador > numero2) {
      System.out.println(contador);
      contador--;
    }     
  }  
}
