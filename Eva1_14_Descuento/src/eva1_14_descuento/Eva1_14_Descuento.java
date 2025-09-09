package eva1_14_descuento;

import java.util.Scanner;

public class Eva1_14_Descuento {

    public static void main(String[] args) {
        int monto;
        double descuento = 15.0;
        double montofinal;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el monto de tú compra:");
        monto = input.nextInt();
        
        montofinal = monto - (monto * (descuento/100));
        
        if (monto >= 1000){
        System.out.println("Tienes un descuento del 15%, tú monto a pagar es");
          System.out.println(montofinal);
        }
        else {
        System.out.println("Tú total a pagar es:");
        System.out.println(monto);
        }
    }
    
}
