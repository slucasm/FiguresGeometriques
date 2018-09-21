package com.company;

public class Cercle {


    public double radius;

    public Cercle (double radius){
        this.radius=radius;
    }

    public double getArea(){

        double pi = Math.PI;
        return pi * Math.pow(radius,2);
    }
}
