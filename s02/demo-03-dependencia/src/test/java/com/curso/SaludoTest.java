package com.curso;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SaludoTest {

    private final Saludo saludo = new Saludo();

    @Test
    public void mayusculas() {
        assertEquals("Hola, Juan!", saludo.saludar("JUAN"));
    }

    @Test
    public void minusculas() {
        assertEquals("Hola, María!", saludo.saludar("maría"));
    }
}
