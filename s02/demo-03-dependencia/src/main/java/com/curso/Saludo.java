package com.curso;

import org.apache.commons.lang3.StringUtils;

public class Saludo {

    public String saludar(String nombre) {
        String formateado = StringUtils.capitalize(nombre.toLowerCase());
        return "Hola, " + formateado + "!";
    }
}
