package com.example.handsonsaranyaMuthukumaran.javaeightfeatures;
/*
* Interview Summary (Key Points)
✅ Streams provide a functional way to process collections.
✅ Intermediate operations return a Stream, while terminal operations produce a result.
✅ Short-circuiting improves efficiency by stopping early.
✅ Parallel streams enhance performance on large datasets but may cause unordered execution.
✅ Collectors help aggregate and transform stream results.
* Types of Functions in Java 8 Streams (Interview Perspective)
Streams in Java 8 provide various functions that enable functional-style operations on collections and sequences of data. These functions can be categorized into different types based on their usage.

🔹 1. Intermediate Operations
Transform or filter elements in a Stream

Return a new Stream (lazy evaluation, meaning they are executed only when a terminal operation is called)

Method	Description	Example
filter(Predicate<T> predicate)	Filters elements based on a condition	stream.filter(x -> x > 10)
map(Function<T, R> mapper)	Transforms each element	stream.map(String::toUpperCase)
flatMap(Function<T, Stream<R>> mapper)	Flattens multiple streams into a single one	listOfLists.stream().flatMap(List::stream)
distinct()	Removes duplicates	stream.distinct()
sorted()	Sorts elements in natural order	stream.sorted()
sorted(Comparator<T> comparator)	Sorts using a custom comparator	stream.sorted(Comparator.reverseOrder())
peek(Consumer<T> action)	Performs an action on each element (used for debugging)	stream.peek(System.out::println)
💡 Key Points:

Lazy Execution: These operations do not execute until a terminal operation is applied.

Chainable: You can apply multiple intermediate operations in sequence.

🔹 2. Terminal Operations
Trigger the execution of stream processing

Return a result (not another stream)

Method	Description	Example
forEach(Consumer<T> action)	Performs an action on each element	stream.forEach(System.out::println)
collect(Collector<T, A, R> collector)	Converts Stream into a Collection (List, Set, Map)	stream.collect(Collectors.toList())
reduce(BinaryOperator<T> accumulator)	Reduces elements to a single value	stream.reduce(0, Integer::sum)
count()	Returns count of elements	stream.count()
min(Comparator<T> comparator)	Finds minimum element	stream.min(Comparator.naturalOrder())
max(Comparator<T> comparator)	Finds maximum element	stream.max(Comparator.naturalOrder())
anyMatch(Predicate<T> predicate)	Returns true if any element matches	stream.anyMatch(x -> x > 10)
allMatch(Predicate<T> predicate)	Returns true if all elements match	stream.allMatch(x -> x > 0)
noneMatch(Predicate<T> predicate)	Returns true if no elements match	stream.noneMatch(x -> x < 0)
findFirst()	Returns the first element (if present)	stream.findFirst()
findAny()	Returns any element (useful in parallel streams)	stream.findAny()
💡 Key Points:

Consumes the Stream: After a terminal operation, the stream is closed and cannot be reused.

Performance Optimization: Some operations like findAny() are optimized for parallel streams.

🔹 3. Short-Circuiting Operations
Stop processing early without evaluating all elements

Includes both intermediate and terminal operations.

Method	Type	Description	Example
limit(n)	Intermediate	Limits the number of elements	stream.limit(5)
skip(n)	Intermediate	Skips first n elements	stream.skip(2)
findFirst()	Terminal	Retrieves first element	stream.findFirst()
findAny()	Terminal	Retrieves any element (optimized for parallel)	stream.findAny()
anyMatch()	Terminal	Returns true if any element matches	stream.anyMatch(x -> x > 10)
allMatch()	Terminal	Returns true if all elements match	stream.allMatch(x -> x > 0)
noneMatch()	Terminal	Returns true if no elements match	stream.noneMatch(x -> x < 0)
💡 Key Points:

Reduces computational cost (useful when working with large datasets).

Efficient in parallel processing.

🔹 4. Parallel Stream Functions
Used for parallel processing to leverage multi-core processors

Improves performance for large datasets

Method	Description
stream.parallel()	Converts a stream into a parallel stream
stream.sequential()	Converts a parallel stream back to sequential
stream.isParallel()	Checks if a stream is parallel
💡 Key Points:

Use parallelStream() for large datasets.

Avoid using parallel() for small lists (it may add overhead instead of improving performance).

Parallel streams may not maintain order (use forEachOrdered() instead of forEach()).

🔹 5. Collectors (Grouping & Partitioning)
Method	Description	Example
Collectors.toList()	Collects elements into a List	stream.collect(Collectors.toList())
Collectors.toSet()	Collects elements into a Set	stream.collect(Collectors.toSet())
Collectors.toMap()	Collects elements into a Map	stream.collect(Collectors.toMap(x -> x, x -> x.length()))
Collectors.groupingBy(Function<T, K>)	Groups elements by a key	stream.collect(Collectors.groupingBy(x -> x.length()))
Collectors.partitioningBy(Predicate<T>)	Partitions into true and false groups	stream.collect(Collectors.partitioningBy(x -> x.startsWith("A")))
💡 Key Points:

Grouping is like SQL GROUP BY.

Partitioning always creates two groups (true and false).

🔹 Example Code Demonstrating Different Stream Functions
java
Copy
Edit
import java.util.*;
import java.util.stream.*;

public class StreamFunctionsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Alex");

        // Intermediate Operations
        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("A"))
                                          .map(String::toUpperCase)
                                          .sorted()
                                          .collect(Collectors.toList());
        System.out.println("Filtered Names: " + filteredNames);

        // Terminal Operations
        long count = names.stream().count();
        System.out.println("Total Names: " + count);

        Optional<String> firstName = names.stream().findFirst();
        firstName.ifPresent(name -> System.out.println("First Name: " + name));

        // Short-Circuiting
        boolean anyMatch = names.stream().anyMatch(name -> name.startsWith("C"));
        System.out.println("Any name starts with C? " + anyMatch);

        // Collecting Results
        Map<Integer, List<String>> groupedByLength = names.stream()
                                                          .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped By Length: " + groupedByLength);

        // Parallel Stream
        List<String> upperCaseNames = names.parallelStream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());
        System.out.println("Parallel Stream Upper Case: " + upperCaseNames);
    }
}
🔹 Interview Summary (Key Points)
✅ Streams provide a functional way to process collections.
✅ Intermediate operations return a Stream, while terminal operations produce a result.
✅ Short-circuiting improves efficiency by stopping early.
✅ Parallel streams enhance performance on large datasets but may cause unordered execution.
✅ Collectors help aggregate and transform stream results.

*/
public class StreamsFunctions {


    /*🔹 1. Intermediate Operations (Lazy Evaluation)
Intermediate operations return another Stream and are not executed immediately. They are lazy, meaning they execute only when a terminal operation is called.
 example-filter(),map(),sorted()


    🔹 2. Terminal Operations (Trigger Execution)
Terminal operations end the stream pipeline and produce a result.
example-foreach(),collect()
*/

}
