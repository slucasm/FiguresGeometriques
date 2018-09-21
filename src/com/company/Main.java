package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Quadrat q1 = new Quadrat(5);
        Triangle t1 = new Triangle(2,3);
        Cercle c1 = new Cercle (2);
        Rectangle r1 = new Rectangle(2,2);


        System.out.print(q1.getArea()+"\n");
        System.out.print(t1.getArea()+"\n");
        System.out.print(c1.getArea()+"\n");
        System.out.print(r1.getArea()+"\n");

        Figura[] f = new Figura[4];
        f[1]=q1;
        f[2]=t1;
        f[3]= c1;
        f[4]=r1;






    }
}
