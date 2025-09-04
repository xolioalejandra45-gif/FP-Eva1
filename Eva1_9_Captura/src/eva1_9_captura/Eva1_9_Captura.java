package eva1_9_captura;

import java.util.Scanner; //Importación  para Scanner


public class Eva1_9_Captura {
        
    
    public static void main(String[] args) {
        String nombre; 
        int edad;
        double promedio;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce tu nombre completo:");
        nombre = input.nextLine();
        System.out.println("Introduce tú edad:");
        edad = input.nextInt();
        System.out.println("Introduce tú promedio de la preparatoria:");
        promedio = input.nextDouble();
        
        System.out.print("El nombre capturdo es: ");
        System.out.println(nombre);
        System.out.print("La edad capturada es: ");
        System.out.println(edad);
        System.out.print("El promedio capturado es: ");
        System.out.println(promedio);
    }
    
}
