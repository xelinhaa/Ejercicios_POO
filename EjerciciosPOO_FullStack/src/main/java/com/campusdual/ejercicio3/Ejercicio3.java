package com.campusdual.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        /*
        * Utilizando SWITCH escribir un programa que revise un número
        * y diga si es primo o no. El número tiene que estar entre 1 y 20
        */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número entre 1 y 20: ");
        Integer num;
        num = entrada.nextInt();

        switch (num) {
            case 2:
            case 3:
            case 5:
            case 7:
            case 11:
            case 13:
            case 17:
            case 19:
                System.out.println(num + " es primo.");
                break;
            default:
                System.out.println(num + " no es primo.");
                break;




        }


    }
}
