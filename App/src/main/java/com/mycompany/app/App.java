/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//ejercicio 18
package com.mycompany.app;
import java.util.Scanner;

/**
 *
 * @author pipe
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        IApp iapp = new IApp();
        iapp.setVisible(true);
        iapp.setLocationRelativeTo(null);


    }
}