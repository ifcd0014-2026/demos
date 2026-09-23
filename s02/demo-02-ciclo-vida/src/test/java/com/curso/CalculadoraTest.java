package com.curso;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    public void suma() {
        assertEquals(7, calc.sumar(3, 4));
    }

    @Test
    public void resta() {
        assertEquals(4, calc.restar(9, 5));
    }
}
