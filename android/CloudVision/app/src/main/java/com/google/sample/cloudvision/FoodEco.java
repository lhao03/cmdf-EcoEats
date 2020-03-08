package com.google.sample.cloudvision;

import java.util.ArrayList;
import java.util.HashSet;

public class FoodEco {
    private static HashSet<Food> foodList;

    public FoodEco() {
        foodList = new HashSet<>();
        foodList.add(new Food("beef", 7.0,1541,getTrees(7.0), getKMDriven(7.0)));
        foodList.add(new Food("cheese", 21*0.05,159,getTrees(1*0.05), getKMDriven(1*0.05)));
        foodList.add(new Food("chocolate", 19*0.02,3439,getTrees(19*0.02), getKMDriven(19*0.02)));
        foodList.add(new Food("tomato", 1.4*0.06,10,getTrees(1.4*0.06), getKMDriven(1.4*0.06)));
        foodList.add(new Food("coffee", 17*0.07,196,getTrees(17*0.07), getKMDriven(17*0.07)));
        foodList.add(new Food("pork", 4,10,getTrees(4.0), getKMDriven(4.0)));
        foodList.add(new Food("egg", 4.1*0.1,196,getTrees(4.1*0.1), getKMDriven(4.1*0.1)));
        foodList.add(new Food("rice", 4*0.2,499,getTrees(4*0.2), getKMDriven(4*0.2)));
        foodList.add(new Food("spaghetti", 2.8*.02,370,getTrees(2.8*.02), getKMDriven(2.8*.02)));
        foodList.add(new Food("beans", 2*0.4,720,getTrees(2*0.4), getKMDriven(2*0.4)));
        foodList.add(new Food("salad", 0.02*0.2,6,getTrees(0.02*0.2), getKMDriven(0.02*0.2)));
    }

    public Food returnFood(ArrayList<String> parse) {
        for (String string : parse) {
            for (Food food:foodList) {
                if (food.getName().toLowerCase().trim().contains(string.toLowerCase().trim())) {
                    return food;
                }
            }
        }
        return new Food("food",0,0,0,0);
    }

    private static double getTrees(double emission){
        return Math.round(emission/20*10)/10.0;
    }

    private static double getKMDriven(double emission){
        return Math.round(emission * 8.9*10)/10.0;
    }

    static String removeS(String food){
        if(food.endsWith("s")){
            food = food.substring(0,food.length()-1);
        }
        return food;
    }

}

class Food {
    private String name;
    private double emission;
    private double water;
    private double getTrees;
    private double km;

    public Food(String name, double emission, double water, double getTrees, double km) {
        this.name = name;
        this.emission = emission;
        this.water = water;
        this.getTrees = getTrees;
        this.km = km;
    }

    public String getName() {
        return name;
    }

    public double getEmission() {
        return emission;
    }

    public double getWater() {
        return water;
    }

    public double getGetTrees() {
        return getTrees;
    }

    public double getKm() {
        return km;
    }
}