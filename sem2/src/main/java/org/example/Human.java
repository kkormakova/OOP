package org.example;

import java.util.ArrayList;
import java.util.List;

public class Human extends Buyer{
    List<Food> card = new ArrayList<>();
    @Override
    public void addToCard(Food food){
        card.add(food);
        System.out.println(getName()+" положил в корзину "+food.name);
    }
    @Override
    public void removeFromCard(Food food){
        System.out.println(getName()+" убрал из корзины "+food.name);
        card.remove(food);
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setMakeOrder(){
        isMakeOrder = true;
    }
    @Override
    public void setTakeOrder(){
        isMakeOrder = true;
    }
    @Override
    public boolean isMakeOrder(){
        return isMakeOrder;
    }
    @Override
    public boolean isTakeOrder(){
        return isTakeOrder;
    }
}
