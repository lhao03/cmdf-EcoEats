package com.google.sample.cloudvision;

import java.util.ArrayList;
import java.util.HashSet;

public class FoodEco {
    private static HashSet<Food> foodList;

    public FoodEco() {
        foodList = new HashSet<>();
        foodList.add(new Food("beef", 6.0,1541,getTrees(6.0), getKMDriven(6.0)));
        foodList.add(new Food("cheese", 6.0,1541,getTrees(6.0), getKMDriven(6.0)));
        foodList.add(new Food("chocolate", 6.0,1541,getTrees(6.0), getKMDriven(6.0)));
        foodList.add(new Food("tomato", 6.0,1541,getTrees(6.0), getKMDriven(6.0)));
        foodList.add(new Food("coffee", 6.0,1541,getTrees(6.0), getKMDriven(6.0)));
        foodList.add(new Food("pork", 6.0,1541,getTrees(6.0), getKMDriven(6.0)));
        foodList.add(new Food("egg", 6.0,1541,getTrees(6.0), getKMDriven(6.0)));
        foodList.add(new Food("rice", 6.0,1541,getTrees(6.0), getKMDriven(6.0)));
        foodList.add(new Food("spaghetti", 6.0,1541,getTrees(6.0), getKMDriven(6.0)));
        foodList.add(new Food("beans", 6.0,1541,getTrees(6.0), getKMDriven(6.0)));
        foodList.add(new Food("salad", 6.0,1541,getTrees(6.0), getKMDriven(6.0)));
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