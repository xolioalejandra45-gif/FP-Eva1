package eva1_18_acceso;

import java.util.Scanner;

public class Eva1_18_Acceso {
    final static String USUARIO = "Alejandra";
    final static String PWD = "2412";

    public static void main(String[] args) {
        String usu, contra;
        Scanner input = new Scanner(System.in);
        
        System.out.println("**********BIENVENIDO*********");
        System.out.println("Sistema de venta");
        System.out.println("Usuario:");
        usu = input.nextLine();
        System.out.println("Contraseña:");
        contra = input.nextLine();
        
        if(usu.equals(USUARIO)){
            if(contra.equals(PWD)){
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
