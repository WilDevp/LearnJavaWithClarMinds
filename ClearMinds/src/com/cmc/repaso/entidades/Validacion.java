package com.cmc.repaso.entidades;

public class Validacion {
   /*
   Crear una clase Validación, con el método validarMonto

   validarMonto: recive un Monto y retorna true si el monto es mayor que ceri, caso contrario retorna false

   En una clase TestValidacion con main: instaciar un objeto de tipo validación y probar el método validarMonto
    */


    public void validarMonto(double monto){
        if(monto > 0){
            System.out.println("true");
        }else{
            System.out.println("false");

        }
    }

}
