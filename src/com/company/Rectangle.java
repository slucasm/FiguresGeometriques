package com.company;

public class Rectangle extends Figuras{

    public double base;
    public double altura;

    public Rectangle (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getArea() {
        return base*altura;
    }

}



