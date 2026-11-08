
# RPG Character System — Visitor Pattern

## Description
A simple Java project demonstrating the Visitor behavioral design pattern using RPG characters.

The Visitor pattern allows adding new operations to existing classes without modifying their code.

## Project Structure
- `Character.java` — Element interface.
- `Knight.java` — Knight character with HP and Strength.
- `Wizard.java` — Wizard character with HP and Mana.
- `CharacterVisitor.java` — Visitor interface.
- `DamageVisitor.java` — Calculates character damage.
- `Statsvisitor.java` — Displays character statistics.
- `Main.java` — Creates characters and executes visitors.

## How It Works
1. Create Knight and Wizard objects.
2. Store characters in a list.
3. Apply StatsVisitor to display their statistics.
4. Apply DamageVisitor to calculate damage.
5. Each character calls the appropriate visitor method using double dispatch.

## Clean Code Principles
1. **Single Responsibility Principle** — Each visitor performs one specific operation.
2. **Meaningful Names** — Classes and methods have clear, descriptive names.
3. **Encapsulation** — Character fields are private and accessed through getters.
4. **Open/Closed Principle** — New operations can be added through new visitors without changing character classes.
5. **Avoid Type Checking** — Double dispatch eliminates the need for `instanceof`.

## Technologies
- Java
- Maven
- Visitor Design Pattern

## Author
GYMBO-JUMBO
