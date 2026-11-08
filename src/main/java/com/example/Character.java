package com.example;

public interface Character {
    abstract void accept(CharacterVisitor visitor);
}
