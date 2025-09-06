package eva1_10_captura;

import java.util.Scanner;

public class Eva1_10_Captura {

    public static void main(String[] args) {
        double velocidad, distancia, tiempo;
         Scanner input = new Scanner(System.in);
         
          System.out.println("Introduce la distancia:");
          distancia = input.nextDouble();
          System.out.println("Introduce el tiempo:");
          tiempo = input.nextDouble();
          
          velocidad = distancia / tiempo;

          System.out.print("La velocidad es: ");
          System.out.println(velocidad);
          System.out.print("m/s");
    }
    
}
