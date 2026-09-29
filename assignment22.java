import java.util.HashSet;

public class Main {

    public static int countDistinctAbsoluteValues(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(Math.abs(num));
        }

        return set.size();
    }

    public static void main(String[] args) {

        int[] arr = {-5, 5, -10, 10, 20, -5};

        System.out.println(countDistinctAbsoluteValues(arr));
    }
}
