package com.example.handsonsaranyaMuthukumaran.javaeightfeatures;
/*
* Definition:
A Lambda Expression is a compact way to represent an anonymous function (or method without a name).
*
*Key Benefits:
✅ Eliminates boilerplate code (Anonymous class)
✅ Improves readability and conciseness
✅ Enhances functional programming
*
*
* ____________________________________________
* Example Without Lambda (Java 7)
java
Copy
Edit
interface Greeting {
    void sayHello();
}

public class TraditionalAnonymousClass {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            public void sayHello() {
                System.out.println("Hello, Java 7!");
            }
        };
        greeting.sayHello();
    }
}
*
* */
public class Lambda {
    public static void main(String[] args) {
        FunctionalInterface calculator = (a, b) -> a + b; // Lambda Expression
        System.out.println("Addition: " + calculator.add(10, 20));
    }
}
