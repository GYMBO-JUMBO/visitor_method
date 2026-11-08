package com.example;

public interface CharacterVisitor {
    abstract void visitKnight(Knight knight);
    abstract void visitWizard(Wizard wizard);
}
