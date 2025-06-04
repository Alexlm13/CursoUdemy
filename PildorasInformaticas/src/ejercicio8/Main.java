package ejercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        int opc, tipoEntrada, numEntrada;
        Zona principal=new Zona(1000);
        Zona compra_venta=new Zona(200);
        Zona vip=new Zona(25);

        
        

        do{
            System.out.println("""
                    1.  Mostrar número de entradas libres
                    2.  Vender entradas
                    3.  Salir
                    """);
            opc=entrada.nextInt();
            switch(opc) {
                case 1:
                    System.out.println(); //limpia
                    System.out.println("El número de entradas restantes en Zona Principal es de: "+principal.getEntradasPorVender());
                    System.out.println("El número de entradas restantes en Compra Venta es de: "+compra_venta.getEntradasPorVender());
                    System.out.println("El número de entradas restantes en Zona VIP es de: "+vip.getEntradasPorVender());
                    System.out.println("");
                    break;
                
                case 2:
                    do{
                        System.out.println("""
                                ¿Qué tipo de entrada quiere vender?

                                1.  Zona principal
                                2.  Compra venta
                                3.  VIP
                                4.  Salir
                                """);
                        tipoEntrada=entrada.nextInt();

                        switch (tipoEntrada) {
                            case 1:
                                System.out.println("¿Cuántas desea vender?");
                                numEntrada=entrada.nextInt();
                                principal.vender(numEntrada);
                                break;
                            case 2:
                                System.out.println("¿Cuántas desea vender?");
                                numEntrada=entrada.nextInt();
                                compra_venta.vender(numEntrada);
                                break;
                            case 3:
                                System.out.println("¿Cuántas desea vender?");
                                numEntrada=entrada.nextInt();
                                vip.vender(numEntrada);
                                break;
                            case 4:
                                System.out.println("Gracias por su venta!");
                                System.out.println("Hasta pronto!!");
                                break;
                            default:
                                if (tipoEntrada>=5) {
                                    System.out.println("ERROR! OPCIÓN NO VÁLIDA");
                                }
                                break;
                        }

                    }while (tipoEntrada!=4);

                case 3:
                    System.out.println("Adiós, vuelva pronto");
                    break;
                
                default:
                    if (opc>=4) {
                        System.out.println("ERROR! OPCIÓN NO VÁLIDA");
                    }
                    break;
            }
        } while (opc!=3);
    }
}
