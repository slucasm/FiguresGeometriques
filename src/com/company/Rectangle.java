package com.company;

public class Rectangle {

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



