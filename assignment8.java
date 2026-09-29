public class SplitSentence {
    public static void main(String[] args) {

        String sentence = "Java is very easy";

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Display the words
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Rebuild the sentence in a new format
        String newSentence = String.join("-", words);

        System.out.println("New format: " + newSentence);
    }
}
