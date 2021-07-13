package com.cmc.repaso.entidades;

public class Estudiante {
    /*
    Cear una clase Estdiante con los atributos nombre de tipo String,
    nota de tipo double y resultado de tipo String.
    Agregar un constructor que reciva nombre y lo asigne al atributo correspondiente
    Agregar un método calificar, que recive una nota y no retorna nada, con el siguiente comportamiento:
        Asignar el valor al atributo nota y ademas si la nota es menor a 8 asignar F al resultado, si es
        mayor o igual a 8 asignar A.

   En una clase TestEstudiante probar el comportamiento del método calificar.
     */


    private String nombre;
    private double nota;
    private String resultado;

    public Estudiante(String nombre){
        this.nombre = nombre;
    }

    public void calificar(double nota){
        this.nota = nota;
        
        if (this.nota < 8 ){
            this.resultado = "F";
            System.out.println(this.nombre + " " +  this.resultado);
        }else if(this.nota >= 8){
            this.resultado = "A";
            System.out.println(this.nombre + " " + this.resultado);
        }
    }
}
