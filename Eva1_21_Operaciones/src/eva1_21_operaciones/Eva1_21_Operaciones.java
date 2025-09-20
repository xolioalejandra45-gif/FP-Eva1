package eva1_21_operaciones;

public class Eva1_21_Operaciones {

    public static void main(String[] args) {
//        Potencia
        int valor = 2, expo = 3;
        double resu;
        resu = Math.pow(valor, expo);
        System.out.print("2 al cubo = ");
        System.out.println(resu);
//        Raíz Cuadrada
        int valor2 = 100;
        double resu2;
        resu2 = Math.sqrt(valor2);
        System.out.print("Raíz Cuadrada de 100 = ");
        System.out.println(resu2);
//        Otras raices
        int valor3 = 125;
        double resu3;
        resu3 = Math.pow(valor3, 1.0/3.0);
        System.out.print("Raíz Cubica de 120 = ");
        System.out.println(resu3);
//        División entre enteros
        System.out.print("1/3 = ");
        System.out.println(1.0/3.0);
//        División exacta
        int num1 = 2024, num2 = 4;
        int residuo;
        residuo = num1 % num2;
        System.out.print("2024/4 el residuo es ");
        System.out.println(residuo);
    }
    
}
