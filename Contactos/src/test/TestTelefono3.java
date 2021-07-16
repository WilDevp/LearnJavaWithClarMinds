package test;

import com.cmc.directorio.AdminTelefono;
import com.cmc.directorio.Telefono;

public class TestTelefono3 {
    public static void main(String ... args) {
        Telefono telefono = new Telefono("movi","3107441733",30);
        Telefono telefono2 = new Telefono("movi","310741733",40);
        Telefono telefono3 = new Telefono("claro","31041733",50);

        AdminTelefono adminTelefono = new AdminTelefono();



        System.out.println(adminTelefono.contarMovil(telefono, telefono2, telefono3));

    }
}
