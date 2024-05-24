public class CarritoDeCompras {
    public Producto[] productos;
    public int numProductos;
    public double totalCompra;

    public CarritoDeCompras() {
        this.productos = new Producto[5];
        this.numProductos = 0;
        this.totalCompra = 0;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (producto.getCantidad() >= cantidad) {
            productos[numProductos] = new Producto(producto.getNombre(), producto.getPrecio(), cantidad);
            producto.setCantidad(producto.getCantidad() - cantidad);
            totalCompra += producto.getPrecio() * cantidad;
            numProductos++;
        } else {
            System.out.println("No hay suficiente cantidad disponible para el producto: " + producto.getNombre());
        }
    }

    public double calcularTotal() {
        return totalCompra;
    }

    public void realizarPago(double montoPagado) {
        if (montoPagado >= totalCompra) {
            if (totalCompra > 1000) {
                double descuento = 0.10; // 10% de descuento
                totalCompra -= totalCompra * descuento;
            }
            System.out.println("Pago realizado con éxito. Gracias por su compra!");
        } else {
            System.out.println("Monto insuficiente. Faltan: $" + (totalCompra - montoPagado));
        }
    }

    public void mostrarDetalleCompra() {
        for (int i = 0; i < numProductos; i++) {
            System.out.println(productos[i]);
        }
    }
}

