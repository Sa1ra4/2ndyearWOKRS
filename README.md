# 🛡️ Java_Fundamentals: 6-Program Activity Suite

![Java Version](https://img.shields.io/badge/Java-8%2B-007396?style=for-the-badge&logo=java&logoColor=white)
![Build Status](https://img.shields.io/badge/Status-Passing-success?style=for-the-badge)
![Package](https://img.shields.io/badge/Packages-ACTIVITY%20%7C%20animals-blue?style=for-the-badge)
![Programs](https://img.shields.io/badge/Total%20Modules-6%20Programs-orange?style=for-the-badge)

*"Core execution pipeline established. 6 foundational Java modules loaded and verified."*


This repository contains the complete solution for the *Java Fundamentals Activity Suite*, consisting of *six core Java programs* located across the ACTIVITY and animals packages. The modules demonstrate standard output formatting, arithmetic calculations, conditional comparisons (minimum and maximum value detection), Object-Oriented Programming (OOP) fundamentals, and class hierarchy with object instantiation.

---

## 🎯 Objective & Requirements

The primary goal of this activity collection is to demonstrate fundamental Java logic, control flow, package management, and modular object-oriented design.

### 📋 Technical Constraints & Features Checklist
- [x] *Standard I/O Formatting:* Clean, aligned console printing using custom borders and string concatenation.
- [x] *Arithmetic Computation:* Basic integer summation and arithmetic logic.
- [x] *Conditional Logic (Maximum):* Multi-variable decision branching (if / else if / else) to evaluate the largest of three numbers.
- [x] *Conditional Logic (Minimum):* Two-variable evaluation (if / else) to extract the smaller numerical value.
- [x] *Object-Oriented Programming (OOP):* Custom class structures, parameterized constructors, object instantiation, and state display methods.
- [x] *Package Organization & Polymorphic Behaviors:* Implementation of distinct animal classes (Dog, Cat, Duck) inside the animals package, instantiated and invoked via a main driver class (helloworld).

---

## 🏗️ System Architecture

```text
Java Fundamentals Architecture
│
├── 📂 ACTIVITY Package
│   ├── 📂 Console I/O & Formatting
│   │   └── 📄 PersonalInformation.java  ──► Prints formatted student profile
│   │
│   ├── 📂 Mathematical Operations
│   │   └── 📄 Totalcalculator.java      ──► Performs integer addition
│   │
│   ├── 📂 Decision Control Structures
│   │   ├── 📄 LargestFinder.java        ──► Evaluates maximum (3 values)
│   │   └── 📄 Smallermin.java           ──► Evaluates minimum (2 values)
│   │
│   └── 📂 Object-Oriented System
│       └── 📄 Book.java                 ──► Instantiates & displays 5 book objects
│
└── 📂 animals Package
    └── 📂 Object Inheritance & Multi-Class Interaction
        ├── 📄 Dog.java                  ──► Defines Dog behaviors (sayHello)
        ├── 📄 Cat.java                  ──► Defines Cat behaviors (sayHello)
        ├── 📄 Duck.java                 ──► Defines Duck behaviors (sayHello)
        └── 📄 helloworld.java           ──► Main execution driver instantiating objects