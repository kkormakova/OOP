package org.example;

public class Main {
    public static void main(String[] args) {
        var warrior = HeroBuilder.getInstance().setName("Stupid crusher").setHealth(600).setWeapon("Hammer").setStamina(600).setStrength(10).build();
        var archer = HeroBuilder.getInstance().setName("Skinny eye").setHealth(500).setWeapon("Long bow").setStamina(400).setDexterity(11).build();
        var magician = HeroBuilder.getInstance().setName("Khajiit Vzhuh").setHealth(400).setWeapon("Magic wand").setMana(500).setIntelligence(12).build();
        System.out.println(warrior);
        System.out.println(archer);
        System.out.println(magician);
    }
}
