package br.senai.sp.model;

import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);

    Cadastro objCadastro = new Cadastro();

    Exibir objExibir = new Exibir();

    public void Menu(){
        System.out.println(" --- Sistema Geometria ---");
        System.out.println(" 1 - Triangulo");
        System.out.println("--------------------------");

        int opcao = teclado.nextInt();

        switch (opcao){
            case 1:

                Triangulo objTriangulo = objCadastro.CadastrarTriangulo();
                objTriangulo.CalcularArea();
                objTriangulo.CalcularPerimetro();
                objExibir.ExibirTriangulo(objTriangulo);
                break;

        }


    }

}
