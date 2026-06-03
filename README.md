# Laboratory Work No.2: Object-Oriented Programming Hierarchy

## Overview
This repository contains the implementation of Laboratory Work No.2 for the Moscow Technical University of Communications and Informatics (MTUCI). 

The primary focus of this project is to design and implement a robust three-level class hierarchy modeling software applications to demonstrate core Object-Oriented Programming (OOP) concepts in Java: abstraction, encapsulation, inheritance, and polymorphism.

## Core OOP Implementations

### 1. Abstraction and Inheritance
* **Three-Level Hierarchy**: Features a structured inheritance chain starting from the root abstract class `Application`, extending to intermediate specializations like `MobileApplication`, and culminating in concrete end-level classes.
* **Abstract Methods**: The base class defines essential behavioral contracts, such as `public abstract void launch();`, forcing all concrete subclasses to implement their specific execution logic.

### 2. Encapsulation and State Management
* **Access Modifiers**: All class properties are protected using `private` visibility modifiers to restrict direct external access and maintain data integrity.
* **Accessors**: Interaction with object states is securely handled through public getters and setters, incorporating parameter validation logic within constructors and methods to prevent invalid system states.
* **Static Tracking**: Implements a global tracking system using a `private static int appCount` field in the base class. The counter automatically increments within the base constructor, ensuring accurate calculation of all instantiated objects across the entire hierarchy via sequential `super()` calls.

### 3. Polymorphism (Overriding and Overloading)
* **Cascading Overriding**: The `displayInfo()` method is sequentially overridden across all inheritance levels. By utilizing `super.displayInfo()`, the system aggregates and outputs complete object data down the inheritance chain without code duplication.
* **Method Overloading**: Demonstrates compile-time polymorphism within the `MobileApplication` class by overloading the `update()` method (e.g., providing a parameterless `update()` and an alternative `update(String version)` signature).

## Technologies Used
* Language: Java
* Core Concepts: Object-Oriented Programming (Abstraction, Encapsulation, Inheritance, Polymorphism), Method Overriding and Overloading, Static Fields/Methods, Class Hierarchy Design.

## Key Learnings and Conclusion
This laboratory work successfully reinforces the practical application of object-oriented architecture in Java. Developing a multi-level software tracking hierarchy provided deep insights into structuring reusable code through inheritance and enforcing behaviors via abstraction. Additionally, managing shared state through static context and implementing both dynamic (overriding) and static (overloading) polymorphism proved crucial for building scalable and maintainable data models.

---

## Author
* Name: Pavel Petrovich Koshelev
* Group: BST 2401
* Institution: MTUCI
* Year: 2026
