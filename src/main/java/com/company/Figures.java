package com.company;
import java.util.Arrays;

public class Figures
{
    public static double sumaareas(Figura[] vectorfigures){
        double sumaareas=0;
        for (int i = 0; i < vectorfigures.length;i++)
            sumaareas += vectorfigures[i].getArea();
        return sumaareas;
    }

    public static void ordenar (Figura[] vectorfigures){
        Arrays.sort(vectorfigures);
    }
}
