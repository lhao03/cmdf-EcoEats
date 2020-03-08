package com.google.sample.cloudvision;

import java.util.HashMap;
import java.util.Map;

public class FoodEco {

    static double getEmission(String[] food){
        Map<String,Double>  foodDate = new HashMap<>();
        foodDate.put("beef", 6.0);
        foodDate.put("cheese", 21*0.05);
        foodDate.put("chocolate", 19*0.2);
        foodDate.put("tomato", 1.4*0.06);
        foodDate.put("coffee", 17*0.07);
        foodDate.put("pork", 0.1*7);
        foodDate.put("egg", 4.5*0.1);
        foodDate.put("rice", 4*0.2);
        foodDate.put("spaghetti",2.8*0.2);
        foodDate.put("beans",2.0*0.4);
        foodDate.put("salad",0.2*0.1);

        double sum =0.0;
        for(String i :food ){
            if(foodDate.containsKey(removeS(i.toLowerCase()))){
                return foodDate.get(i);
            }
        }
        return sum;
    }

    static String getWater(String[] food) {
        Map<String, Integer> waterMap = new HashMap<>();

        waterMap.put("beef", 1541);
        waterMap.put("cheese", 159);
        waterMap.put("chocolate", 3439);
        waterMap.put("coffee", 140);
        waterMap.put("pork", 598);
        waterMap.put("tomato", 10);
        waterMap.put("egg", 196);
        waterMap.put("rice", 499);
        waterMap.put("spaghetti",370);
        waterMap.put("bean",2200);
        waterMap.put("salad",6);

        int sum = 0;
        for (String item : food) {
            if (waterMap.containsKey(removeS(item.toLowerCase()))) {
                return Integer.toString(waterMap.get(item));
            }
        }

        return Integer.toString(sum);
    }
    static String getTrees(double emission){
        double trees = Math.round(emission/20*10)/10.0;
        return Double.toString(trees);
    }

    static String getKMDriven(Double emission){
        double km = Math.round(emission * 8.9*10)/10.0;
        return Double.toString(km);
    }

    static String removeS(String food){
        if(food.endsWith("s")){
            food = food.substring(0,food.length()-1);
        }
        return food;
    }

}
