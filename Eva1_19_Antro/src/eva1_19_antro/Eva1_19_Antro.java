package eva1_19_antro;

import java.util.Scanner;

public class Eva1_19_Antro {
    final static String EDAD = "18";
    final static String CREDENCIAL = "Si";
    
    public static void main(String[] args) {
        String edd, crede;
        Scanner input = new Scanner(System.in);
        
        System.out.println("**********BIENVENIDO*********");
        System.out.println("ANTRO HAPPY");
        System.out.println("Edad:");
        edd = input.nextLine();
        System.out.println("Tiene credencial:");
        crede = input.nextLine();
        
        if(edd.equals(EDAD)){
            if(crede.equals(CREDENCIAL)){
                System.out.println("Acceso concedido");
            }else{
                System.out.println("Acceso denegado");
            }
        }
        else{            
            System.out.println("Acceso denegado");
        }
    }
    
}
