package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void getArea()
    {
        Rectangle r = new Rectangle(2,2);
        double area = r.getArea();
        double esperado = 4;
        assertEquals(esperado,area);
        //assertEquals(4,area);
    }
}