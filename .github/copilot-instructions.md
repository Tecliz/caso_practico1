# Project Guidelines

## Code Style
- Java source follows Maven standard layout under `src/main/java`.
- Use Java 17 language features as configured by `pom.xml`.
- Keep code simple and idiomatic: one class per file, explicit package declarations, standard `camelCase` for methods and variables.
- This repository uses Spanish identifiers in examples; preserve existing names when editing educational code.

## Architecture
- `com.zegel.Main` is the entry point and demonstrates core concepts sequentially.
- `com.zegel.poo` contains OOP examples: `MetodoPago`, `TarjetaCredito`, and `PayPal` show interface-based polymorphism.
- `com.zegel.collections` contains collection/stream demos: `ListasEjemplo`, `HashEjemplos`, and `CalculadorEcommerce`.
- `com.zegel.ia` contains a small data-processing example with `ProcesadorDatos` and `Producto`.

## Build and Test
- Compile project: `mvn clean compile`
- Run main application: `mvn exec:java -Dexec.mainClass="com.zegel.Main"`
- Package JAR: `mvn package`
- There are no dedicated unit tests in this repository currently.

## Project Conventions
- Target educational clarity over optimization; verbose examples are intentional.
- Do not introduce external dependencies unless the exercise clearly requires them.
- Prefer straightforward control flow, `for`/`while`, and `try`/`catch` examples to illustrate fundamentals.
- Keep modifications aligned with the repository’s learning goal: show core Java basics in small, self-contained classes.

## Integration Points
- No external services or dependencies are used; the project relies only on the Java standard library.
- The Maven `pom.xml` is minimal and only configures source/target compatibility.

## Notes for Agents
- Use `CLAUDE.md` as a supplemental project overview when available.
- Preserve the repository’s educational intent and existing example structure when making changes.
