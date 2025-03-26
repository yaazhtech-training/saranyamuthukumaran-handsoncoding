package com.example.handsonsaranyaMuthukumaran.javaeightfeatures;

import java.util.Arrays;
import java.util.List;

/*
*
* Definition:
Method references provide a cleaner way to refer to existing methods instead of using lambda expressions.

Syntax:
java
Copy
Edit
ClassName::methodName
Types of Method References:
Type	Example
Static Method Reference	ClassName::staticMethod
Instance Method Reference	Object::instanceMethod
Constructor Reference	ClassName::new
*
*
*
* Key Benefits:
✅ Improves code readability
✅ Eliminates unnecessary lambda expressions

* 🔸 Without Method Reference (Using Lambda)
java
Copy
Edit
import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.forEach(name -> System.out.println(name)); // Using Lambda
    }
}
* 🔹 When to Use Method References?
✅ Use When                                                            	❌ Avoid When
You are already using a lambda that simply calls another method.	You need custom logic inside the lambda.
The method signature matches the required functional interface.   	The method does not match the required signature.
You want cleaner and more readable code.                          	The reference method requires extra parameters.

*/
public class MethodRefernces {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using Method Reference instead of Lambda
        names.forEach(System.out::println); // Using Method Referenc//📌 What Happens Internally?
     /*   System.out::println is equivalent to (name) -> System.out.println(name).

                The compiler automatically matches method parameters and optimizes code.*/
    }
}
