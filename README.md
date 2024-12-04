# Hero-Actions-OOP-Demo
This repository demonstrates key Object-Oriented Programming (OOP) concepts in Java using a hero-themed simulation. It covers abstraction, encapsulation, inheritance, polymorphism, method overriding and dynamic binding. Each hero action like talking, walking, flying is modeled through subclasses, showcasing clean and reusable design principles.

## Project Overview
The project simulates various hero actions by defining an abstract Hero class, which serves as a blueprint for different hero actions. Each action is represented as a subclass, including Talk, Walk, Run, Fly, Fight, Save, and Award. These subclasses override the action() method to provide specific implementations for each action. The movie() method demonstrates polymorphism by calling the appropriate action() method based on the object passed at runtime.

## Features
- **Abstraction:** The Hero abstract class defines the action() method, and each subclass provides specific implementations.
- **Encapsulation:** Each action is encapsulated in its corresponding subclass, promoting separation of concerns.
- **Inheritance:** All action classes inherit from the Hero class, enabling code reusability and consistency.
- **Polymorphism:** The movie() method demonstrates runtime polymorphism, invoking the action() method dynamically based on the object type passed.
- **Method Overriding:** Each subclass overrides the action() method to provide its own specific behavior for the hero’s action.
- **Dynamic Binding:** The method that gets executed is determined at runtime based on the object passed to the movie() method.

## Class Structure
- `Hero (Abstract Class)`
Purpose: Serves as the base class for all hero actions.

Key Method:
abstract void action(); – This abstract method is implemented by subclasses to define specific hero actions.
- `Talk (Subclass of Hero)`
Purpose: Implements the action() method to define the hero talking action.

Method:
void action() – Prints "Hero is talking".
- `Walk (Subclass of Hero)`
Purpose: Implements the action() method to define the hero walking action.

Method:
void action() – Prints "Hero is walking".
- `Run (Subclass of Hero)`
Purpose: Implements the action() method to define the hero running action.

Method:
void action() – Prints "Hero is running".
- `Fly (Subclass of Hero)`
Purpose: Implements the action() method to define the hero flying action.

Method:
void action() – Prints "Hero is flying".
- `Fight (Subclass of Hero)`
Purpose: Implements the action() method to define the hero fighting action.

Method:
void action() – Prints "Hero is fighting".
- `Save (Subclass of Hero)`
Purpose: Implements the action() method to define the hero saving action.

Method:
void action() – Prints "Hero is saving needy people".
- `Award (Subclass of Hero)`
Purpose: Implements the action() method to define the hero receiving an award.

Method:
void action() – Prints "Hero wins Award...!!!".

## Methods
- **movie(Hero h):**

Purpose: A static method that accepts a Hero object and calls its action() method, demonstrating polymorphism and dynamic method invocation.
Usage: This method is used in the main() method to invoke various hero actions.

- **main(String[] args):**

Purpose: The entry point of the program that demonstrates polymorphism by passing different hero objects to the movie() method.
Usage: Calls the movie() method with different hero action objects (Talk, Walk, Run, Fly, Fight, Save, Award).

## Pre-requisites

- Java Development Kit (JDK) 8 or above.
- A basic understanding of Java programming, including OOP concepts such as inheritance, polymorphism, and method overriding.

## OOP Concepts Demonstrated
- **Abstraction:** Achieved by defining the abstract class Hero with an abstract action() method, which is then implemented by subclasses.

- **Encapsulation:** Each hero action is encapsulated within its respective class (Talk, Walk, Run, etc.), promoting separation of concerns.

- **Inheritance:** Subclasses inherit from the Hero class, allowing them to share common functionality and reducing code duplication.

- **Polymorphism:** Demonstrated in the movie() method, where the same method call action() behaves differently depending on the object type passed (e.g., Talk, Walk, Run, etc.).

- **Method Overriding:** Subclasses override the action() method of the Hero class to define their specific actions, allowing dynamic behavior at runtime.

- **Dynamic Binding:** The method that gets executed (action()) is determined at runtime based on the object passed to the movie() method, demonstrating dynamic binding in action.

## Output
  
Hero is talking

Hero is walking

Hero is running

Hero is flying

Hero is fighting

Hero is saving needy people

Hero wins Award...!!!
