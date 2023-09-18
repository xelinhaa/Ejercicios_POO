package com.campusdual.ejercicio4;

import com.campusdual.ejemplos.alimentos.Food;

//creamos la clase Meal que extiende de Food y a mayores necesita el atributo grams
public class Meal extends Food {

    private Integer grams;
    public static final Integer GRAMS_PER_PORTION = 100;

    //getters y setters de la nueva variable
    public Integer getGrams() {
        return grams;
    }

    public void setGrams(Integer grams) {
        this.grams = grams;
    }


    //constructores (Food + grams)
    public Meal(String name, Integer grams) {
        super(name);
        this.grams = grams;
    }

    public Meal(String name, Integer carbos, Integer fats, Integer proteins, Integer grams) {
        super(name, carbos, fats, proteins);
        this.grams = grams;
    }

    public Integer calculatedCalories() {
        return this.getCalories(this.grams);
    }

    public Integer calculatedCarbos() {
        return this.getCarbos() * this.grams / GRAMS_PER_PORTION;

    }

    public Integer calculatedProteins() {
        return this.getProteins() * this.grams / GRAMS_PER_PORTION;

    }


    public Integer calculatedFats() {
        return this.getFats() * this.grams / GRAMS_PER_PORTION;

    }
}
