package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Knight knight = new Knight(50, 6);
        Wizard wizard = new Wizard(30, 9);
        DamageVisitor damageVisitor = new DamageVisitor();
        Statsvisitor statsvisitor = new Statsvisitor();
        List<Character>characters = new ArrayList<>();
        characters.add(wizard);
        characters.add(knight);
        for(Character character:characters){
            character.accept(statsvisitor);
            character.accept(damageVisitor);
        }
    }
}