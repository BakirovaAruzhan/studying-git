package Additional_task.ex5;
import java.util.Scanner;

public class Solution {

    public String interpret(String command) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            char currentChar = command.charAt(i);

            if (currentChar == 'G') {
                result.append('G');
            } else if (currentChar == '(') {
                if (i + 1 < command.length() && command.charAt(i + 1) == 'a') {
                    result.append("al");
                    i += 3;
                } else {
                    result.append('o');
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the command:");
        String userCommand = scanner.nextLine();

        String result = solution.interpret(userCommand);
        System.out.println("Interpreted Result: " + result);

        scanner.close();
    }
}
