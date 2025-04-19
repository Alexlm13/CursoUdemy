package Cadena_de_Caracteres;

public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        //Mas formas de concatenar cadenas en Java
        String cadena1="Hola";
        String cadena2="Mundo";
        String cadena3=cadena1+" "+cadena2;
        System.out.println("Usando el operador +: "+cadena3);

        //Metodo concat
        cadena3=cadena1.concat(" ").concat("Mundo");
        System.out.println("Usando concat: "+cadena3);

        //StringBuilder
        StringBuilder constructorCadenas=new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);

        String resultado=constructorCadenas.toString();
        System.out.println("Usando StringBuilder: "+resultado);

        //StringBuffer
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        System.out.println("Usando StringBuffer: "+stringBuffer.toString());
    
        //join
        resultado=String.join(" ", cadena1, cadena2);
        System.out.println("Usando Join: "+resultado);
    }
}
