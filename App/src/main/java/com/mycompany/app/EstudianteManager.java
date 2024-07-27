/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

/**
 *
 * @author pipe
 */


public class EstudianteManager {
    public static class Result {
        public double totalCredits;
        public double creditAverage;

        public Result(double totalCredits, double creditAverage) {
            this.totalCredits = totalCredits;
            this.creditAverage = creditAverage;
        }
    }

    public Result procesarEstudiantes(int studentCode, double credits1, double credits2, double credits3, double credits4,
                                      double grade1, double grade2, double grade3, double grade4) {
        double totalCredits = credits1 + credits2 + credits3 + credits4;
        double creditAverage = (grade1 * credits1 + grade2 * credits2 + grade3 * credits3 + grade4 * credits4) / totalCredits;
        return new Result(totalCredits, creditAverage);
    }
}
