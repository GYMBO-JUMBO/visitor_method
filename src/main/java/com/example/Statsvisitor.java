package com.example;

public class Statsvisitor implements CharacterVisitor{
    @Override 
    public void visitKnight(Knight knight){
        System.out.println("Knights hp:" + knight.getHp());
        System.out.println("Knights strength:" + knight.getStrength());
    }
    @Override 
    public void visitWizard(Wizard wizard){
        System.out.println("Wizards hp:" + wizard.getHp());
        System.out.println("Wizards strength:" + wizard.getMana());
    }
}
