package com.cmc.directorio;

public class AdminTelefono {




    public void activarMensajeria(Telefono telefono){
        if (telefono.getOperadora().equals("movi")){
            telefono.setTieneWhatsapp(true);
        }
    }
}
