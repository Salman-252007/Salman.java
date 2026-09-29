import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {

        // Create an ArrayList of tasks
        ArrayList<String> tasks = new ArrayList<>();

        // Adding tasks
        tasks.add("Study Java");
        tasks.add("Complete assignment");
        tasks.add("Go for a walk");

        System.out.println("Tasks after adding:");
        for (String task : tasks) {
            System.out.println(task);
        }

        // Removing a task
        tasks.remove("Go for a walk");

        System.out.println("\nTasks after removing:");
        for (String task : tasks) {
            System.out.println(task);
        }

        // Adding another task
        tasks.add("Practice coding");

        // Iterating using index
        System.out.println("\nFinal To-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}

Output
Tasks after adding:
Study Java
Complete assignment
Go for a walk

Tasks after removing:
Study Java
Complete assignment

Final To-Do List:
1. Study Java
2. Complete assignment
3. Practice coding

Important ArrayList methods

add() → adds a task

remove() → removes a task

get() → gets a task at a particular index

size() → returns the number of tasks

for-each loop → iterates through all tasks

For example:

tasks.add("Study Java");
tasks.remove("Study Java");
System.out.println(tasks.get(0));
System.out.println(tasks.size());


This is a good basic example of using the Java Collections Framework, specifically ArrayList.
