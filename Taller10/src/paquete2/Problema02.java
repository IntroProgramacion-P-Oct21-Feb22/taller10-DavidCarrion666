/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double[][] ventas = new double[2][5];
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double valorIngresado;
        double suma = 0;
        String cadena = "";

        System.out.println("Ingreso de datos de los vendedores");

        for (int f = 0; f < ventas.length; f++) {
            for (int c = 0; c < ventas[f].length; c++) {
                System.out.printf("Ingrese valor para la posición [%d][%d]\t:",
                        f, c);
                valorIngresado = entrada.nextDouble();
                ventas[f][c] = valorIngresado;
                suma = suma + valorIngresado;
            }           
            cadena = String.format("%sVendedor(a) %s\n",
                    cadena,
                    vendedores[f]);

        }
        System.out.printf(cadena + "Han realizado un total de %.2f$ en ventas\n",
                suma);
    }
}
