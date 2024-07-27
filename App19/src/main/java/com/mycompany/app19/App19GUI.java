package com.mycompany.app19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App19GUI {
    private Calculadora calculadora;
    private JFrame frame;
    private JTextField inputField;
    private JLabel sumaLabel;
    private JLabel promedioLabel;

    public App19GUI() {
        calculadora = new Calculadora();
        frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 1));

        JLabel instructionLabel = new JLabel("Ingrese números para sumar y calcular el promedio. Ingrese 0 para terminar.");
        frame.add(instructionLabel);

        inputField = new JTextField();
        frame.add(inputField);

        JButton addButton = new JButton("Agregar Número");
        frame.add(addButton);

        sumaLabel = new JLabel("Suma total: 0");
        frame.add(sumaLabel);

        promedioLabel = new JLabel("Promedio: 0");
        frame.add(promedioLabel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero = Integer.parseInt(inputField.getText());
                if (numero == 0) {
                    JOptionPane.showMessageDialog(frame, "Programa terminado.");
                    System.exit(0);
                } else {
                    calculadora.agregarNumero(numero);
                    sumaLabel.setText("Suma total: " + calculadora.obtenerSuma());
                    promedioLabel.setText("Promedio: " + calculadora.calcularPromedio());
                    inputField.setText("");
                }
            }
        });

        frame.setVisible(true);
    }


}