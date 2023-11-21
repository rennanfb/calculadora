package br.com.alura.calculadora.modelos;

public class Calculo {
    public double valorA;
    public double valorB;
    public double resultado = 0;


    public void soma (double x, double y) {
        this.resultado = x + y;
    }

    public void subtrai (double x, double y) {
        this.resultado = x - y;
    }

    public void multiplica (double x, double y) {
        this.resultado = x * y;
    }

    public void divide (double x, double y) {
        this.resultado = x / y;
    }
}
