package Additional_task.ex3;
import java.util.Scanner;

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;

        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                X++;
            } else if (operation.equals("--X") || operation.equals("X--")) {
                X--;
            }
        }

        return X;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of operations:");
        int numOperations = scanner.nextInt();
        scanner.nextLine();

        String[] operations = new String[numOperations];

        System.out.println("Enter the operations (e.g., ++X, X--, X++, --X):");
        for (int i = 0; i < numOperations; i++) {
            operations[i] = scanner.nextLine();
        }

        int result = solution.finalValueAfterOperations(operations);
        System.out.println("Final Value of X: " + result);

        scanner.close();
    }
}
