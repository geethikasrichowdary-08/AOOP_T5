
package DefensiveCopyingProject;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        System.out.println("COLLECTIONS DEMO");

        List<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");

        System.out.println("\n1. ArrayList:");
        System.out.println(products);

        Set<String> categories = new HashSet<>();
        categories.add("Electronics");
        categories.add("Furniture");
        categories.add("Electronics");

        System.out.println("\n2. HashSet:");
        System.out.println(categories);

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);

        System.out.println("\n3. TreeSet:");
        System.out.println(numbers);

        Map<Integer, String> employees = new HashMap<>();
        employees.put(101, "Rahul");
        employees.put(102, "Priya");
        employees.put(103, "Arun");

        System.out.println("\n4. HashMap:");
        System.out.println(employees);

        Deque<String> tasks = new ArrayDeque<>();
        tasks.addLast("Task 1");
        tasks.addLast("Task 2");
        tasks.addFirst("Important Task");

        System.out.println("\n5. ArrayDeque:");
        System.out.println(tasks);

        PriorityQueue<Integer> priorities = new PriorityQueue<>();
        priorities.add(30);
        priorities.add(10);
        priorities.add(20);

        System.out.println("\n6. PriorityQueue:");

        while (!priorities.isEmpty()) {
            System.out.println(priorities.poll());
        }

        System.out.println("\nCollections demonstration completed.");
    }
}
