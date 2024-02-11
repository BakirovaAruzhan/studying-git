    package Additional_task.ex6;
    import java.util.Scanner;


public class Solution {
        public int mostWordsFound(String[] sentences) {
            int maxWords = 0;

            for (String sentence : sentences) {
                String[] words = sentence.split(" ");

                maxWords = Math.max(maxWords, words.length);
            }

            return maxWords;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the number of sentences:");
            int numSentences = scanner.nextInt();
            scanner.nextLine();

            String[] sentences = new String[numSentences];

            System.out.println("Enter the sentences (separated by Enter):");
            for (int i = 0; i < numSentences; i++) {
                sentences[i] = scanner.nextLine();
            }

            int result = solution.mostWordsFound(sentences);
            System.out.println("Maximum Number of Words in a Sentence: " + result);

            scanner.close();
        }
    }
