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

*/
public class MethodRefernces {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using Method Reference instead of Lambda
        names.forEach(System.out::println);
    }
}
