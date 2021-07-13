package com.cmc.repaso.entidades;

public class Producto {
    /*
    Crear una clase Producto con los atributos: nombre, precio
        * Agregar un constructor que reciba el nombre y el precio y los asigne a los atributos
          correspondientes.

        * En el metodo setPrecio, validar que el valor sea positivo, si el valor es negativo,
         colocar el valor multiplicado por -1.

        * Agregar un metodo calcularPrecioPromo, recive el procentaje de descuento y retorna el precio del
        producto aplicado el descuento.

        * En una clase TestProducto probar los metodos setPrecio y calcularPrecioProducto

     */

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double calcularPrecioPromo(double descuento){
         descuento = this.precio * descuento;
        System.out.println(this.nombre + " Tiene " + descuento + " de descuento");
        return descuento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;

      if(this.precio < 0){
          System.out.println( precio + " Es negativo, lo setiamos a positivo");
            this.precio = this.precio * -1;
        }
    }
}
