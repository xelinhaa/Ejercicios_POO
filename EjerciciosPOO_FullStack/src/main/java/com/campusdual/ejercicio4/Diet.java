package com.campusdual.ejercicio4;

import com.campusdual.ejemplos.alimentos.Food;

import java.util.ArrayList;
import java.util.List;

/*
* Escribe una clase dieta, que teniendo en cuenta una serie de alimentos,
* vaya sumando cantidades en gramos y calcule cuantas calorías, carbohidratos,
* proteinas y grasas genera la ingesta

* La clase dieta tiene que tener las siguientes funcionalidades:
	    -Diet(): crea una dieta sin límite de calorías

	    -Diet(Integer maxCalories): crea una dieta con un máximo de calorías,
	    en cuanto se supera ese máximo cuando se adjunta un alimento se despliega un error

	    -Diet(Integer maxFats, Integer maxCarbs, Integer maxProtein): crea una dieta con un
	    máximo de estos tres valores, si se supera alguno de ellos cuando se adjunta un alimento
	    se indicara qué nutriente y desplegará un error

	    -Diet(Boolean women, Integer age, Integer height, Integer weight):
	     Calcula el metabolismo basal de la persona y lo asigna como máximo de calorías en la dieta
		--CALCULAR METABOLISMO BASAL
			E = edad
			A = altura en centímetros
			P = peso en kilos

			Fórmula Hombres: TMB = 10P + 6,25A – 5E + 5
			Fórmula Mujeres: TMB = 10P + 6,25A – 5E – 161

	-addFood(Food,Integer): agrega un alimento y una cantidad en gramos
	-getTotalCalories(): devuelve el total de calorías
	-getTotalCarbs(): devuelve el total de carbohidratos
	-getTotalFats(): devuelve el total de grasas
	-getTotalProtein(): devuelve el total de proteinas

______________________________________________________________________________
 /*Escribe una clase dieta, que teniendo en cuenta una serie de alimentos,
 vaya sumando cantidades en gramos y calcule cuantas calorías, carbohidratos,
 proteinas y grasas genera la ingesta
 */
public class Diet {
    private Integer maxCalories;
    private Integer maxFats;
    private Integer maxCarbs;
    private Integer maxProtein;
    private Integer totalCalories;
    private Integer totalFats;
    private Integer totalCarbs;
    private Integer totalProteins;
    private List<Meal> meals;

    //constructores clase Diet
    public Diet() {
        this.meals = new ArrayList<>();
    }

    public Diet(Integer maxCalories) {
        this.maxCalories = maxCalories;
        this.meals = new ArrayList<>();
    }

    public Diet(Integer maxFats, Integer maxCarbs, Integer maxProtein) {
        this.maxFats = maxFats;
        this.maxCarbs = maxCarbs;
        this.maxProtein = maxProtein;
        this.meals = new ArrayList<>();
    }

    /*Calcula el metabolismo basal de la persona y lo asigna como máximo de calorías en la dieta
		--CALCULAR METABOLISMO BASAL
            E = edad
            A = altura en centímetros
            P = peso en kilos
    Fórmula Hombres: TMB = 10P + 6,25A – 5E + 5
    Fórmula Mujeres: TMB = 10P + 6,25A – 5E – 161
    */

    public Diet(Boolean women, Integer age, Integer height, Integer weight) {
        if (women) {
            maxCalories = (int) ((10 * weight) + (6.25 * height)) - (5 * age) - 161;
        } else {
            maxCalories = (int) ((10 * weight) + (6.25 * height)) - (5 * age) + 5;
        }
        this.meals = new ArrayList<>();
    }

    /*
     métodos:
    -addFood(Food,Integer): agrega un alimento y una cantidad en gramos
	-getTotalCalories(): devuelve el total de calorías
	-getTotalCarbs(): devuelve el total de carbohidratos
	-getTotalFats(): devuelve el total de grasas
	-getTotalProtein(): devuelve el total de proteinas
	*/

    public void addFood(Food food, Integer grams) {

    }

    public Integer getTotalCalories() {
        Integer allCalories = 0;
        for (Meal meal : meals) {
            allCalories = allCalories + meal.calculatedCalories();
        }
        return allCalories;
    }

    public Integer getTotalCarbs() {
        Integer allCarbos = 0;
        for (Meal meal : meals) {
            allCarbos = allCarbos + meal.calculatedCarbos();
        }
        return allCarbos;
    }

    public Integer getTotalFats() {
        Integer allFats = 0;
        for (Meal meal : meals) {
            allFats = allFats + meal.calculatedFats();
        }
        return allFats;
    }

    public Integer getTotalProtein() {
        Integer allProtein = 0;
        for (Meal meal : meals) {
            allProtein = allProtein + meal.calculatedProteins();
        }
        return allProtein;
    }

    //getters y setters
    public Integer getMaxCalories() {
        return maxCalories;
    }

    public void setMaxCalories(Integer maxCalories) {
        this.maxCalories = maxCalories;
    }

    public Integer getMaxFats() {
        return maxFats;
    }

    public void setMaxFats(Integer maxFats) {
        this.maxFats = maxFats;
    }

    public Integer getMaxCarbs() {
        return maxCarbs;
    }

    public void setMaxCarbs(Integer maxCarbs) {
        this.maxCarbs = maxCarbs;
    }

    public Integer getMaxProtein() {
        return maxProtein;
    }

    public void setMaxProtein(Integer maxProtein) {
        this.maxProtein = maxProtein;
    }

    public void setTotalCalories(Integer totalCalories) {
        this.totalCalories = totalCalories;
    }

    public void setTotalFats(Integer totalFats) {
        this.totalFats = totalFats;
    }

    public void setTotalCarbs(Integer totalCarbs) {
        this.totalCarbs = totalCarbs;
    }

    public Integer getTotalProteins() {
        return totalProteins;
    }

    public void setTotalProteins(Integer totalProteins) {
        this.totalProteins = totalProteins;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }
}
