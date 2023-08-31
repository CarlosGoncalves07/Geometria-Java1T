package br.senai.sp.model;

public class Exibir {

    public void ExibirTriangulo(Triangulo objTriangulo){

        System.out.println("--- Print ----");
        System.out.println("Base: " + objTriangulo.base);
        System.out.println("Altura: " + objTriangulo.altura);
        System.out.println("Area: " + objTriangulo.area);
        System.out.println("Perimetro: " + objTriangulo.perimetro);
        System.out.println("--------------");


    }

}
