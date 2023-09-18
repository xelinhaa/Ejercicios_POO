package com.campusdual.ejemplos.alimentos;

public class FoodUtility {
    public static void main(String[] args) {

        //crear una zanahoria
        Food zanahoria = new Food("zanahoria", 12,0,1);
        System.out.println("100gr. de zanahoria = " + zanahoria.getCalories(100) + " calorías");

        Food arroz = new Food("arroz", 0, 5,2);
        System.out.println("100gr. de arroz = " + arroz.getCalories(100) + " calorías");

        Food berenjena = new Food("berenjena", 5,9,1);
        System.out.println("100gr. de berenjena = " + berenjena.getCalories(100) + " calorías");

        Food lubina = new Food("lubina", 1,4,8);
        System.out.println("100gr. de lubina = " + lubina.getCalories(100) + " calorías");

        Food lechuga = new Food("lechuga");
        lechuga.setCarbos(1);
        lechuga.setFats(0);
        lechuga.setProteins(0);
        System.out.println("100gr. de lechuga = " + lechuga.getCalories(100) + " calorías");

        System.out.println("El número de calorías x 100gr. de los siguientes alimentos son: \n" +
                " · zanahoria = " + zanahoria.getCalories(100) +
                "\n · arroz = " + arroz.getCalories(100) +
                "\n · berenjena = " + berenjena.getCalories(100) +
                "\n · lubina = " + lubina.getCalories(100)) ;

        //en este caso, hemos creado en la clase Food el método estático getCalories.
        //lo que conseguimos creando un método estático que nos permite usarlo desde fuera
        //sin instanciarlo. El método getCalories público sí necesita ser instanciado porque
        //necesitamos leer sus atributos de la clase donde ha sido creado para utilizarlos en otra
        //y con un método static no pasa esto, se utiliza en cualquier clase sin instanciar

        System.out.println("100 gr. de patatas fritas tienen: " +
                Food.getCalories(100, 20,8,2) + " calorías");
        //el método getCalories es, en realidad, una fórmula matemática invariable, por eso,
        // crear este método static es más eficiente que hacerlo public
    }
}
