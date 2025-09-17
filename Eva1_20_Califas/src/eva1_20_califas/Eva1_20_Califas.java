package eva1_20_califas;

import java.util.Scanner;

public class Eva1_20_Califas {

    public static void main(String[] args) {
        int calificacion;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce tú calificación:");
        calificacion = input.nextInt();
        
        if ((calificacion >= 90)&& (calificacion <= 100)){
            System.out.print("A");
        }
        else if ((calificacion >= 80)&& (calificacion <= 89)){
            System.out.println("B");
        }
        else if ((calificacion >= 70)&& (calificacion <= 79)){
            System.out.println("C");
        }
        else if ((calificacion >= 60)&& (calificacion <= 69)){
            System.out.println("D");
        }
        else if ((calificacion >= 0)&& (calificacion <= 59)){
            System.out.println("F");
        }
        else{
            System.out.println("Calificación no válida");
        }
    }
    
}
