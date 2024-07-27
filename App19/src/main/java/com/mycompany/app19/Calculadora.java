package com.mycompany.app19;

class Calculadora {
    private int suma = 0;
    private int contador = 0;

    public void agregarNumero(int numero) {
        suma += numero;
        contador++;
    }

    public int obtenerSuma() {
        return suma;
    }

    public double calcularPromedio() {
        if (contador > 0) {
            return (double) suma / contador;
        } else {
            return 0;
        }
    }
}