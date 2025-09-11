package eva1_16_if_anidado;

import java.util.Scanner;

public class Eva1_16_If_Anidado {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce un número del 1 al 7:");
        n = input.nextInt();
        
        if (n == 1){
            System.out.println("Domingo");
        }
        else if (n == 2){
            System.out.println("Lunes");
        }else if (n == 3){
            System.out.println("Martes");
        }else if (n == 4){
            System.out.println("Miércoles");
        }else if (n == 5){
            System.out.println("Jueves");
        }else if (n == 6){
            System.out.println("Viernes");
        }else if (n == 7){
            System.out.println("Sábado");
        }
        else{
            System.out.println("El número que proporcionó no es válido");
        }
    }
    
}
