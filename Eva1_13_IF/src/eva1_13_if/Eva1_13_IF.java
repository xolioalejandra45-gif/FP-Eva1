package eva1_13_if;

import java.util.Scanner;

public class Eva1_13_IF {

    public static void main(String[] args) {
        int edad;
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Introduce tú año de nacimiento:");
        edad = input.nextInt();
        
        if (edad <= 2007){
        System.out.println("Puedes comprar bebidas alcohólicas");
        }
        else {
        System.out.println("No puedes comprar bebidas alcohólicas");
        }

    }
    
}
