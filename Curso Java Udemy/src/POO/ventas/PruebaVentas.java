package POO.ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de ventas ***");
        Producto pr1=new Producto("Blusa", 30.00);
        Producto pr2=new Producto("Zapatos", 50.00);
    
        // Primera Orden
        Orden orden1=new Orden();
        orden1.agregarProducto(pr1);
        orden1.agregarProducto(pr2);
        System.out.println(orden1);
        //orden1.mostrarOrden();
    
        // Segunda Orden
        Orden orden2=new Orden();
        orden2.agregarProducto(new Producto("Playera", 15.00));
        orden2.agregarProducto(pr1);
        orden2.agregarProducto(pr2);
        System.out.println(orden2);
        //orden2.mostrarOrden();
    }
}
