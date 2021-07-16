package com.cmc.directorio;

public class AdminTelefono {




    public void activarMensajeria(Telefono telefono){
        if (telefono.getOperadora().equals("movi")){
            telefono.setTieneWhatsapp(true);
        }
    }

    public int contarMovil(Telefono telefono, Telefono  telefono2, Telefono telefono3){

        Telefono [] telefonos = {telefono, telefono2, telefono3};
        int contarMovi = 0;

        for (int i = 0; i < telefonos.length; i++){
            if (telefonos[i].getOperadora().equals("movi")){
                contarMovi++;
            }
        }
        return contarMovi;
    }


    public int contarClaro(Telefono telefono, Telefono  telefono2, Telefono telefono3, Telefono telefono4){

        Telefono [] telefonos = {telefono, telefono2, telefono3, telefono4};
        int contarClaro = 0;

        for (int i = 0; i < telefonos.length; i++){
            if (telefonos[i].getOperadora().equals("claro")){
                contarClaro++;
            }
        }
        return contarClaro;
    }

}
