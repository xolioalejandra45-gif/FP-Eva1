package eva1_11_operaciones_logicas;

public class Eva1_11_Operaciones_Logicas {

    public static void main(String[] args) {
        int radio = 5;
        boolean resu;
        
        resu = radio > 0; //mayor que 0
        System.out.println("radio (5) > 0 -->");
        System.out.println(resu);
        
        resu = radio < 0;//menor que 0
        System.out.println("radio (5) < 0 -->");
        System.out.println(resu);    
        
        resu = radio == 0;//igual que 0
        System.out.println("radio (5) =  0 -->");
        System.out.println(resu);
        
        resu = radio != 0;//diferente que 0
        System.out.println("radio (5) !=  0 -->");
        System.out.println(resu);
    }
    
}
