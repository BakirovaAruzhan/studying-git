package Module3.Collections2.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        ArrayList<int[]> arraysList = new ArrayList<>();
        arraysList.add(new int[]{1, 2, 3, 4, 5});
        arraysList.add(new int[]{6, 7, 8, 9, 10});
        arraysList.add(new int[]{11, 12, 13, 14, 15});

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        boolean found = false;
        for (int[] array : arraysList) {
            for (int num : array) {
                if (num == x) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("есть такой .");
        } else {
            System.out.println("нет такого элемента.");
        }
    }
}
