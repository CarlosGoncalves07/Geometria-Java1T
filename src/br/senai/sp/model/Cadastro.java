package br.senai.sp.model;

import java.util.Scanner;

public class Cadastro {

    /** Instancia Teclado */
    Scanner teclado = new Scanner(System.in);

    /** Instancia Triangulo */
    Triangulo objTriangulo = new Triangulo();

    public Triangulo CadastrarTriangulo(){
        System.out.println("--- Triangulo ---");
        System.out.println("Informe a Base: ");
        objTriangulo.base = teclado.nextDouble();
        System.out.println("Informe a Altura: ");
        objTriangulo.altura = teclado.nextDouble();
        System.out.println("------------------");

        return objTriangulo;

    }


}
