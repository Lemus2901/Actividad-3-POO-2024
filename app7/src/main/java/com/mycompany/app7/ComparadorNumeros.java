package com.mycompany.app7;

public class ComparadorNumeros {
    public static String comparar(int A, int B) {
        String resultado;
        if (A > B) {
            resultado = "A es mayor que B";
        } else if (A < B) {
            resultado = "A es menor que B";
        } else {
            resultado = "A es igual a B";
        }
        return resultado;
    }
}