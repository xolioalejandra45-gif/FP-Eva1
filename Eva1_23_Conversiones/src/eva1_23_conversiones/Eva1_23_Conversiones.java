package eva1_23_conversiones;

public class Eva1_23_Conversiones {

    public static void main(String[] args) {
        int temp;
        double tempDecimal;
        tempDecimal = 24.5;
        temp = (int)tempDecimal; //Convierte el decimal a entero
        System.out.println(temp);
        
        String cade, mensaje;
        mensaje = "La temperatura es ";
        cade = mensaje + temp; //Concatenación
        System.out.println(cade);
    }
    
}
