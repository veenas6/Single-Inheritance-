# Calculator Java Program
This repository contains a simple Java program that demonstrates the use of **inheritance** and **inner classes** to perform basic arithmetic operations. In this example, the program performs the **addition** of two integers.

## Project Overview
The `calculator` class contains two integer variables (`a` and `b`), and an inner class `addition` that performs the addition of these two numbers. The result is then printed to the console.

### Key Concepts:
- **Inheritance**: The `addition` class extends the `calculator` class.
- **Inner Classes**: The `addition` class is an inner class of `calculator`.
- **Basic Arithmetic Operation**: Addition of two integers.

## Code Explanation
1. **calculator Class**:
   - Contains two integer variables `a` and `b`, which are initialized to `10` and `20`, respectively.
2. **addition Class**:
   - The inner class `addition` extends the `calculator` class.
   - It contains the `performAddition()` method, which adds `a` and `b` and prints the result.
3. **Main Method**:
   - Creates an instance of the `calculator` class.
   - Creates an instance of the `addition` inner class.
   - Calls `performAddition()` to print the sum of `a` and `b`.

## Requirements
- **Java 8** or higher installed.
