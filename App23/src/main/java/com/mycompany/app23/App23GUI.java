package com.mycompany.app23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App23GUI {
    private JFrame frame;
    private JTextField aField;
    private JTextField bField;
    private JTextField cField;
    private JLabel resultadoLabel;

    public App23GUI() {
        frame = new JFrame("Ecuación de Segundo Grado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2));

        frame.add(new JLabel("Valor de A:"));
        aField = new JTextField();
        frame.add(aField);

        frame.add(new JLabel("Valor de B:"));
        bField = new JTextField();
        frame.add(bField);

        frame.add(new JLabel("Valor de C:"));
        cField = new JTextField();
        frame.add(cField);

        JButton calcularButton = new JButton("Calcular");
        frame.add(calcularButton);

        resultadoLabel = new JLabel("Resultado:");
        frame.add(resultadoLabel);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double A = Double.parseDouble(aField.getText());
                double B = Double.parseDouble(bField.getText());
                double C = Double.parseDouble(cField.getText());

                Solucion solucion = new Solucion();
                String resultado = solucion.resolverEcuacionSegundoGrado(A, B, C);
                resultadoLabel.setText(resultado);
            }
        });

        frame.setVisible(true);
    }


}