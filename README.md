# Course Java - revisiting patterns

## Singleton

> Concepts
- Only one instance created
- Guarantees control of a resource
- Lazily loaded

> Design
- Class is responsible for lifecycle
- Static in nature
- Needs to be thread safe
- Private instance
- Private constructor
- No parameters required for construction

## Builder

> Concepts
- Handles complex constructors
- Large number of parameters
- Immutability

> Design 
- Flexibility over telescoping constructors Static inner class
- Calls appropriate constructor
- Negates the need for exposed setters
- Take advantage of Generics