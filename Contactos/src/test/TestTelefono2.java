package test;

import com.cmc.directorio.AdminTelefono;
import com.cmc.directorio.Telefono;

public class TestTelefono2 {
    public static void main(String[] args) {
            Telefono telIf = new Telefono("movi","098234234",20);
            AdminTelefono at = new AdminTelefono();

            at.activarMensajeria(telIf);


        System.out.println(telIf.getOperadora());
        System.out.println( telIf.getNumero());
        System.out.println( telIf.getCodigo());

        System.out.println(telIf.isTieneWhatsapp());




    }
}
