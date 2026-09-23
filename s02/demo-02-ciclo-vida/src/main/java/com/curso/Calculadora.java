package com.curso;

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("3 + 4 = " + calc.sumar(3, 4));
        System.out.println("9 - 5 = " + calc.restar(9, 5));
    }
}
