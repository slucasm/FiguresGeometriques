package com.company;

public class Triangle extends Figura{

    private double base;
    private double altura;
    private double area;

    public Triangle (double base,double altura){

        this.base = base;
        this.altura = altura;
    }

    public double getArea ()
    {
        this.area = (base*altura)/2;
        return area;
    }

}
