package org.example;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println("3+2="+calc.sum(2, 3));
        System.out.println("5*2="+calc.mult(5, 2));
        System.out.println("3^4="+calc.pow(3, 4));
    }
}