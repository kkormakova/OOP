package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vend vm = new Vend();
        List<BottleWater> bottles = new ArrayList<>(Arrays.asList(new BottleWater("pepsi", 42),
                new BottleWater("chocolate", 67), new BottleWater("cola", 42), new BottleWater("cola", 70)));
        vm.initProduct(bottles);
        System.out.println(vm.getProduct("cola", 80));
        VendHot vmHot = new VendHot();
        List<HotDrink> drinks = new ArrayList<>(Arrays.asList(new HotDrink("cappuccino", 55, 80, 150),
                new HotDrink("americano", 45, 70, 120), new HotDrink("latte", 65, 100, 195),
                new HotDrink("flat white", 60, 85, 155), new HotDrink("doppio", 45, 70, 110)));
        vmHot.initProduct(drinks);
        System.out.println(vmHot.getProduct("americano", 70, 120));
    }
}