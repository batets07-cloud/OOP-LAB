# Lab 2: Abstraction with Abstract Classes & Methods

This section implements incomplete conceptual domain entities and enforces method implementation contracts down inheritance chains.

## Deliverables Checklist
- [x] `Student.java` (Abstract superclass)
- [x] `CompSciStudent.java` (Concrete subclass)
- [x] `StudentDemo.java` (Driver testing polymorphic assignment and dynamic binding)

## Conceptual Analysis
### Why does a direct instantiation of `Student` fail?
An abstract class cannot be instantiated using the `new` operator because it represents an incomplete structural blueprint. It contains abstract method signatures missing operational blocks (bodies), leaving the JVM unable to resolve complete execution targets.

### Dynamic Binding Verification
Invoking `.getRemainingHours()` using a `Student` reference type successfully evaluates the child override implementation (`CompSciStudent`) at runtime.
