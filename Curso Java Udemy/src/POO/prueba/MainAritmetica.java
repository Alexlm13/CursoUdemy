package POO.prueba;

public class MainAritmetica {
    public static void main(String[] args) {
        Aritmetica o1=new Aritmetica(5, 7);
        
        //o1.num1=5;
        //o1.num2=7;
        o1.sumar();
        o1.restar();
        
        Aritmetica o2=new Aritmetica(12, 16);
        System.out.println();

        //o2.num1=12;
        // o2.num2=16;
        o2.sumar();
        o2.restar();
        System.out.println();

        // Constructor vacío
        Aritmetica o3=new Aritmetica(5,7);
        System.out.println("Atributo de num1: "+o3.getNum1());
        o3.setNum1(10);
        o3.setNum2(15);
        o3.sumar();
        o3.restar();

        System.out.println("Direccion de memoria "+o1);
    }
}
