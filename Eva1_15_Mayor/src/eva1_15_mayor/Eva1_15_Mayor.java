package eva1_15_mayor;

import java.util.Scanner;

public class Eva1_15_Mayor {

    public static void main(String[] args) {
        int n1, n2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el primer número:");
        n1 = input.nextInt();
        System.out.println("Introduce el segundo número");
        n2 = input.nextInt();
        
        if(n1 > n2){
            System.out.println("El número mayor es:");
            System.out.println(n1);
        }
        else{
            if (n2 > n1){
            System.out.println("El número mayor es:");
            System.out.println(n2);
            }
            else{
                System.out.println("Los valores son iguales");
            }
        }
    }
    
}
