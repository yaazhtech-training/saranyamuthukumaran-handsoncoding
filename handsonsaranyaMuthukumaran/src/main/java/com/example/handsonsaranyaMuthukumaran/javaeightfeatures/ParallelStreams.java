package com.example.handsonsaranyaMuthukumaran.javaeightfeatures;

import java.util.Arrays;
import java.util.List;

/*
*
* Parallel Streams execute stream operations in multiple threads, utilizing multi-core processors.
*
* When to Use Parallel Streams?
✅ When dealing with large datasets
✅ When operations do not rely on order

When NOT to Use Parallel Streams?
❌ When operations involve synchronized blocks
❌ When order matters (e.g., writing to a file sequentially)
*
* */
public class ParallelStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.parallelStream() // Executes in parallel threads
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
