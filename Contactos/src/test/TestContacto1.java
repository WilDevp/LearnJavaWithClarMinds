package test;

import com.cmc.directorio.Contacto;
import com.cmc.directorio.Telefono;

public class TestContacto1 {
    public static void main(String ... args) {
        Telefono telef = new Telefono("movi","3107441733",60);
        Contacto c = new Contacto("Wilmar","Garcia",telef,40.0);
    }
}
