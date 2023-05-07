## functional interfaces

<div>
<div>
A functional interface is an interface that has only one abstract method and is marked with @FunctionalInterface annotation. This annotation is optional but recommended to indicate the intention of the interface. 
Functional interfaces are used to enable lambda expressions and method references in Java 8.
</div>
<div>
Java provides predefined functional interfaces to deal with functional programming by using lambda and method references.  <br>
Some examples are: <br>
Consumer<T>: It represents an operation that accepts a single argument and returns no result. <br>
BiConsumer<T,U>: It represents an operation that accepts two input arguments and returns no result. <br>
Function<T,R>: It represents a function that accepts one argument and returns a result. <br>
Predicate <T>: It represents a predicate (boolean-valued function) of one argument. <br>
</div>

<div>
One example of a functional interface is java.util.function.Function<T, R>, which represents a function that takes an argument of type T and returns a result of type R. For example, we can use this interface to define a lambda expression that converts a string to an integer:<br>
Function<String, Integer> stringToInt = s -> Integer.parseInt(s);
</div>

<div>
Another example of a functional interface is java.util.function.Predicate<T>, which represents a boolean-valued function that tests a condition on an argument of type T. For example, we can use this interface to define a lambda expression that checks if a string is empty:<br>
```Predicate<String> isEmpty = s -> s.isEmpty();```
</div>
</div>
