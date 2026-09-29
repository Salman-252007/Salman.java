import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        HashSet<String> groups = new HashSet<>();

        for (String str : arr) {

            // Convert string to character array
            char[] chars = str.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Convert back to String
            String key = new String(chars);

            // Add to HashSet
            groups.add(key);
        }

        System.out.println("Number of anagram groups: " + groups.size());
    }
}
