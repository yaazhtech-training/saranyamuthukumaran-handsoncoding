package com.example.handsonsaranyaMuthukumaran.javaeightfeatures;

import java.util.Arrays;
import java.util.List;

/*Streams process collections (List, Set, Map) efficiently using functional programming.
*
*---------------------
* import java.util.Arrays;
import java.util.List;

public class WithoutStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
    }
}
*
* ----------------------------------
* Common Stream Operations
💡 Filtering Elements (filter)
Used to filter elements based on a condition.

java
Copy
Edit
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

// Print names that start with "A"
names.stream()
     .filter(name -> name.startsWith("A"))
     .forEach(System.out::println);
Output:

nginx
Copy
Edit
Alice
💡 Transforming Data (map)
Used to modify each element in the stream.

java
Copy
Edit
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

// Convert all names to uppercase
names.stream()
     .map(String::toUpperCase)
     .forEach(System.out::println);
Output:

nginx
Copy
Edit
ALICE
BOB
CHARLIE
DAVID
💡 Sorting Elements (sorted)
Used to sort elements in natural order or with a custom comparator.

java
Copy
Edit
List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);

// Sorting numbers in ascending order
numbers.stream()
       .sorted()
       .forEach(System.out::println);
Output:

Copy
Edit
1
2
3
5
8
💡 Finding an Element (findFirst)
Used to get the first element in a stream.

java
Copy
Edit
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

// Get first name that starts with "C"
String result = names.stream()
                     .filter(name -> name.startsWith("C"))
                     .findFirst()
                     .orElse("Not Found");

System.out.println(result);
Output:

nginx
Copy
Edit
Charlie
💡 Checking Conditions (anyMatch, allMatch, noneMatch)
Used to check if elements satisfy a condition.

java
Copy
Edit
List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

// Check if any number is greater than 25
boolean anyMatch = numbers.stream().anyMatch(n -> n > 25);
System.out.println(anyMatch);  // true
💡 Reducing Elements (reduce)
Used to perform an aggregation operation like sum, min, max.

java
Copy
Edit
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Sum of all numbers
int sum = numbers.stream()
                 .reduce(0, Integer::sum);

System.out.println(sum);
Output:

Copy
Edit
15
3️⃣ Parallel Streams (for Faster Processing)
Parallel streams allow multi-threaded execution, improving performance.

java
Copy
Edit
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

// Using parallelStream()
names.parallelStream()
     .forEach(System.out::println);
🔹 Note: The output order may vary due to parallel execution.

4️⃣ Stream vs Collection (Key Differences)
Feature	Collections	Streams
Storage	Stores elements	Does NOT store elements
Iteration	External (for loop)	Internal (functional)
Modification	Can modify elements	Cannot modify elements
Processing	Single-threaded	Can be parallel
5️⃣ Summary
✔ Streams allow functional-style operations on collections.
✔ Operations: filter(), map(), sorted(), forEach(), reduce(), etc.
✔ Lazy Evaluation: Operations are performed only when needed.
✔ Parallel Streams improve performance on large datasets.

🚀 Streams make Java code more readable and efficient!
* */
public class StreamsAPI
{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
                .filter(name -> name.startsWith("A")) // Filters names starting with A
                .forEach(System.out::println); // Prints the filtered names
    }
}
