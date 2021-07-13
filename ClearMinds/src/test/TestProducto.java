package test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {
    public static void main(String... args) {
        double descuento;
        double precio = -3000;

        Producto producto = new Producto("Arroz", precio);

        producto.setPrecio(precio);

        descuento = .10;

        producto.calcularPrecioPromo(descuento);

    }
}
