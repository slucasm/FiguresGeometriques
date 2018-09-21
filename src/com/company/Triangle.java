package com.company;

public class Triangle extends Figuras{

    public double base;
    public double altura;

    public Triangle (double base,double altura){

        this.base = base;
        this.altura = base;
    }

    public double getArea (){
        return (base*altura)/2;
    }
}
