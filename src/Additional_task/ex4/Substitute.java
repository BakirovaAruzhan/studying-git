package Additional_task.ex4;
import java.util.ArrayList;
import java.util.List;

class Substitute {
    public int[] findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                result.add(i);
            }
        }

        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }

        return output;
    }

    public static void main(String[] args) {
        Substitute substitute = new Substitute();

        String[] words1 = {"leet", "code"};
        char x1 = 'e';
        int[] result1 = substitute.findWordsContaining(words1, x1);
        System.out.println("Output 1: " + java.util.Arrays.toString(result1));

        String[] words2 = {"abc", "bcd", "aaaa", "cbc"};
        char x2 = 'a';
        int[] result2 = substitute.findWordsContaining(words2, x2);
        System.out.println("Output 2: " + java.util.Arrays.toString(result2));

        String[] words3 = {"abc", "bcd", "aaaa", "cbc"};
        char x3 = 'z';
        int[] result3 = substitute.findWordsContaining(words3, x3);
        System.out.println("Output 3: " + java.util.Arrays.toString(result3));
    }
}
