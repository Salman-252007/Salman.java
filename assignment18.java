import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Original LinkedList:");
        System.out.println(list);

        // Accessing the first element
        System.out.println("\nFirst element: " + list.getFirst());

        // Accessing the last element
        System.out.println("Last element: " + list.getLast());

        // Accessing an element using index
        System.out.println("Element at index 2: " + list.get(2));

        // Removing the first element
        list.removeFirst();

        // Removing the last element
        list.removeLast();

        // Removing an element by value
        list.remove("Mango");

        System.out.println("\nLinkedList after removing elements:");
        System.out.println(list);

        // Adding elements at the beginning and end
        list.addFirst("Grapes");
        list.addLast("Pineapple");

        System.out.println("\nFinal LinkedList:");
        System.out.println(list);
    }
}
