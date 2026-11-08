package com.example;

public class Wizard implements Character{
    private int hp;
    private int mana;
    public Wizard(int hp, int mana){
        this.hp = hp;
        this.mana = mana;
    }
    public int getHp() {
        return hp;
    }
    public int getMana() {
        return mana;
    }
    @Override 
    public void accept(CharacterVisitor visitor){
        visitor.visitWizard(this);
    }
}

