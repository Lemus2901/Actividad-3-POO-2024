/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author Administrator
 */
public class TrianguloRectangulo {
    public double base; 
    public double altura; 

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura / 2);
    }

    public double calcularPerimetro() {
        return (base + altura + calcularHipotenusa());
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public void determinarTipoTriangulo() {
        if (base == altura && base == calcularHipotenusa() && altura == calcularHipotenusa())
            System.out.println("Es un triángulo equilátero"); 
        else if (base != altura && base != calcularHipotenusa() && altura != calcularHipotenusa())
            System.out.println("Es un triángulo escaleno"); 
        else
            System.out.println("Es un triángulo isósceles"); 
}
}