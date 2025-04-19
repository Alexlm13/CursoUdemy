package Sentecias_de_Decision;

public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario ***");
        //SINTAXIS
        //condicio ? exp1:exp2

        //Determinar si un numero es par o no
        int numero=4;
        String resultado = (numero%2==0) ? "par":"impar";
        System.out.println("\nEl número "+numero+" es "+resultado);

        //Calcular si es mayor de edad
        int edad=19;
        String mensaje=(edad>=18)?"eres mayor de edad":"eres menor de edad";
        System.out.println("\nTu edad es de "+edad+" años, por lo tanto "+mensaje);

        //Valor positivo, negativo o cero
        numero=0;
        resultado=(numero>0)?" es positivo":(numero<0)?" es negativo":" es cero";
        System.out.println("\nSu número "+numero+resultado);
    }
}
