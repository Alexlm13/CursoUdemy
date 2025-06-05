package DeclaracionClaseDefinicionObjetos.ejercicio2;

public class PruebaTriangulo {
    public static void main(String[] args) {
        Triangulo t1=new Triangulo(15, 13, 18);
        Triangulo t2=new Triangulo(15, 15, 15);

        t1.ladoMayor();
        t1.equilatero();

        t2.ladoMayor();
        t2.equilatero();
    }
}
