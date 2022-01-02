/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {

        int fila;
        int col;
        String cadena = "";
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };

        for (fila = 0; fila < estudiantes.length; fila++) {

            for (col = 0; col < estudiantes[fila].length; col++) {

                if (estudiantes[fila][col].length() == 11) {
                    

                    cadena = String.format("%s%s\n", cadena,
                            estudiantes[fila][col]);

                }
            }
        }
        System.out.println(cadena);
    }

}
