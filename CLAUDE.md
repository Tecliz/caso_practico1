# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a **Java fundamentals learning project** focused on teaching core Java concepts. It's a Maven-based project targeting **Java 21** (using modern Java features). The codebase demonstrates object-oriented programming (OOP) principles, collections (Lists, HashMaps), and stream operations through practical examples.

## Build & Execution Commands

- **Compile**: `mvn clean compile`
- **Run main application**: `mvn exec:java -Dexec.mainClass="com.zegel.Main"`
- **Build JAR**: `mvn package`
- **Run compiled JAR**: `java -jar target/fundamentos-1.0-SNAPSHOT.jar`

Note: This project uses Maven 3.6+ and requires Java 21 to be installed and on the PATH.

## Code Architecture

### Package Structure

- **`com.zegel`**: Root package containing `Main.java`, the entry point demonstrating all learned concepts
- **`com.zegel.poo`**: Object-Oriented Programming examples
  - `MetodoPago` (interface): Payment method abstraction
  - `TarjetaCredito`, `PayPal`: Concrete implementations showing polymorphism
- **`com.zegel.collections`**: Collections API demonstrations
  - `ListasEjemplo`: ArrayList operations and stream filtering
  - `HashEjemplos`: HashMap operations with practical examples (users, products)
  - `CalculadorEcommerce`: Real-world e-commerce pricing logic with region-based calculations

### Learning Progression in Main.java

The `Main.java` class sequentially demonstrates:

1. **Basic syntax**: Variables, operators, ternary operator
2. **Control flow**: if/else, switch, for/while/do-while loops
3. **Exception handling**: try/catch blocks with arithmetic errors
4. **OOP**: Polymorphism with payment methods (MetodoPago interface)
5. **Collections**: Lists and HashMaps with stream operations
6. **Practical application**: E-commerce calculations by region

### Key OOP Pattern: Payment Methods

The `poo` package demonstrates the **Strategy pattern** with payment processing:
- `MetodoPago` defines a common interface
- `TarjetaCredito` and `PayPal` are concrete strategies
- `Main` uses polymorphism to process payments uniformly

### Collections Examples

- **Lists**: Filtering with traditional loops and Java Streams
- **HashMaps**: Storing and filtering objects by criteria
- **Streams**: Filtering products by price thresholds using `.stream()`, `.filter()`, `.forEach()`

## Development Notes

- This is a **learning/training repository** — code is intentionally verbose to demonstrate concepts
- All code runs in `main()` as sequential examples (no unit tests)
- Spanish variable names and comments reflect the original educational context
- The project has no external dependencies beyond Java 21 standard library
