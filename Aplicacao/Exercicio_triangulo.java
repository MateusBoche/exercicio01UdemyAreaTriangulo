package Aplicacao;

import Entidades.Trigangulo;

import java.util.Scanner;

public class Exercicio_triangulo {
    public static void main(String[] args) {
        Exercicio_triangulo app = new Exercicio_triangulo();
        app.start();
    }

    private void start() {
        Trigangulo um = new Trigangulo();
        Trigangulo dois = new Trigangulo();

        um.a = obterValor();
        um.b = obterValor();
        um.c = obterValor();

        dois.a= obterValor();
        dois.b = obterValor();
        dois.c = obterValor();

        System.out.println(um.area());
        System.out.println(dois.area());

    }

    public double obterValor(){
        Scanner scan = new Scanner(System.in);
        double valor = scan.nextDouble();
        return  valor;
    }
}
