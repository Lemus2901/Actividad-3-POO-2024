package com.mycompany.figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FigurasGUI extends JFrame {
    private JTextField radioCirculoField, baseRectanguloField, alturaRectanguloField, ladoCuadradoField, baseTrianguloField, alturaTrianguloField;
    private JTextArea resultArea;

    public FigurasGUI() {
        setTitle("Calculadora de Figuras");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 2));

        // Campos para el círculo
        add(new JLabel("Radio del círculo:"));
        radioCirculoField = new JTextField();
        add(radioCirculoField);

        // Campos para el rectángulo
        add(new JLabel("Base del rectángulo:"));
        baseRectanguloField = new JTextField();
        add(baseRectanguloField);
        add(new JLabel("Altura del rectángulo:"));
        alturaRectanguloField = new JTextField();
        add(alturaRectanguloField);

        // Campos para el cuadrado
        add(new JLabel("Lado del cuadrado:"));
        ladoCuadradoField = new JTextField();
        add(ladoCuadradoField);

        // Campos para el triángulo
        add(new JLabel("Base del triángulo:"));
        baseTrianguloField = new JTextField();
        add(baseTrianguloField);
        add(new JLabel("Altura del triángulo:"));
        alturaTrianguloField = new JTextField();
        add(alturaTrianguloField);

        // Botón para calcular
        JButton calcularButton = new JButton("Calcular");
        add(calcularButton);

        // Área de resultados
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea));

        // Acción del botón
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularFiguras();
            }
        });
    }

    private void calcularFiguras() {
        StringBuilder resultados = new StringBuilder();

        // Círculo
        double radioCirculo = Double.parseDouble(radioCirculoField.getText());
        Circulo figura1 = new Circulo(radioCirculo);
        resultados.append("El área del círculo es = ").append(figura1.calcularArea()).append("\n");
        resultados.append("El perímetro del círculo es = ").append(figura1.calcularPerimetro()).append("\n\n");

        // Rectángulo
        double baseRectangulo = Double.parseDouble(baseRectanguloField.getText());
        double alturaRectangulo = Double.parseDouble(alturaRectanguloField.getText());
        Rectangulo figura2 = new Rectangulo(baseRectangulo, alturaRectangulo);
        resultados.append("El área del rectángulo es = ").append(figura2.calcularArea()).append("\n");
        resultados.append("El perímetro del rectángulo es = ").append(figura2.calcularPerimetro()).append("\n\n");

        // Cuadrado
        double ladoCuadrado = Double.parseDouble(ladoCuadradoField.getText());
        Cuadrado figura3 = new Cuadrado(ladoCuadrado);
        resultados.append("El área del cuadrado es = ").append(figura3.calcularArea()).append("\n");
        resultados.append("El perímetro del cuadrado es = ").append(figura3.calcularPerimetro()).append("\n\n");

        // Triángulo
        double baseTriangulo = Double.parseDouble(baseTrianguloField.getText());
        double alturaTriangulo = Double.parseDouble(alturaTrianguloField.getText());
        TrianguloRectangulo figura4 = new TrianguloRectangulo(baseTriangulo, alturaTriangulo);
        resultados.append("El área del triángulo es = ").append(figura4.calcularArea()).append("\n");
        resultados.append("El perímetro del triángulo es = ").append(figura4.calcularPerimetro()).append("\n");
        figura4.determinarTipoTriangulo();

        resultArea.setText(resultados.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FigurasGUI().setVisible(true);
            }
        });
    }
}