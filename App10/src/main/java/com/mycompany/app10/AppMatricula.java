/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app10;

/**
 *
 * @author pipe
 */

public class AppMatricula {
    private int numeroInscripcion;
    private String nombres;
    private double patrimonio;
    private int estratoSocial;
    private double pagoMatricula;

    // Constructor
    public AppMatricula(int numeroInscripcion, String nombres, double patrimonio, int estratoSocial, double pagoMatricula) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estratoSocial = estratoSocial;
        this.pagoMatricula = pagoMatricula;

        // Lógica para calcular el pago de matrícula
        if (this.patrimonio > 2000000 && this.estratoSocial > 3) {
            this.pagoMatricula += this.pagoMatricula * 0.10; // Incrementa en 10%
        }
    }

    // Getters and Setters (optional, if needed)
    public int getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public void setNumeroInscripcion(int numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }

    public int getEstratoSocial() {
        return estratoSocial;
    }

    public void setEstratoSocial(int estratoSocial) {
        this.estratoSocial = estratoSocial;
    }

    public double getPagoMatricula() {
        return pagoMatricula;
    }

    public void setPagoMatricula(double pagoMatricula) {
        this.pagoMatricula = pagoMatricula;
    }
}