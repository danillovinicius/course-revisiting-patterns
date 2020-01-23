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

## Prototype

> Concepts
- Avoids costly creation
- Avoids subclassing
- Typically doesn’t use “new”
- Often utilizes an Interface
- Usually implemented with a Registry
- Example:
    - java.lang.Object#clone() 

> Design
- Clone / Cloneable
- Avoids keyword “new”
- Although a copy, each instance unique
- Costly construction not handled by client
- Can still utilize parameters for construction
- Shallow VS Deep Copy

## Prototype

> Concepts

> Design