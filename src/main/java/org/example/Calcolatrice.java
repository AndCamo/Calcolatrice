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

    public double sottrazione(int a, int b){
        return a-b;
    }

    public double divisione(int a, int b){
        if(b!=0){
            return a/b;
        }
        else return 0;
    }



    private double a, b;
}
