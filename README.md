# Course Java - revisiting patterns

## Pattern Groups 

    Creational | Structural | Behavioral 

## Creational

### Singleton

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

### Builder

> Concepts
- Handles complex constructors
- Large number of parameters
- Immutability

> Design 
- Flexibility over telescoping constructors Static inner class
- Calls appropriate constructor
- Negates the need for exposed setters
- Take advantage of Generics

### Prototype

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

### Factory Method

> Concepts
- Doesn’t expose instantiation logic
- Defer to subclasses
- Common interface
- Specifed by architecture, implemented by user
- Examples:
    - Calendar
    - ResourceBundle
    - NumberFormat

> Design
- Factory is responsible for lifecycle
- Common Interface
- Concrete Classes
- Parameterized create method

### AbstractFactory

> Concepts
- Factory of Factories
- Factory of related objects
- Common Interface
- Defer to Subclasses
- Examples:
    - DocumentBuilder
    - Frameworks 

> Design
- Groups Factories together
- Factory is responsible for lifecycle
- Common Interface
- Concrete Classes
- Parameterized create method
- Composition

## Structural

### Adapter
> Concepts
- Plug adaptor
- Convert interface into another interface
- Legacy
- Translates requests
- Client, Adapter, Adaptee
- Examples:
- Arrays -> Lists
- Streams
 
> Design
- Client centric
-Integrate new with old
Interface, but not required
Adaptee can be the implementation


### Bridge
> Concepts
> Design

### Composite
> Concepts
> Design

### Decorator
> Concepts
> Design

### Facade
> Concepts
> Design

### Flyweight
> Concepts
> Design

### Proxy
> Concepts
> Design
         
