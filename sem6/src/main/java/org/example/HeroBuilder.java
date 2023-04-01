package org.example;

public class HeroBuilder {
    private static HeroBuilder instanse = null;
    Hero obj;
    private HeroBuilder(){
    }
    public static HeroBuilder getInstance(){
        if (instanse == null) {
            instanse = new HeroBuilder();
        }
        instanse.obj = new Hero();
        return instanse;
    }
    public HeroBuilder setName(String name){
        obj.setName(name);
        return this;
    }
    public HeroBuilder setHealth(double health){
        obj.setHealth(health);
        return this;
    }
    public HeroBuilder setMana(double mana){
        obj.setMana(mana);
        return this;
    }
    public HeroBuilder setStamina(double stamina){
        obj.setStamina(stamina);
        return this;
    }
    public HeroBuilder setWeapon(String weapon){
        obj.setWeapon(weapon);
        return this;
    }
    public HeroBuilder setStrength(int strength){
        obj.setStrength(strength);
        return this;
    }
    public HeroBuilder setDexterity(int dexterity){
        obj.setDexterity(dexterity);
        return this;
    }
    public HeroBuilder setIntelligence(int intelligence){
        obj.setIntelligence(intelligence);
        return this;
    }
    public Hero build(){
        return obj;
    }
}
