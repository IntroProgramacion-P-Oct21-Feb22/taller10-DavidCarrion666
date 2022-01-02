/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double[][] datos = new double[2][2];
        double datoIngresado;

        System.out.println("Ingreso de datos");

        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos[f].length; c++) {
                System.out.printf("Ingrese valor para la posición [%d][%d]\t:",
                        f, c);
                datoIngresado = entrada.nextDouble();
                datos[f][c] = datoIngresado;

            }
        }
    }
}
