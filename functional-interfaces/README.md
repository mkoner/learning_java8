## functional interfaces

A functional interface is an interface that has only one abstract method and is marked with @FunctionalInterface annotation. This annotation is optional but recommended to indicate the intention of the interface. 
Functional interfaces are used to enable lambda expressions and method references in Java 8.

<br>
Java provides predefined functional interfaces to deal with functional programming by using lambda and method references.  <br>
Some examples are: <br>
Consumer<T>: It represents an operation that accepts a single argument and returns no result. <br>
BiConsumer<T,U>: It represents an operation that accepts two input arguments and returns no result. <br>
Function<T,R>: It represents a function that accepts one argument and returns a result. <br>
Predicate<T>: It represents a predicate (boolean-valued function) of one argument. <br>
 <br>
  <br>

