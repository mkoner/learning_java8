## Lambda Expressions

They are used to write anonymous function.

Following are the important characteristics of a lambda expression.

Optional type declaration − No need to declare the type of a parameter. The compiler can inference the same from the value of the parameter.

Optional parenthesis around parameter − No need to declare a single parameter in parenthesis. For multiple parameters, parentheses are required.

Optional curly braces − No need to use curly braces in expression body if the body contains a single statement.

Optional return keyword − The compiler automatically returns the value if the body has a single expression to return the value. Curly braces are required to indicate that expression returns a value.

### Syntax
\t parameter -> expression
\t (parameter1, parameter2) -> expression
\t (parameter1, parameter2) -> { code block }