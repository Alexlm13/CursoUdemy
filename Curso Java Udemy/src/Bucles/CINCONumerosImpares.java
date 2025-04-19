package Bucles;

public class CINCONumerosImpares {
    public static void main(String[] args) {
        System.out.println("*** Numeros impares ***");
        int num=1;

        do {
            if (num%2==1) 
            System.out.print(num+" ");
            num++;
        } while (num<=20);
    }
}
