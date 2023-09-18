package com.campusdual.ejercicio4;

import com.campusdual.ejemplos.alimentos.Food;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainDiet {

    private Diet diet;
    private List<Food> foodList;


    public MainDiet() {
        this.foodList = new ArrayList<>();
    }

    public void showSiteMenu() {
        Scanner kBoard = new Scanner(System.in); //entrada por teclado
        Integer option = null;
        System.out.println("*********************************************");
        System.out.println("_____________ Programa de Dietas _____________");
        System.out.println("*********************************************");
        do {
            System.out.println("1. Crear/reiniciar dieta");
            System.out.println("2. Agrega alimentos a tu Dieta");
            System.out.println("3. Información nutricional de tu Dieta");
            System.out.println("4. Salir");
            System.out.println("====================================================");
            System.out.println("Selecciona una opción:");

            option = kBoard.nextInt();

            switch (option) {
                case 1: //crea tu dieta
                    createMenu();
                    break;
                case 2: //agrega alimentos
                    //addFoodMenu();
                    break;
                case 3: //consulta la info nutricional de tu Dieta(calorías y macronutrientes)
                    showDietInfo();
                    break;
                case 4://Salir
                    System.out.println("Gracias por utilizar el programa de gestión de dietas");
                    break;
            }


        } while (option != 4);

    }

    private void createMenu() {
//        -1. Crear/reiniciar dieta: crea o reemplaza la dieta inicial
//                -a. Sin limite
//                -b. Por calorías
//                -c. Por macronutrientes
//                -d. Por datos personales
        Scanner kBoard = new Scanner(System.in);
        Integer option = null;
        System.out.println("*************************************************");
        System.out.println("_____________ Crear/Reiniciar Dieta _____________");
        System.out.println("*************************************************");
        System.out.println("Selecciona el tipo de Dieta");
        System.out.println("1. Dieta sin límite de calorías");
        System.out.println("2. Dieta por calorías");
        System.out.println("3. Dieta por macronutrientes");
        System.out.println("4. Dieta por datos personales");

        option = kBoard.nextInt();
        switch (option) {
            case 1:
                this.diet = new Diet();
                System.out.println("Iniciada Dieta sin limite de calorías");
                break;
            case 2:
                System.out.println("***********************************");
                System.out.println("___ Iniciada Dieta por calorías ___");
                System.out.println("***********************************");
                System.out.println("Introduzca número de calorias");

                Integer calories = kBoard.nextInt();
                this.diet = new Diet(calories);
                System.out.println("Se ha creado una Dieta con " + calories + "calorías");
            case 3:
                System.out.println("******************************************");
                System.out.println("___ Iniciada Dieta por macronutrientes ___");
                System.out.println("******************************************");
                System.out.println(" ____________ Carbohidratos ____________ ");
                Integer carbs = kBoard.nextInt();
                System.out.println("carbohidratos:");

        }

    }

    private void showDietInfo() {
        System.out.println("*********************************************");
        System.out.println("____ Información nutricional de la Dieta ____");
        System.out.println("*********************************************");
        System.out.println("El número máximo de calorías es  " + this.diet.getMaxCalories());
        //System.out.println("Los alimentos de la dieta son los siguientes: " + this.diet.());
    }




}



