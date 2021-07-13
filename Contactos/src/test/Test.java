package test;


import com.cmc.directorio.Telefono;

public class Test {
    public static void main(String ... args) {


        Telefono telIf = new Telefono("movi","09941234123",10);

        System.out.println(telIf.getOperadora());
        System.out.println( telIf.getNumero());
        System.out.println( telIf.getCodigo());



    }
}
