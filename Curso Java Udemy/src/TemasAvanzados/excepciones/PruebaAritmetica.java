package TemasAvanzados.excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {

        try{
            int resultado=Aritmetica.division(10, 2);
            System.out.println("Resultado: "+resultado);
        }catch(Exception e){
            System.out.println("Ocurrió un error: "+e);
        }
        finally{
            System.out.println("Se revisó la división entre cero");
        }
    }
}
