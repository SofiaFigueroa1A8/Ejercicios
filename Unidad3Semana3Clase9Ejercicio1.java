package unidad.pkg3semana.pkg3clase.pkg9ejercicio.pkg1;
import java.util.Scanner;
public class Unidad3Semana3Clase9Ejercicio1 {
    public static void main(String[] args) {
        byte opcion = 0;
    Scanner lectura = new Scanner (System.in) ;
    do {
       System.out.println("1. Mostrar 100 números con un bucle for"); 
       System.out.println("2. Mostrar 100 números con un bucle while"); 
       System.out.println("3. Introduce un número. ¿Es mayor que cero?");
       System.out.println("Introduce un número");
       opcion = lectura.nextByte();
    } while (opcion<1 || opcion> 3);
    switch(opcion) {
    case 1:
        for(int i= 1; i<=100; i++){
          System.out.println(i);
        }
        System.out.println("Opcion 1 ejecutada"); 
        break; 
    case 2: 
        int a=1;
        while(a <=100) {
          System.out.println(a);
          a++;
        }
        System.out.println("opcion 2 ejecutada"); 
        break;
    case 3: 
        System.out.println("ingrese un número:");
        int b= lectura.nextInt();
        if(b>0){
          System.out.println("es mayor a cero");
          
        } else {
          System.out.println("es menor a cero");
        }
        System.out.println("opcion 3 ejecutada"); 
        break; 
    default: 
        System.out.println("Es imposible que el programa entre aquí");
    }
  }   
}
