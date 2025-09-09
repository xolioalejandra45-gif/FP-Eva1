package eva1_12_if;

import java.util.Scanner;

public class Eva1_12_if {

    public static void main(String[] args) {

        int calif;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce tú calificación :");
        calif = input.nextInt();
        
        if (calif >= 70){
        System.out.println("Acreditaste la materia");
        if(calif == 100 ){
            System.out.println("Felicidades acreditaste la materia con excelencia");
        }
        }
        else {
        System.out.println("No acreditaste la materia");
        }
    }
    
}
