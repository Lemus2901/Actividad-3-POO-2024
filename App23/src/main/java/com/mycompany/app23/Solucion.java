package com.mycompany.app23;

public class Solucion {

    public String resolverEcuacionSegundoGrado(double A, double B, double C) {
        double discriminante = B * B - 4 * A * C;
        double x1, x2;
        String resultado;

        if (discriminante > 0) {
            x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            resultado = "La ecuación tiene dos soluciones reales y distintas: x1 = " + x1 + ", x2 = " + x2;
        } else if (discriminante == 0) {
            x1 = -B / (2 * A);
            resultado = "La ecuación tiene una única solución real: x = " + x1;
        } else {
            resultado = "La ecuación no tiene soluciones reales.";
        }

        return resultado;
    }
}