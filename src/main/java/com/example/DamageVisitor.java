package com.example;

public class DamageVisitor implements CharacterVisitor{
    @Override 
    public void visitKnight(Knight knight){
        int strength = knight.getStrength() * 2;
        System.out.println("Knights damage is " + strength);
    }
    @Override 
    public void visitWizard(Wizard wizard){
        int mana = wizard.getMana() * 3;
        System.out.println("Wizards danage is " + mana);
    }
}
