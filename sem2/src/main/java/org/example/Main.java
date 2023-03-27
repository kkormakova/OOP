package org.example;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.name = "Kseniia";
        Market market = new Market();
        market.acceptToMarket(h1);
        market.takeInQueue(h1);

        Food prod1 = new Food("Печенье овсяное", 50, 2);
        Food prod2 = new Food("Колбаса докторская ГОСТ", 150, 1);
        Food prod3 = new Food("Молоко 3,2%", 75,1);
        h1.addToCard(prod1);
        h1.addToCard(prod2);
        h1.addToCard(prod3);
        h1.removeFromCard(prod2);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(h1);
        market.update();
    }
}