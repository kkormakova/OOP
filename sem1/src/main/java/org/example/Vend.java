package org.example;

import java.util.ArrayList;
import java.util.List;

public class Vend extends VendingMachine {
    List<BottleWater> bottleWaters = new ArrayList<>();
    void initProduct(List<BottleWater> bottleWaters){
        this.bottleWaters = bottleWaters;
    }
    @Override
    public String getProduct(String name){
        for (BottleWater p: bottleWaters){
            if (p.getName().equals(name)) return p.toString();
        }
        return "Not found";
    }
    public String getProduct(String name, int maxPrice){
        List<BottleWater> bottleWaterList = new ArrayList<>();
        for (BottleWater p: bottleWaters){
            if (p.getName().equals(name) && p.getPrice() <= maxPrice){
                bottleWaterList.add(p);
            }
        }
        return bottleWaterList.toString();
    }
}
