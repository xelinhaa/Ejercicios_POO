package com.campusdual.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        /*
        * crear un programa que con un IF nos indique si un año es bisiesto o no.
        Año bisiesto es el divisible entre 4, salvo que sea año secular
        -último de cada siglo, terminado en «00»-,
        en cuyo caso también ha de ser divisible entre 400
       */

        Integer year;
        System.out.println("Introduzca un año");
        Scanner entrada = new Scanner(System.in);
        year = entrada.nextInt();

        if(year % 4 == 0) {
            if(year % 100 == 0 && year % 400 != 0 ) {
                System.out.println(year + " no es bisiesto.");
            } else {
                System.out.println(year + " es bisiesto");
            }
        } else {
            System.out.println(year + " no es bisiesto.");
        }
    }
}
