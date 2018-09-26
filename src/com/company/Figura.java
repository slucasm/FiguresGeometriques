package com.company;

abstract public class Figura implements Comparable<Figura>{
    abstract public double getArea();

    public int compareTo (Figura fig){
        if(fig.getArea()<=this.getArea())
            return 0;
        else
            return -1;
    }
}