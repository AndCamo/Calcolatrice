package org.example;

public class Calcolatrice {

    public Calcolatrice(){
        this.a = 0;
        this.b = 0;
    }

    public double sum(double a, double b){
        return a + b;
    }

    public double multiplication(double a, double b){
        return a * b;
    }

    public double subtraction(double a, double b){
        return a - b;
    }

    public double division(double a,double b){
        double result = 0;
        try{
            result = a / b;
        }catch (ArithmeticException e){
            System.out.println("Infinity");
        }
        return result;
    }

    private double a, b;
}
