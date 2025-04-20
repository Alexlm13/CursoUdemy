package TemasAvanzados;

public class Excepciones {
    public static void main(String[] args) {
        int v1=10,v2=0;
        try{
            int resultado=v1/v2;
            System.out.println("Resultado= "+resultado);
        }catch(Exception e){
            System.out.println("Ocurrió un error: "+e);
        }
    }
}
