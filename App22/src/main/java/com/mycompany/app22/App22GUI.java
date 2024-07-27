package com.mycompany.app22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App22GUI {
    private JFrame frame;
    private JTextField nombreField;
    private JTextField salarioPorHoraField;
    private JTextField horasTrabajadasField;
    private JLabel resultadoLabel;

    public App22GUI() {
        frame = new JFrame("Empleado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2));

        frame.add(new JLabel("Nombre del empleado:"));
        nombreField = new JTextField();
        frame.add(nombreField);

        frame.add(new JLabel("Salario por hora:"));
        salarioPorHoraField = new JTextField();
        frame.add(salarioPorHoraField);

        frame.add(new JLabel("Horas trabajadas en el mes:"));
        horasTrabajadasField = new JTextField();
        frame.add(horasTrabajadasField);

        JButton calcularButton = new JButton("Calcular Salario");
        frame.add(calcularButton);

        resultadoLabel = new JLabel("Resultado:");
        frame.add(resultadoLabel);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                double salarioPorHora = Double.parseDouble(salarioPorHoraField.getText());
                int horasTrabajadas = Integer.parseInt(horasTrabajadasField.getText());

                Empleado empleado = new Empleado(nombre, salarioPorHora, horasTrabajadas);
                double salarioMensual = empleado.calcularSalarioMensual();
                if (salarioMensual > 450000) {
                    resultadoLabel.setText("Nombre: " + nombre + ", Salario Mensual: $" + salarioMensual);
                } else {
                    resultadoLabel.setText("Nombre: " + nombre);
                }
            }
        });

        frame.setVisible(true);
    }
}