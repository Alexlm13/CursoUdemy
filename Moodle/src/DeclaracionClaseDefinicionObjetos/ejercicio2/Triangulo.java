package DeclaracionClaseDefinicionObjetos.ejercicio2;

public class Triangulo {
    //ATRIBUTOS
    private int lado1, lado2, lado3;

    //METODOS
    //constructor
    public Triangulo(int lado1, int lado2, int lado3){
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }

    public void ladoMayor(){
        if (lado1>lado2 && lado1>lado3) {
            System.out.println(lado1);
        }else {
            if (lado2>lado3) {
                System.out.println(lado2);
            } else {
                System.out.println(lado3);
            }
        }
    }

    public void equilatero(){
        if (lado1==lado2 && lado1==lado3) {
            System.out.println("Es equilatero");
        } else{
            System.out.println("No es equilatero");
        }
    }
}
