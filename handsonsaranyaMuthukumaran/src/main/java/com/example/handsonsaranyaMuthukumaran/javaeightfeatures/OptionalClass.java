package com.example.handsonsaranyaMuthukumaran.javaeightfeatures;

import java.util.Optional;

/*
* Optional<T> is a container that handles null values safely, avoiding NullPointerException.
* _____________
* public class WithoutOptional {
    public static void main(String[] args) {
        String name = getName();
        if (name != null) {
            System.out.println(name.toUpperCase());
        } else {
            System.out.println("No Name Found!");
        }
    }

    public static String getName() {
        return null; // Can be null
    }
}
*
* Key Benefits:
✅ Eliminates null checks
✅ Reduces risk of NullPointerException
✅ Provides powerful methods (ifPresent(), orElse(), orElseThrow())


* */
public class OptionalClass
{
    public static void main(String[] args) {
        Optional<String> optionalName = Optional.ofNullable(getName());

        optionalName.ifPresentOrElse(
                name -> System.out.println(name.toUpperCase()), // If value is present
                () -> System.out.println("No Name Found!")     // If value is null
        );
    }

    public static String getName() {
        return null; // Can be null
    }
}
