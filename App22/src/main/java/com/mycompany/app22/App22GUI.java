package com.mycompany.app22;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
        frame.setLayout(new GridLayout(6, 2));

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

        resultadoLabel = new JLabel("Salario: ");
        frame.add(resultadoLabel);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double salarioPorHora = Double.parseDouble(salarioPorHoraField.getText());
                    double horasTrabajadas = Double.parseDouble(horasTrabajadasField.getText());
                    double salario = salarioPorHora * horasTrabajadas;
                    resultadoLabel.setText("Salario: " + salario + "\n" + "Nombre: " + nombreField.getText());
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Por favor, ingrese valores numéricos válidos.");
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App22GUI();
    }
}