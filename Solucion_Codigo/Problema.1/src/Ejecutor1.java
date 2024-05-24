
import java.util.Scanner;

public class Ejecutor1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        CarritoDeCompras carrito = new CarritoDeCompras();
       
        Producto producto1 = new Producto("Camiseta", 25.99, 20);
        Producto producto2 = new Producto("Pantalón", 39.99, 15);

        System.out.println("Bienvenido a la tienda. ¿Qué desea comprar?");
        System.out.println("1. Camiseta");
        System.out.println("2. Pantalón");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        System.out.print("Ingrese la cantidad que desea comprar: ");
        int cantidad = scanner.nextInt();

        switch (opcion) {
            case 1:
                carrito.agregarProducto(producto1, cantidad);
                break;
            case 2:
                carrito.agregarProducto(producto2, cantidad);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        if (carrito.numProductos > 0) {
            double total = carrito.calcularTotal();
            System.out.println("Total a pagar: $" + total);

            System.out.print("Ingrese el monto pagado: ");
            double montoPagado = scanner.nextDouble();

            if (montoPagado >= total) {
                System.out.println("Pago realizado con éxito. Gracias por su compra!");
            } else {
                System.out.println("Monto insuficiente. Faltan: $" + (total - montoPagado));
            }

            System.out.println("Detalle de la compra:");
            carrito.mostrarDetalleCompra();
        } else {
            System.out.println("No se realizó ninguna compra debido a la falta de stock.");
        }

        scanner.close();
    }
}
