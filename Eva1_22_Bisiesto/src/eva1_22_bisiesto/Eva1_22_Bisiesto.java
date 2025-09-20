package eva1_22_bisiesto;

import java.util.Scanner;

public class Eva1_22_Bisiesto {

    public static void main(String[] args) {
        int year, resi4, resi100, resi400;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Año a verificar");
        year = input.nextInt();
        
        resi4= year % 4;
        resi100 = year % 100;
        resi400 = year % 400;
        
        if(resi4 == 0){
            if(resi100 == 0){
                if(resi400 == 0){
                }
                else{
                    System.out.print("El año " + year + " No es bisiesto");
                }}else{
                    System.out.print("El año " + year + " Es bisiesto");
        }}else{
                    System.out.print("El año " + year + " No es bisiesto");
                }
        }
    }
