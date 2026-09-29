import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // N = number of strings
        // M = length of each string
        int N = sc.nextInt();
        int M = sc.nextInt();

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {

            String str = sc.next();

            // Convert string to character array
            char[] ch = str.toCharArray();

            // Sort characters
            Arrays.sort(ch);

            // Sorted string is the anagram key
            String key = new String(ch);

            set.add(key);
        }

        System.out.println(set.size());

        sc.close();
    }
}
