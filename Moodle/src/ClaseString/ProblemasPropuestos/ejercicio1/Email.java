package ClaseString.ProblemasPropuestos.ejercicio1;

import java.util.*;

public class Email {
    Scanner entrada;
    String email;

    public Email(){
        entrada=new Scanner(System.in);
        System.out.println("Introduzca su email:");
        email=entrada.nextLine();
    }

    public void comprobar(){
        boolean existe=false;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i)=='@') {
                existe=true;
            }
        }
        if (existe==true) {
            System.out.println(email+" contiene el carácter @");
        } else {
            System.out.println(email+" no contiene el carácter @");
        }
    }

    public static void main(String[] args) {
        Email em1=new Email();
        em1.comprobar();
    }
}
