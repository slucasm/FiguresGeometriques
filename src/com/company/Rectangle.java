package com.company;

public class Rectangle extends Figura{

    private double base;
    private double altura;
    private double area;



    public Rectangle (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getArea()
    {
        this.area = base*altura;
        return area;
    }

}



