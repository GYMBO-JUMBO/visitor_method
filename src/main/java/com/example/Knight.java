package com.example;

public class Knight implements Character{
    private int hp;
    private int strength;
    public Knight(int hp, int strength){
        this.hp = hp;
        this.strength = strength;
    }
    public int getHp() {
        return hp;
    }
    public int getStrength() {
        return strength;
    }
    @Override 
    public void accept(CharacterVisitor visitor){
        visitor.visitKnight(this);
    }
}
