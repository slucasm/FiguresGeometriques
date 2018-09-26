package com.company;

public class Cercle extends Figura{


    private double radius;
    private double area;

    public Cercle (double radius)
    {
        this.radius=radius;
    }

    public double getArea()
    {
        double pi = Math.PI;
        this.area = Math.pow(radius,2)*pi;
        return area;
    }
}
