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
- Integrate new with old
- Interface, but not required
- Adaptee can be the implementation

### Bridge

> Concepts
- Decouple Abstraction and implementation
- Encapsulation, Composition, Inheritance
- Changes in Abstraction won’t affect client
- Details won’t be right
- Examples:
    - Driver
    - JDBC

> Design
- Interfaces and Abstract classes
- Composition over Inheritance
- More than Composition
- Expect change from both sides
- Abstraction, Implementor, Refined
- Abstraction, Concrete Implementor

### Composite

> Concepts
- Components represent part or whole structure
- Compose objects into tree structures
- Individual object treated as a Composite
- Same operations applied on individual and composites
- Examples:
    - java.awt.Component
    - JSF widgets
    - RESTful service GETs

> Design
- Tree structured
- Component
- Leaf or Composite, same operations
- Composite knows about child objects
- Component, Leaf, Composite

### Decorator

> Concepts
- Also called a wrapper
- Add behavior without affecting others
- More than just inheritance
- Single Responsibility Principle
- Compose behavior dynamically
- Examples:
    - java.io.InputStream
    - java.util.Collections#checkedList
    - UI components

> Design
- Inheritance based
- Utilizes composition and inheritance (is-a, has-a)
- Alternative to subclassing
- Constructor requires instance from hierarchy 

### Facade

> Concepts
- Make an API easier to use
- Reduce dependencies on outside code
- Simplify the interface or client usage
- Usually a refactoring pattern
- Examples:
    - java.net.URL
    - javax.faces.context.FacesContext 

> Design
- Class that utilizes composition
- Shouldn’t have a need for inheritance
- Typically encompasses full lifecycle 

### Flyweight

> Concepts
- More efficient use of memory
- Large number of similar objects
- Immutable
- Most of the object states can be extrinsic
- Examples:
- java.lang.String
- java.lang.Integer#valueOf(int)
- Boolean, Byte, Character, Short, Long

> Design
- Pattern of patterns
- Utilizes a Factory
- Encompasses Creation and Structure
- Client, Factory, Flyweight, ConcreteFlyweight 

### Proxy

> Concepts
- Interface by wrapping
- Can add functionality
- Security, Simplicity, Remote, Cost
- Proxy called to access real object
- Examples:
    - java.lang.refect.Proxy
    - java.rmi.* 

> Design
- Interface based
- Interface and Implementation Class
- java.lang.reflect.InvocationHandler
- java.lang.reflect.Proxy
- Client, Interface, InvocationHandler, Proxy 
