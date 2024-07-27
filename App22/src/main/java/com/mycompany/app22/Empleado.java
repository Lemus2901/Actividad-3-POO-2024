package com.mycompany.app22;

class Empleado {
    String nombre;
    double salarioPorHora;
    int horasTrabajadas;

    public Empleado(String nombre, double salarioPorHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalarioMensual() {
        return salarioPorHora * horasTrabajadas;
    }

    public void mostrarInformacion() {
        double salarioMensual = calcularSalarioMensual();
        if (salarioMensual > 450000) {
            System.out.println("Nombre: " + nombre + ", Salario Mensual: $" + salarioMensual);
        } else {
            System.out.println("Nombre: " + nombre);
        }
    }
}