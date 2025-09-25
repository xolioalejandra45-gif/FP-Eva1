package eva1_24_juego_aguila_sol;

import java.util.Random;
import java.util.Scanner;

public class Eva1_24_Juego_Aguila_Sol {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int usuario;
        int programa;
        
        System.out.println("Aguila o sello? (1/0): ");
        usuario = input.nextInt();
        
        programa = random.nextInt(2);
        System.out.println("El programa eligió:" + (programa == 1 ? "Aguila" : "Sello"));
        
        if(usuario == 1 && programa == 1){
            System.out.println("Empate");
        }else if (usuario == 0 && programa == 1){
            System.out.println("Perdiste");
        } else if(usuario == 1 && programa == 0){
            System.out.println("Ganaste");
        } else {
            System.out.println("Empate");
        }
    }
    
}
