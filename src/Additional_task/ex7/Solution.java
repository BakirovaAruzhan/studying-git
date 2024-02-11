package Additional_task.ex7;
import java.util.Scanner;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String word : word1) {
            sb1.append(word);
        }

        for (String word : word2) {
            sb2.append(word);
        }

        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слова для word1 :");
        String[] word1 = scanner.nextLine().split(" ");

        System.out.println("Введите слова для word2 :");
        String[] word2 = scanner.nextLine().split(" ");

        boolean result = solution.arrayStringsAreEqual(word1, word2);
        System.out.println("Являются ли массивы эквивалентными? " + result);

        scanner.close();
    }
}
