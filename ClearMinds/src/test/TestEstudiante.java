package test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {
    public static void main(String... args) {

        Estudiante estudiante = new Estudiante("Wilmar");

        estudiante.calificar(8.0);

    }
}
